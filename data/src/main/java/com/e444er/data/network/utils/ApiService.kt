package com.e444er.data.network.utils

import com.e444er.common.Constant
import com.e444er.data.network.model.BlogsDTO
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header

interface ApiService {

    @GET("post")
    suspend fun getBlogs(
        @Header("app-id") appId: String = Constant.APP_ID
    ): Response<BlogsDTO>
}