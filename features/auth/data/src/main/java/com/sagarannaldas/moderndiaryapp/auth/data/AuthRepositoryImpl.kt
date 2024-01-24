package com.sagarannaldas.moderndiaryapp.auth.data

import com.sagarannaldas.moderndiaryapp.network.NetworkResult
import com.sagarannaldas.moderndiaryapp.network.RequestHandler
import com.sagarannaldas.moderndiaryapp.network.Response
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val  requestHandler: RequestHandler
): AuthRepository {
    override suspend fun login(request: UserLoginRequest): NetworkResult<Response<UserApiModel>> {
        return requestHandler.post(
            urlPathSegments = listOf("auth", "login"),
            body = request 
        )
    }
}