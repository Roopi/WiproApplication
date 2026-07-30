package com.ust.wiproapplication.presentation.home

import com.ust.wiproapplication.domain.model.Post

data class HomeUiState(

    val isLoading: Boolean = false,

    val posts: List<Post> = emptyList(),

    val error: String? = null

)