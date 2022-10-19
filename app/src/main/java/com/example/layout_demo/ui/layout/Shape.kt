package com.example.layout_demo.ui.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.size
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.dp

/**
 * @createTime: 2022/10/19
 * @author: lady_zhou
 * @Description:
 */
@Composable
fun ShapeDemo() {
    Text(
        text = "Shape", modifier = Modifier
            .size(800.dp, 800.dp)
            .clip(getShape())
            .background(Color.Red)
    )
}

fun getShape() = object : Shape{
    override fun createOutline(
        size: Size,
        layoutDirection: LayoutDirection,
        density: Density
    ): Outline {
        val path = Path()
        path.moveTo(100f,0f)
        path.lineTo(400f,0f)
        path.lineTo(500f,300f)
        path.lineTo(0f,300f)
        path.close()
        return  Outline.Generic(path)

    }

}