package com.example.todolist.ui.theme


import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.Modifier
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.DrawerState
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todolist.AppControl
import com.example.todolist.Card
import com.example.todolist.R
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch





@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(navController: NavHostController , drawerState: DrawerState , scope: CoroutineScope ,
               cardList : List<Card>) {
    val scope = rememberCoroutineScope()
    val list = listOf(
        Card(
            sign = R.drawable.circles ,
            bank_name = "THE CITY BANK" ,
            card_number_start = "********" ,
            card_number_end = "9009" ,
            start_color = LightOrange ,
            end_color = PinkRed
        ) ,
        Card(
            sign = R.drawable.visa_icon ,
            bank_name = "BRACK BANK LTD" ,
            card_number_start = "**** **** ****" ,
            card_number_end = "6661" ,
            start_color = LightGreen ,
            end_color = BlueGreen
        ) ,
        Card(
            sign = R.drawable.discover_icon ,
            bank_name = "EXIM BANK LTD" ,
            card_number_start = "********" ,
            card_number_end = "9912" ,
            start_color = LightBlue ,
            end_color = DarkerBlue
        ),
    )



    Scaffold(modifier = Modifier.fillMaxSize() ,
        containerColor = BlueDark ,
        topBar = {
            TopAppBar(
                title = {Text(text = "")},
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = BlueDark ,
                ) ,
                navigationIcon = {
                    Column(){
                        Row(modifier = Modifier.fillMaxWidth().padding(15.dp),
                            horizontalArrangement = Arrangement.SpaceBetween){
                            IconButton(
                                onClick = {
                                    navController.navigate("add")

                                }
                            ){
                                Icon(painter = painterResource(R.drawable.add_button),
                                    contentDescription = null ,
                                    tint = Color.White)
                            }
                            IconButton(
                                onClick = {
                                    scope.launch {
                                        drawerState.open()
                                    }
                                }
                            ){
                                Icon(painter = painterResource(R.drawable.headline),
                                    contentDescription = null ,
                                    tint = Color.White)
                            }
                        }

                    }
                }
            )
        },



        content = { paddingValues ->
            Column(modifier = Modifier.fillMaxSize().padding(paddingValues)
                .padding(start = 31.dp, top = 15.dp , end = 25.dp)){
                header_text()

                Spacer(modifier = Modifier.height(5.dp))

                list.forEach{ item ->

                    Box(modifier = Modifier.fillMaxWidth()
                        .height(225.dp)
                        .padding(top = 30.dp)
                        .clip(RoundedCornerShape(6.dp))
                        .background(
                        brush = Brush.horizontalGradient(
                            colors = listOf(item.start_color , item.end_color) as List<Color>
                        )
                    )){
                        Column(modifier = Modifier.fillMaxSize() ,
                            horizontalAlignment = Alignment.Start,
                        ){
                            if(item.sign == R.drawable.discover_icon){
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 17.dp , start = 17.dp),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Icon(
                                        painter = painterResource(item.sign),
                                        contentDescription = null,
                                        tint = Color.Unspecified,
                                        modifier = Modifier
                                            .width(190.dp)
                                            .height(45.dp)
                                    )
                                }
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 45.dp , start = 18.dp),
                                    contentAlignment = Alignment.CenterStart){

                                    Text(text = item.bank_name.toString() ,
                                        style = TextStyle(
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                            color = Color.White.copy(alpha = 0.8f),
                                            fontSize = 17.sp ,
                                            letterSpacing = 4.sp
                                        ))
                                }
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 15.dp , start = 18.dp),
                                    contentAlignment = Alignment.CenterStart){

                                    Row{
                                        Text(text = item.card_number_start.toString() ,
                                            style = TextStyle(
                                                fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 17.sp ,
                                                letterSpacing = 4.sp
                                            ))
                                        Text(text = item.card_number_end.toString() ,
                                            style = TextStyle(
                                                fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 17.sp ,
                                                letterSpacing = 4.sp
                                            ))
                                    }

                                }


                            }else if (item.sign == R.drawable.visa_icon){
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 17.dp , start = 17.dp),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Icon(
                                        painter = painterResource(item.sign),
                                        contentDescription = null,
                                        tint = Color.Unspecified,
                                        modifier = Modifier
                                            .width(120.dp)
                                            .height(40.dp)
                                    )
                                }
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 50.dp , start = 18.dp),
                                    contentAlignment = Alignment.CenterStart){

                                    Text(text = item.bank_name.toString() ,
                                        style = TextStyle(
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                            color = Color.White.copy(alpha = 0.8f),
                                            fontSize = 17.sp ,
                                            letterSpacing = 4.sp
                                        ))
                                }
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 15.dp , start = 18.dp),
                                    contentAlignment = Alignment.CenterStart){

                                    Row{
                                        Text(text = item.card_number_start.toString() ,
                                            style = TextStyle(
                                                fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 17.sp ,
                                                letterSpacing = 4.sp
                                            ))
                                        Text(text = item.card_number_end.toString() ,
                                            style = TextStyle(
                                                fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 17.sp ,
                                                letterSpacing = 4.sp
                                            ))
                                    }

                                }
                            }
                            else{
                                Box(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(top = 17.dp , start = 17.dp),
                                    contentAlignment = Alignment.CenterStart
                                ) {
                                    Icon(
                                        painter = painterResource(item.sign),
                                        contentDescription = null,
                                        tint = Color.Unspecified,
                                        modifier = Modifier
                                            .width(90.dp)
                                            .height(55.dp)
                                    )
                                }
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 40.dp , start = 18.dp),
                                    contentAlignment = Alignment.CenterStart){

                                    Text(text = item.bank_name.toString() ,
                                        style = TextStyle(
                                            fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                            color = Color.White.copy(alpha = 0.8f),
                                            fontSize = 17.sp ,
                                            letterSpacing = 4.sp
                                        ))
                                }
                                Box(modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(top = 15.dp , start = 18.dp),
                                    contentAlignment = Alignment.CenterStart){

                                    Row{
                                        Text(text = item.card_number_start.toString() ,
                                            style = TextStyle(
                                                fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 17.sp ,
                                                letterSpacing = 4.sp
                                            ))
                                        Text(text = item.card_number_end.toString() ,
                                            style = TextStyle(
                                                fontFamily = FontFamily(Font(R.font.nunito_bold)) ,
                                                color = Color.White.copy(alpha = 0.8f),
                                                fontSize = 17.sp ,
                                                letterSpacing = 4.sp
                                            ))
                                    }

                                }
                            }

                        }
                    }
                }
            }

        }
    )
}


@Composable
fun header_text(){
    Text(text = "Bank Accounts & Credit Cards" ,
        style = TextStyle(
            color = Color.White ,
            fontFamily = FontFamily(Font(R.font.roboto_bold)) ,
            fontSize = 22.sp,
        ))
}


