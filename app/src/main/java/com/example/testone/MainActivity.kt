package com.example.testone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testone.ui.theme.TestOneTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            TestOneTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ArticlePage(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ArticlePage(modifier: Modifier = Modifier) {
    ArticleCard(
        heading = stringResource(R.string.article_heading),
        summary = stringResource(R.string.article_summary),
        tutorial = stringResource(R.string.article_tutorial),
        image = painterResource(R.drawable.bg_compose_background),
        modifier = modifier
    )
}


@Composable
fun ArticleCard(
    modifier: Modifier = Modifier,
    heading: String,
    summary: String,
    tutorial: String,
    image: Painter
) {
    Column(modifier = modifier) {
        Image(
            painter = image,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
        )
        Text(
            text = heading,
            fontSize = 24.sp,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = summary,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp),
            textAlign = TextAlign.Justify,
        )
        Text(
            text = tutorial,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Justify,
        )
    }
}