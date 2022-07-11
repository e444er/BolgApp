package com.e444er.data.repository

import com.e444er.data.mappers.toDomain
import com.e444er.data.network.utils.ApiService
import com.e444er.data.network.utils.SafeApiRequest
import com.e444er.domain.model.Blog
import com.e444er.domain.repository.GetBlogsRepository
import javax.inject.Inject

class GetBlogsRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : GetBlogsRepository, SafeApiRequest() {

    override suspend fun getBlogs(): List<Blog> {
        val response = safeApiRequest { apiService.getBlogs() }
        return response.data?.toDomain() ?: emptyList()
    }
}