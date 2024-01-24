package com.sagarannaldas.moderndiaryapp.di

import com.sagarannaldas.moderndiaryapp.auth.data.AuthRepository
import com.sagarannaldas.moderndiaryapp.auth.data.AuthRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent


@InstallIn(ViewModelComponent::class)
@Module
object AuthModule {

    @Provides
    fun provideAuthRepository( impl: AuthRepositoryImpl): AuthRepository = impl
}