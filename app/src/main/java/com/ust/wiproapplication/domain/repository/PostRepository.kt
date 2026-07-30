package com.ust.wiproapplication.domain.repository

import com.ust.wiproapplication.domain.model.Post

interface PostRepository {

    suspend fun getPosts(): List<Post>

}