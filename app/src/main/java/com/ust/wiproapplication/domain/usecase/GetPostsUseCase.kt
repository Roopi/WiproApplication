package com.ust.wiproapplication.domain.usecase

import com.ust.wiproapplication.domain.model.Post
import com.ust.wiproapplication.domain.repository.PostRepository
import javax.inject.Inject

class GetPostsUseCase @Inject constructor(
    private val repository: PostRepository
) {

    suspend operator fun invoke(): List<Post> {
        return repository.getPosts()
    }
}