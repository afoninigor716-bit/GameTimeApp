package com.example.gametime.Obort

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gametime.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.gametime.ui.theme.PoppinsFontFamily

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun Onboarding_3PR() {

    Onboarding_3()
}
@Composable
fun Onboarding_3() {
    Column(
        modifier = Modifier.fillMaxSize()

    ) {

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.image_2),
                contentDescription = null,
                modifier = Modifier
//                    .align(Alignment.CenterEnd)
                    .padding(top = 144.dp, start = 30.dp, end = 29.dp)
                    .size(width = 316.dp, height = 294.dp),
                contentScale = ContentScale.Fit
            )
        }

        Text(
            "Text, Audio and Video Chat",
            color = Color(0xFFFA5075),
            fontSize = 24.sp,
            fontFamily = PoppinsFontFamily,
            fontWeight = FontWeight(700),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 0.dp, start = 76.dp, end = 75.dp)


        )

        Text(
            "Intuitive real life experience on mobile. Chat with fellow gamers before and after combat for free!",
            fontSize = 14.sp,
            fontFamily = PoppinsFontFamily,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(400),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 36.dp, start = 76.dp, end = 75.dp)


        )

        val ButtonGradient = Brush.linearGradient(
            colors = listOf(
                Color(0xFFFF6480),
                Color(0xFFF22E63)
            )
        )



        Button(
            onClick = { },
            shape = CircleShape,
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent

            ),
            contentPadding = PaddingValues(0.dp),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 38.dp, start = 76.dp, end = 75.dp)
                .size(width = 224.dp, height = 58.dp)
        ) {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .clip(CircleShape)
                    .background(ButtonGradient)
                    .padding(vertical = 16.dp),
                contentAlignment = Alignment.Center,

            ){
                Text(
                    text = "Let's Combat!",
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Bold
                )
            }

        }

        Row(
            modifier = Modifier
                .padding(top = 38.dp, bottom = 45.dp)
                .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.spacedBy((8.dp))
        ) {

            Box(
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFFD1DC))
            )
            Box(
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFFD1DC))
            )
            Box(
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFA5075))
            )
        }


    }
}
