package com.example.sipcalculator

import android.os.Bundle
import android.view.Gravity
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement.Absolute.Center
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            // Calling the composable function
            // to display element and its contents
            MainContent()
        }
    }

    @Preview(showBackground = true)
    @Composable
    fun DefaultPreview() {
        MainContent()
    }
}

// Creating a composable function to display Top Bar
@Composable
fun MainContent() {
    Scaffold(
        content = { MyContent() }
    )
}

// Creating a composable function to create a simple card
// Calling this function as content in the above function
@Composable
fun MyContent() {

    val RestName = remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .wrapContentHeight(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Box(
            modifier = Modifier.padding(10.dp)
        ) {
            OutlinedTextField(
                value = RestName.value,
                onValueChange = {
                    RestName.value = it
                },

                label = {
                    Text(text = "Restaurant name or dish ...")
                },

                modifier = Modifier
                    .fillMaxWidth()
                    .clip(RoundedCornerShape(4.dp))
            )
        }

        Spacer(modifier = Modifier.height(20.dp))

        Card( //card 1
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(350.dp),
            elevation = 5.dp
        ) {
            Column(
                modifier = Modifier.wrapContentWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.hotel1v),
                        contentDescription = "first card picture",
                        Modifier.size(350.dp, 200.dp)
                    )
                }
                Card() {
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                    ) {
                        Column(
                            Modifier.padding(top = 4.dp)
                        ) {
                            Text(
                                text = "Chai Point",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp,
                            )
                            Text(text = "Tea, Beverages, Shake, Fast Food, ...")
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .width(70.dp)
                                    .wrapContentHeight()
                                    .background(
                                        Color(0xFF018787)
                                    ),
                                contentAlignment = Alignment.Center

                            ) {
                                Text(
                                    text = "4.1 ★",
                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 3.dp)
                                        .padding(start = 10.dp)
                                        .padding(end = 10.dp)
                                        .padding(bottom = 3.dp)
                                    )
                            }
                            Text(
                                text = "$20 for one",
                                modifier = Modifier.padding(top = 2.dp)
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Card( //card 2
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(350.dp),
            elevation = 5.dp
        ) {
            Column(
                modifier = Modifier.wrapContentWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.hotel2),
                        contentDescription = "first card picture",
                        Modifier.size(380.dp, 200.dp) //770 * 432
                    )
                }
                Card() {
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                    ) {
                        Column(
                            Modifier.padding(top = 4.dp)
                        ) {
                            Text(
                                text = "Rim Naam - the Oberoi",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp,
                            )
                            Text(text = "Thai, Asian, Seafood, Desserts, ...")
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .width(70.dp)
                                    .wrapContentHeight()
                                    .background(
                                        Color(0xFF018787)
                                    ),
                                contentAlignment = Alignment.Center

                            ) {
                                Text(
                                    text = "4.8 ★",
                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 3.dp)
                                        .padding(start = 10.dp)
                                        .padding(end = 10.dp)
                                        .padding(bottom = 3.dp)
                                )
                            }
                            Text(
                                text = "$25 for one",
                                modifier = Modifier.padding(top = 2.dp)
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))

        Card( //card 3
            shape = RoundedCornerShape(15.dp),
            modifier = Modifier.width(350.dp),
            elevation = 5.dp
        ) {
            Column(
                modifier = Modifier.wrapContentWidth(),
                horizontalAlignment = Alignment.CenterHorizontally,
            ) {
                Box(modifier = Modifier.fillMaxWidth()) {
                    Image(
                        painter = painterResource(id = R.drawable.hotel3),
                        contentDescription = "first card picture",
                        Modifier.size(350.dp, 200.dp)
                    )
                }
                Card() {
                    Row(
                        modifier = Modifier
                            .padding(10.dp)
                            .fillMaxWidth()
                    ) {
                        Column(
                            Modifier.padding(top = 4.dp)
                        ) {
                            Text(
                                text = "Ministry of Food - Hilton",
                                fontWeight = FontWeight.Bold,
                                fontSize = 18.sp,
                            )
                            Text(text = "chinese, Seafood,Drinks, Desserts, ...")
                        }
                        Column(
                            horizontalAlignment = Alignment.CenterHorizontally,
                            modifier = Modifier.fillMaxWidth()
                        ) {
                            Box(
                                modifier = Modifier
                                    .clip(RoundedCornerShape(10.dp))
                                    .width(70.dp)
                                    .wrapContentHeight()
                                    .background(
                                        Color(0xFF018787)
                                    ),
                                contentAlignment = Alignment.Center

                            ) {
                                Text(
                                    text = "4.3 ★",
                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    fontSize = 18.sp,
                                    fontWeight = FontWeight.Bold,
                                    modifier = Modifier
                                        .padding(top = 3.dp)
                                        .padding(start = 10.dp)
                                        .padding(end = 10.dp)
                                        .padding(bottom = 3.dp)
                                )
                            }
                            Text(
                                text = "$18 for one",
                                modifier = Modifier.padding(top = 2.dp)
                            )
                        }
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(40.dp))
    }
}