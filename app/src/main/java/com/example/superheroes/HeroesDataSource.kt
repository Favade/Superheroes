package com.example.superheroes

import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*


import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.input.key.Key.Companion.H
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.superheroes.model.Hero
import com.example.superheroes.model.HeroesRepository
import com.example.superheroes.ui.theme.SuperheroesTheme

@Composable
fun HeroesApp() {
    HeroesList(hero = HeroesRepository.heroes)
}


@Composable
fun HeroesList(hero: List<Hero>) {
    Scaffold(
        topBar =  {
            SuperHeroesTopBar()
        },
        content = {PaddingValues ->
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(8.dp),
                modifier = Modifier
                    .padding(PaddingValues(horizontal = 16.dp))
                    .background(MaterialTheme.colors.background)
            ){
                items(hero) {
                    HeroListItem(hero = it)
                }
            }

        }
    )

}


@Composable
fun HeroListItem(
    hero: Hero,
    modifier: Modifier = Modifier
) {
    Card(
        elevation = 2.dp,
        modifier = Modifier.clip(MaterialTheme.shapes.medium)
    ) {
        Row(
            modifier = modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(modifier = Modifier
                .padding(start = 16.dp)
                .weight(2f)) {
                Text(
                    text = stringResource(hero.heroName),
                    style =  MaterialTheme.typography.h3,
                    modifier = Modifier.padding(top = 16.dp)
                )
                Text(
                    text = stringResource(hero.heroDesc),
                    style = MaterialTheme.typography.body1,
                    modifier = Modifier.padding(bottom = 16.dp)
                )
            }
            Box {
                Image(
                    painter = painterResource(hero.heroImg),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .padding(start = 16.dp, end = 16.dp)
                        .clip(MaterialTheme.shapes.small)
                        .size(75.dp)
                        .aspectRatio(1f)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HeroPreview() {
    SuperheroesTheme() {
        HeroesApp()
    }
}

@Preview(showBackground = true)
@Composable
fun DarkThemeSuperheroes() {
    SuperheroesTheme(darkTheme = true) {
        HeroesApp()
    }
}


