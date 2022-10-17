package com.example.layout_demo.ui.layout

import android.content.Context
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

/**
 * @createTime: 2022/10/16
 * @author: lady_zhou
 * @Description:
 */
@OptIn(ExperimentalMaterialApi::class)
@Composable
fun WeixinDemo(context: Context) {

    Box(Modifier.fillMaxHeight(), contentAlignment = Alignment.BottomEnd) {
        Column {
            TopView(context)
            Divider()
            LazyColumn(
                contentPadding = PaddingValues(4.dp),
                verticalArrangement = Arrangement.spacedBy(4.dp)
            ) {
                items(15) { index ->
                    Item(index)
                }
            }

        }

        Bottom()
    }
}
