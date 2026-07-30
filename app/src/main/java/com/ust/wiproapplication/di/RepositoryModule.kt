package com.ust.wiproapplication.di

import com.ust.wiproapplication.data.repository.PostRepositoryImpl
import com.ust.wiproapplication.domain.repository.PostRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindPostRepository(
        repositoryImpl: PostRepositoryImpl
    ): PostRepository

}