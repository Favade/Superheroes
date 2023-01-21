package com.example.superheroes.model

import com.example.superheroes.R

object HeroesRepository {
     val heroes = listOf<Hero>(
         Hero(
             R.drawable.android_superhero1,
             R.string.nightshade,
             R.string.nightshadedesc
         ),
         Hero(
             R.drawable.android_superhero2,
             R.string.crimsoncoment,
             R.string.crimsoncomentDesc
         ),
         Hero(
             R.drawable.android_superhero3,
             R.string.bluestreak,
             R.string.bluestreakdesc
         ),
         Hero(
             R.drawable.android_superhero4,
             R.string.silversentinel,
             R.string.silversentineldesc
         ),
         Hero(
             R.drawable.android_superhero5,
             R.string.greenguardian,
             R.string.greenguardiandesc
         ),
         Hero(
             R.drawable.android_superhero6,
             R.string.goldenavenger,
             R.string.goldenavengerdesc
         )
     )
}