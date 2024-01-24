package com.sagarannaldas.moderndiaryapp.auth.domain

interface Mapper<F, T> {
    fun map(from: F): T
}