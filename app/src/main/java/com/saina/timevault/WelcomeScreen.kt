package com.saina.timevault
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.Modifier

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.saina.timevault.ui.theme.MediumPurple

@Composable
fun WelcomeScreen(modifier: Modifier= Modifier,
                   ) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(MediumPurple)
            .padding(24.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center

        ) {
            Text(
                text = "Welcome To Time Vault ",
                fontSize = 30.sp,
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.White
                )
            Spacer(modifier = Modifier.height(80.dp))

            Text(
                text = " Are You Ready To Control Your Time ? ",
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                color = Color.White

                )
            Spacer(modifier = Modifier.height(118.dp))

            Button(

                shape = RoundedCornerShape(16.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = MediumPurple,
                    ),
                modifier =Modifier.padding(bottom = 32.dp)
                    .height(46.dp)
                    .fillMaxSize()
                ,

                onClick = {}
                ) {
                Text(
                    text = "Get Started",
                    fontSize = 20.sp,
                    )
            }

        }
    }
}