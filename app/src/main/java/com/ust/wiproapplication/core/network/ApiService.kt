package com.ust.wiproapplication.core.network

import com.ust.wiproapplication.data.remote.dto.PostDto
import retrofit2.http.GET

interface ApiService {

    @GET("posts")
    suspend fun getPosts(): List<PostDto>
}