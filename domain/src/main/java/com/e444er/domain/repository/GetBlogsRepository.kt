package com.e444er.domain.repository

import com.e444er.domain.model.Blog

interface GetBlogsRepository {

    suspend fun getBlogs(): List<Blog>

}