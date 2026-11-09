package com.example.gametime.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.gametime.R
import androidx.compose.ui.tooling.preview.Preview
import com.example.gametime.ui.theme.PoppinsFontFamily

@Preview(showBackground = true, showSystemUi = true)


@Composable
fun Onboarding_1PR() {
    // Здесь вызываем твою функцию экрана, чтобы Студия её отрисовала
    Onboarding_1()
}
@Composable
fun Onboarding_1(){
    Column(
        modifier = Modifier.fillMaxSize()

    ){

        Box(
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.image),
                contentDescription = null,
                modifier = Modifier
                    .align(Alignment.CenterEnd)
                    .padding(top = 164.dp, start = 48.dp)
                    .size(width = 327.dp, height = 232.dp),
                contentScale = ContentScale.Fit
            )
        }

        Text(
            "Get Paid! Playing Video Game",
            color = Color(0xFFFA5075),
            fontSize = 24.sp,
            fontFamily = PoppinsFontFamily,
            fontWeight = FontWeight(700),
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 35.dp, start = 76.dp, end = 75.dp)

        )

        Text(
            "Earn points and real cash when you win a battle with no delay in cashing out",
            fontSize = 14.sp,
            fontFamily = PoppinsFontFamily,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight(400),
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 36.dp, start = 76.dp, end = 75.dp)


        )

        TextButton(
            onClick = {},
            modifier = Modifier
                .align(Alignment.CenterHorizontally)
                .padding(top = 63.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color.Transparent)

        ) {
            Text(
                "Skip",
                color = Color(0xFFFA5075),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                textDecoration = TextDecoration.Underline
            )
        }

        Row(
            modifier = Modifier
                .padding(top = 71.dp, bottom = 45.dp)
                .align(Alignment.CenterHorizontally),
            horizontalArrangement = Arrangement.spacedBy((8.dp))
        ) {
            Box(
                modifier = Modifier
                    .size(10.dp)
                    .clip(CircleShape)
                    .background(Color(0xFFFA5075))
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
                    .background(Color(0xFFFFD1DC))
            )
        }




    }

}