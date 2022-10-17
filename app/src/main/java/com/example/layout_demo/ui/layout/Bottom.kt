package com.example.layout_demo.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout_demo.R

/**
 * @createTime: 2022/10/17
 * @author: lady_zhou
 * @Description:
 */
@Composable
fun Bottom() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(Color(0xFFFFFFFF))
            .height(60.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        IconButton(
            onClick = { /*TODO*/ }
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.wechat),
                    "图标",
                    tint = Color(0xFF57BE6B)
                )
                Text(text = "微信", color = colorResource(id = R.color.green), fontSize = 10.sp)
            }

        }
        IconButton(
            onClick = { /*TODO*/ },
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(painter = painterResource(id = R.drawable.tongxunlu), null)
                Text(text = "通讯录", fontSize = 10.sp)
            }
        }
        IconButton(
            onClick = { /*TODO*/ },
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(painter = painterResource(id = R.drawable.find), null)
                Text(text = "发现", fontSize = 10.sp)
            }
        }
        IconButton(
            onClick = { /*TODO*/ },
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Icon(painter = painterResource(id = R.drawable.mine), null)
                Text(text = "我的", fontSize = 10.sp)
            }
        }
    }


}