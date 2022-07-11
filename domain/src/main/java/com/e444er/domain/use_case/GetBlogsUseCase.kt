package com.e444er.domain.use_case

import com.e444er.common.Resource
import com.e444er.domain.model.Blog
import com.e444er.domain.repository.GetBlogsRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class GetBlogsUseCase @Inject constructor(
    private val getBlogsRepository: GetBlogsRepository
) {

    operator fun invoke(): Flow<Resource<List<Blog>>> = flow {
        emit(Resource.Loading(null))
        try {
            val response = getBlogsRepository.getBlogs()
            emit(Resource.Success(data = response))
        } catch (e: Exception) {
            emit(Resource.Error("error occurred"))
        }
    }
}