package com.example.todolist.ui.theme

import android.util.Log
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.todolist.AppControl
import com.example.todolist.Card
import com.example.todolist.R
import kotlin.random.Random



val colorList = listOf<Color>(
    LightOrange , PinkRed ,LightGreen ,
    BlueGreen , LightBlue , DarkerBlue ,
    LightPink , LightPurple
)



@Composable
fun addCard(navController : NavHostController, cardList : MutableList<Card>) {

    var cardNumber by remember {
        mutableStateOf("")
    }
    var fullName by remember {
        mutableStateOf("")
    }
    var mm by remember {
        mutableStateOf("")
    }
    var yy by remember {
        mutableStateOf("")
    }
    var cvc by remember {
        mutableStateOf("")
    }
    var bankName by remember {
        mutableStateOf("")
    }

    Box(modifier = Modifier.fillMaxSize()
        .background(color = BlueDark)){

        Column(modifier = Modifier.fillMaxWidth()
            .padding(20.dp)){
            Box(modifier = Modifier.fillMaxWidth()
                .height(225.dp)
                .padding(top = 30.dp)
                .clip(RoundedCornerShape(6.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(LightPink , LightPurple)
                    )
                )){
                Column(modifier = Modifier.fillMaxSize()){
                    Column(modifier = Modifier.fillMaxSize() ,
                        verticalArrangement = Arrangement.Center ,
                        horizontalAlignment = Alignment.CenterHorizontally){

                        Box(modifier = Modifier.padding(start = 250.dp)
                            .offset(x = 0.dp, y = 20.dp)){
                            Text(text = "Card Number" , style =
                                TextStyle(
                                    fontFamily = FontFamily(Font(R.font.ocra)) ,
                                    fontWeight = FontWeight.Bold ,
                                    fontSize = 15.sp ,
                                    color = Color.Black
                                ))
                        }

                        Canvas(modifier = Modifier.fillMaxWidth()
                            .height(2.dp)) {

                            drawLine(
                                color = Color.Black ,
                                start = Offset(700f, 160f),
                                end = Offset(870f, 75f),
                                strokeWidth = 2.dp.toPx()
                            )
                        }
                        Text(text = "5406 1600 0000 0003" ,
                            style = TextStyle(
                                fontFamily = FontFamily(Font(R.font.ocra)) ,
                                fontWeight = FontWeight.Bold ,
                                fontSize = 20.sp ,
                                color = Color.White
                            ) ,
                            modifier = Modifier.padding(top = 50.dp)
                        )
                        Spacer(modifier = Modifier.height(20.dp))
                        Text(modifier = Modifier.padding(bottom = 30.dp),text = "00/00" ,
                            style = TextStyle(
                                fontFamily = FontFamily(Font(R.font.ocra)) ,
                                fontWeight = FontWeight.Bold ,
                                fontSize = 15.sp ,
                                color = Color.White
                            )
                        )
                        Box(modifier = Modifier.fillMaxWidth().padding(start = 50.dp)){
                            Row(){
                                Text(modifier = Modifier.padding(bottom = 30.dp),text = "YERBOL ZHAKSYLYK" ,
                                    style = TextStyle(
                                        fontFamily = FontFamily(Font(R.font.ocra)) ,
                                        fontWeight = FontWeight.Bold ,
                                        fontSize = 15.sp ,
                                        color = Color.White
                                    )
                                )
                                Text(modifier = Modifier.padding(bottom = 30.dp , start = 10.dp),text = "Expiration Date" ,
                                    style = TextStyle(
                                        fontFamily = FontFamily(Font(R.font.ocra)) ,
                                        fontWeight = FontWeight.Bold ,
                                        fontSize = 13.sp ,
                                        color = Color.Black
                                    )
                                )
                            }

                        }

                        Canvas(modifier = Modifier.fillMaxWidth()
                            .height(2.dp)) {

                            drawLine(
                                color = Color.Black ,
                                start = Offset(760f, -260f),
                                end = Offset(880f, -200f),
                                strokeWidth = 2.dp.toPx()
                            )
                        }



                    }

                }



            }
            Box(modifier = Modifier.fillMaxWidth()
                .height(225.dp)
                .padding(top = 30.dp)
                .clip(RoundedCornerShape(6.dp))
                .background(
                    brush = Brush.horizontalGradient(
                        colors = listOf(LightPink , LightPurple)
                    )
                )){
                Column{
                    Box(modifier = Modifier.fillMaxWidth().padding(top = 20.dp)
                        .height(50.dp)
                        .background(color = Color.Black)){

                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Box(modifier = Modifier
                        .padding(start = 150.dp)
                        .width(150.dp)
                        .height(30.dp)
                        .background(color = Color.White) ,
                        contentAlignment = Alignment.Center){

                        Text(text = "555" ,
                            style = TextStyle(
                                fontFamily = FontFamily(Font(R.font.ocra)) ,
                                fontWeight = FontWeight.Bold ,
                                fontSize = 12.sp ,
                                color = Color.Black
                            )
                        )
                    }
                    Canvas(modifier = Modifier.fillMaxWidth()
                        .height(2.dp)) {

                        drawLine(
                            color = Color.Black ,
                            start = Offset(820f, -20f),
                            end = Offset(950f, 100f),
                            strokeWidth = 2.dp.toPx()
                        )
                    }
                    Text(text = "CVV" ,
                        style = TextStyle(
                            fontFamily = FontFamily(Font(R.font.ocra)) ,
                            fontWeight = FontWeight.Bold ,
                            fontSize = 15.sp ,
                            color = Color.Black
                        ) ,
                        modifier = Modifier.offset(270.dp  , 30.dp)
                    )
                }

            }

            Spacer(modifier = Modifier.height(50.dp))

            Column(modifier = Modifier.fillMaxWidth()){
                Row{
                    Text(text = "Card number" , style =
                    TextStyle(
                        fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                        fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp ,
                        color = Color.White
                    ) ,
                        modifier = Modifier.padding(end = 10.dp)
                    )
                    Box(modifier = Modifier.clip(RoundedCornerShape(6.dp)).background(Color.White)
                        .height(25.dp)
                        .fillMaxWidth()
                        .padding(start = 4.dp)){
                        BasicTextField(
                            value = cardNumber ,
                            onValueChange = {newText ->
                                if(newText.all { it.isDigit() } && newText.length <= 12){
                                    cardNumber = newText
                                }
                            },
                            modifier = Modifier.fillMaxWidth().padding(start = 4.dp , top = 4.dp)
                                .height(25.dp),
                            textStyle = TextStyle(fontSize = 14.sp),
                            singleLine = true
                        )
                    }


                }
                Spacer(modifier = Modifier.height(10.dp))
                Row{
                    Text(text = "Full name" , style =
                    TextStyle(
                        fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                        fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp ,
                        color = Color.White
                    ) ,
                        modifier = Modifier.padding(end = 39.dp)
                    )
                    Box(modifier = Modifier.clip(RoundedCornerShape(6.dp)).background(Color.White)
                        .height(25.dp)
                        .fillMaxWidth()
                        .padding(start = 4.dp)){
                        BasicTextField(
                            value = fullName ,
                            onValueChange = {newText ->
                                if (!newText.all { it.isDigit() } || newText.isEmpty()){
                                    fullName = newText
                                }
                            },
                            modifier = Modifier.fillMaxWidth().padding(start = 4.dp , top = 4.dp)
                                .height(25.dp),
                            textStyle = TextStyle(fontSize = 14.sp),
                            singleLine = true
                        )
                    }


                }
                Spacer(modifier = Modifier.height(10.dp))
                Row{
                    Text(text = "MM/YY" , style =
                    TextStyle(
                        fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                        fontWeight = FontWeight.Bold ,
                        fontSize = 20.sp ,
                        color = Color.White
                    ) ,
                        modifier = Modifier.padding(end = 64.dp)
                    )
                    Box(modifier = Modifier.clip(RoundedCornerShape(6.dp)).background(Color.White)
                        .height(25.dp)
                        .width(35.dp)
                        .padding(start = 4.dp)){
                        BasicTextField(
                            value = mm ,
                            onValueChange = {newText ->
                                if (newText.all { it.isDigit() } && newText.length <= 2){
                                    mm = newText
                                }
                            },
                            modifier = Modifier.padding(start = 4.dp , top = 4.dp).width(20.dp)
                                .height(25.dp),
                            textStyle = TextStyle(fontSize = 14.sp),
                            singleLine = true
                        )
                    }
                    Text(text = "/" , style = TextStyle(
                        color = Color.White ,
                        fontSize = 23.sp
                    ),
                        modifier = Modifier.padding(start = 5.dp , end = 5.dp)
                    )
                    Box(modifier = Modifier.clip(RoundedCornerShape(6.dp)).background(Color.White)
                        .height(25.dp)
                        .width(35.dp)
                        .padding(start = 4.dp)){
                        BasicTextField(
                            value = yy ,
                            onValueChange = {newText ->
                                if (newText.all { it.isDigit() } && newText.length <= 2){
                                    yy = newText
                                }
                            },
                            modifier = Modifier.padding(start = 4.dp , top = 4.dp).width(20.dp)
                                .height(25.dp),
                            textStyle = TextStyle(fontSize = 14.sp),
                            singleLine = true
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    Text(
                        text = "CVC", style =
                        TextStyle(
                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.White
                        ),
                        modifier = Modifier.padding(end = 89.dp)
                    )
                    Box(
                        modifier = Modifier.clip(RoundedCornerShape(6.dp))
                            .background(Color.White)
                            .height(25.dp)
                            .width(45.dp)
                            .padding(start = 4.dp)
                    ) {
                        BasicTextField(
                            value = cvc,
                            onValueChange = { newText ->
                                if (newText.all { it.isDigit() } && newText.length <= 3) {
                                    cvc = newText
                                }
                            },
                            modifier = Modifier.padding(start = 4.dp, top = 4.dp).width(45.dp)
                                .height(25.dp),
                            textStyle = TextStyle(fontSize = 14.sp),
                            singleLine = true
                        )
                    }
                }
                Spacer(modifier = Modifier.height(10.dp))
                Row {
                    Text(
                        text = "Bank name", style =
                        TextStyle(
                            fontFamily = FontFamily(Font(R.font.nunito_bold)),
                            fontWeight = FontWeight.Bold,
                            fontSize = 20.sp,
                            color = Color.White
                        ),
                        modifier = Modifier.padding(end = 27.dp)
                    )
                    Box(
                        modifier = Modifier.clip(RoundedCornerShape(6.dp))
                            .background(Color.White)
                            .height(25.dp)
                            .fillMaxWidth()
                            .padding(start = 4.dp)
                    ) {
                        BasicTextField(
                            value = bankName,
                            onValueChange = { newText ->
                                if ((!newText.all { it.isDigit() } || newText.isEmpty())  && newText.length <= 12) {
                                    bankName = newText
                                }
                            },
                            modifier = Modifier.padding(start = 4.dp, top = 4.dp).fillMaxWidth()
                                .height(25.dp),
                            textStyle = TextStyle(fontSize = 14.sp),
                            singleLine = true
                        )
                    }
                }


            }
            Box(modifier = Modifier.fillMaxSize().padding(bottom = 50.dp),
                contentAlignment = Alignment.Center,){
                Button(onClick = {
                    if(!(bankName.isBlank() || cvc.isBlank() || yy.isBlank() || mm.isBlank()
                        || fullName.isBlank() || cardNumber.isBlank())){

                        var newCard =
                            Card(
                                sign = R.drawable.visa_icon ,
                                bank_name = bankName ,
                                card_number_start = cardNumber ,
                                card_number_end = "1234",
                                start_color = colorList[Random.nextInt(0,8)],
                                end_color = colorList[Random.nextInt(0,8)],
                                mm = mm ,
                                yy = yy
                            )

                        cardList.add(newCard)


                        navController.navigate("main")
                    }

                }) {
                    Text(text = "ADD")
                }
            }
        }
    }
}