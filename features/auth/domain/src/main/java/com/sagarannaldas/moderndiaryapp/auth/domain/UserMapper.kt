package com.sagarannaldas.moderndiaryapp.auth.domain

import com.sagarannaldas.moderndiaryapp.auth.data.UserApiModel
import javax.inject.Inject

class UserMapper @Inject constructor() : Mapper<UserApiModel, User> {
    override fun map(from: UserApiModel): User =
        User(
            avatar = from.avatar,
            email = from.email,
            createdAt = from.createdAt,
            fullName = from.fullName,
            id = from.id,
        )
}