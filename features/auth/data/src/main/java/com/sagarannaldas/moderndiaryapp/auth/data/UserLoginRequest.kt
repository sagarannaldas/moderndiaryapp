package com.sagarannaldas.moderndiaryapp.auth.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@SerialName("UserLoginRequest")
@Serializable
data class UserLoginRequest(
    val email: String,
    val password: String
)