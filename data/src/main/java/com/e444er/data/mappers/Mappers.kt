package com.e444er.data.mappers

import com.e444er.data.network.model.BlogDTO
import com.e444er.data.network.model.OwnerDTO
import com.e444er.domain.model.Blog
import com.e444er.domain.model.Owner

fun List<BlogDTO>.toDomain(): List<Blog> {

    return map {
        Blog(
            id = it.id?: "",
            image = it.image?: "",
            likes = it.likes?: 0,
            owner = it.owner?.toDomain()?: Owner("","","","","",),
            publishDate = it.publishDate?: "",
            tags = it.tags?: emptyList(),
            text = it.text?: "",
        )
    }
}

fun OwnerDTO.toDomain(): Owner {
    return Owner(
        firstName, id, lastName, picture, title
    )
}
