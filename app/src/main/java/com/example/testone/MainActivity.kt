package com.example.testone

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
        heading = "All task completed",
        summary = "Nice Work",
        image = painterResource(R.drawable.ic_task_completed),
        modifier = modifier
    )
}


@Composable
fun ArticleCard(
    modifier: Modifier = Modifier,
    heading: String,
    summary: String,
    image: Painter
) {
    Column(modifier = modifier.fillMaxHeight().fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
        ) {
        Image(
            painter = image,
            contentDescription = null,
        )
        Text(
            text = heading,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 24.dp,  bottom = 8.dp),
        )
        Text(
            text = summary,
            fontSize = 16.sp,
        )
    }
}