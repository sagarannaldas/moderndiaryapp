package com.sagarannaldas.moderndiaryapp.di

import com.sagarannaldas.moderndiaryapp.BuildConfig
import com.sagarannaldas.moderndiaryapp.network.ModernDiaryAppHttpClientBuilder
import com.sagarannaldas.moderndiaryapp.network.RequestHandler
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.http.URLProtocol

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideHttpClient(): HttpClient =
        ModernDiaryAppHttpClientBuilder()
            .protocol(URLProtocol.HTTP)
            .host(BuildConfig.MODERN_APP_HOST)
            .port(8080)
            .build()

    @Provides
    fun provideRequestHandler(client: HttpClient) = RequestHandler(client)
}