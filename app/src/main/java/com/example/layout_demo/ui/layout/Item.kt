package com.example.layout_demo.ui.layout

import android.graphics.Color
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.layout_demo.R

/**
 * @createTime: 2022/10/16
 * @author: lady_zhou
 * @Description:
 */
@Composable
fun Item(index: Int) {
    Row(modifier = Modifier.padding(10.dp)) {
        Image(
            painter = painterResource(id = R.drawable.pic1),
//            contentDescription = stringResource(R.string.app_name),
            contentDescription = null,
            modifier = Modifier
                .size(80.dp, 80.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentScale = ContentScale.Crop,
        )

        Column(modifier = Modifier.fillMaxHeight()) {

            Row(Modifier.fillMaxWidth()) {


                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .padding(start = 16.dp, top = 8.dp)
                        .weight(3f),
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "Compose学习群$index",
                        fontSize = 16.sp
                    )
                    Spacer(Modifier.padding(vertical = 4.dp))

                    Text(
                        text = "我们一起学 compose"
                    )

                }

                Text(
                    text = "22:00",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 12.dp, top = 12.dp, end = 12.dp)
                        .weight(1f),
                    textAlign = TextAlign.End
                )
            }
            Spacer(Modifier.padding(vertical = 10.dp))
            Divider(Modifier.padding(start = 16.dp, end = 12.dp))
        }
    }
}