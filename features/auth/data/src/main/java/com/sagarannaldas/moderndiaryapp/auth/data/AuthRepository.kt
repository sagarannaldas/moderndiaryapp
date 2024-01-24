package com.sagarannaldas.moderndiaryapp.auth.data

import com.sagarannaldas.moderndiaryapp.network.NetworkResult
import com.sagarannaldas.moderndiaryapp.network.Response

interface AuthRepository {
    suspend fun login(request: UserLoginRequest): NetworkResult<Response<UserApiModel>>
}