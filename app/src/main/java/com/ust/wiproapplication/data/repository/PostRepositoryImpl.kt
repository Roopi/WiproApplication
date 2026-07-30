package com.ust.wiproapplication.data.repository

import com.ust.wiproapplication.core.network.ApiService
import com.ust.wiproapplication.data.mapper.toDomain
import com.ust.wiproapplication.domain.model.Post
import com.ust.wiproapplication.domain.repository.PostRepository
import javax.inject.Inject

class PostRepositoryImpl @Inject constructor(
    private val api: ApiService
) : PostRepository {

    override suspend fun getPosts(): List<Post> {

        return api
            .getPosts()
            .map { it.toDomain() }

    }
}