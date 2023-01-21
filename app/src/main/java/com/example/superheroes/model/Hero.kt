package com.example.superheroes.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Hero(
    @DrawableRes val heroImg: Int,
    @StringRes val heroName: Int,
    @StringRes val heroDesc: Int
)
