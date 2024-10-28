package com.example.todolist

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.DrawerValue
import androidx.compose.material3.Icon
import androidx.compose.material3.ModalDrawerSheet
import androidx.compose.material3.ModalNavigationDrawer
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDrawerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.todolist.ui.theme.BlueDark
import com.example.todolist.ui.theme.LightPink
import com.example.todolist.ui.theme.LightPurple
import com.example.todolist.ui.theme.MainScreen
import com.example.todolist.ui.theme.ToDoListTheme
import com.example.todolist.ui.theme.addCard


class MainActivity : ComponentActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ToDoListTheme {
                AppControl()
            }
        }
    }
}


@Composable
fun reverseSide(){
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
}

@Composable
fun AppControl(){
    val navController = rememberNavController()


    val drawerState = rememberDrawerState(
        initialValue = DrawerValue.Closed
    )
    val scope = rememberCoroutineScope()
    val scrollState = rememberScrollState()

    var cardList = remember {
        mutableStateListOf<Card>()
    }


    ModalNavigationDrawer(
        drawerState = drawerState ,
        drawerContent = {
            ModalDrawerSheet {
                Box(modifier = Modifier.fillMaxSize()
                    .background(BlueDark) ,
                    contentAlignment = Alignment.Center){
                    LazyColumn (modifier = Modifier.fillMaxSize() ,
                        verticalArrangement = Arrangement.spacedBy(8.dp),
                        horizontalAlignment = Alignment.CenterHorizontally)
                    {

                        if(cardList.isNotEmpty()){
                            items(cardList){ item ->
                                Box(modifier = Modifier.fillMaxWidth()
                                    .height(225.dp)
                                    .padding(top = 30.dp , start = 6.dp , end = 6.dp)
                                    .clip(RoundedCornerShape(6.dp))
                                    .background(
                                        brush = Brush.horizontalGradient(
                                            colors = listOf(item.start_color , item.end_color) as List<Color>
                                        )
                                    ))
                                {
                                    Column(modifier = Modifier.fillMaxSize() ,
                                        horizontalAlignment = Alignment.Start,
                                        ){
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
                                                )
                                            )
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
                                                    )
                                                )
                                            }

                                        }
                                    }
                                }
                            }
                        }else{
                            Log.d("checking" , "Card list is empty")
                        }

                    }
                }

            }
        }
    ) {

        NavHost(navController , startDestination = "main"){
            composable("main") { MainScreen(navController , drawerState , scope , cardList)  }
            composable("add") { addCard(navController , cardList) }
            }
        }


    }


