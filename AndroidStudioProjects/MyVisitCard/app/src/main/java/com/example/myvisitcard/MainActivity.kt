package com.example.myvisitcard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myvisitcard.ui.theme.MyVisitCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyVisitCardTheme {
                BusinessCardScreen()
            }
        }
    }
}

@Composable
fun BusinessCardScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(Color(0xFFF0F2F5))
                .padding(paddingValues)
                .padding(24.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Центральная часть
            Column(
                modifier = Modifier.weight(1f),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.android),
                    contentDescription = "Android Logo",
                    modifier = Modifier
                        .size(120.dp)
                        .padding(bottom = 16.dp)
                )

                Text(
                    text = "Grigoriy Umanets",
                    fontSize = 36.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFF1A1A1A)
                )

                Text(
                    text = "Android Developer Extraordinaire",
                    fontSize = 20.sp,
                    color = Color(0xFF018786),
                    fontWeight = FontWeight.Medium
                )
            }
                Column(
                    modifier = Modifier.padding(24.dp)
                ) {
                    // Телефон
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "📞",
                            fontSize = 24.sp,
                            modifier = Modifier.width(40.dp)
                        )
                        Text(
                            text = "+7 995 915 78 73",
                            fontSize = 16.sp,
                            color = Color(0xFF333333)
                        )
                    }

                    // Социальная сеть
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "📍",
                            fontSize = 24.sp,
                            modifier = Modifier.width(40.dp)
                        )
                        Text(
                            text = "@HeI3uJl",
                            fontSize = 16.sp,
                            color = Color(0xFF333333)
                        )
                    }

                    // Email
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp),
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "✉️",
                            fontSize = 24.sp,
                            modifier = Modifier.width(40.dp)
                        )
                        Text(
                            text = "grisha.umanets@gmail.com",
                            fontSize = 16.sp,
                            color = Color(0xFF333333)
                        )
                    }
                }
            }
        }
    }












@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MyVisitCardTheme {
        BusinessCardScreen()
    }
}

