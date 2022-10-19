package com.example.layout_demo

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.layout_demo.ui.layout.ShapeDemo
import com.example.layout_demo.ui.layout.WeixinDemo
import com.example.layout_demo.ui.theme.Layout_demoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
//           WeixinDemo(this)
            ShapeDemo()
        }
    }
}

@Preview()
@Composable
fun DefaultPreview() {
    WeixinDemo(ComponentActivity())
}