package com.ust.wiproapplication.presentation.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.ust.wiproapplication.domain.usecase.GetPostsUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val getPostsUseCase: GetPostsUseCase
) : ViewModel() {

    private val _uiState = MutableStateFlow(HomeUiState())

    val uiState: StateFlow<HomeUiState> =
        _uiState.asStateFlow()

    init {
        getPosts()
    }

    private fun getPosts() {

        viewModelScope.launch {

            _uiState.value = HomeUiState(isLoading = true)

            try {

                val posts = getPostsUseCase()

                _uiState.value = HomeUiState(
                    posts = posts
                )

            } catch (e: Exception) {

                _uiState.value = HomeUiState(
                    error = e.message
                )

            }

        }

    }
}