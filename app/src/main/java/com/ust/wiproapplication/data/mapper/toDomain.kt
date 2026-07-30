package com.ust.wiproapplication.data.mapper

import com.ust.wiproapplication.data.remote.dto.PostDto
import com.ust.wiproapplication.domain.model.Post

fun PostDto.toDomain(): Post {

    return Post(
        id = id,
        title = title,
        body = body
    )

}