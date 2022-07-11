package com.e444er.domain.di

import com.e444er.domain.repository.GetBlogsRepository
import com.e444er.domain.use_case.GetBlogsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {

    @Provides
    fun getBlogsUseCase(repository: GetBlogsRepository): GetBlogsUseCase{
        return GetBlogsUseCase(repository)
    }
}