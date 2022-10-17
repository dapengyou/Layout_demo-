package com.example.layout_demo.ui.layout

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout_demo.R

/**
 * @createTime: 2022/10/17
 * @author: lady_zhou
 * @Description:
 */
@Composable
fun TopView(context: Context) {
    Row(
        Modifier
            .background(Color(0x333333))
            .fillMaxWidth()
            .height(60.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Center
    ) {

        Text(
            text = "微信(3)",
            fontSize = 18.sp,
            modifier = Modifier
                .weight(4f)
                .fillMaxWidth()
                .padding(start = 16.dp),
            textAlign = TextAlign.Center
        )
        IconButton(

            onClick = { Toast.makeText(context, "添加", Toast.LENGTH_SHORT).show() },
        ) {
            Icon(painter = painterResource(id = R.drawable.add), null)

        }
    }
}

