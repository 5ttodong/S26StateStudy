package kr.ac.kumoh.ce.s20200710.s26statestudy

import android.R.attr.shape
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kr.ac.kumoh.ce.s20200710.s26statestudy.ui.theme.S26StateStudyTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.graphics.RectangleShape

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            S26StateStudyTheme {

                MainScreen()

            }
        }
    }
}


@Composable
fun MainScreen() {
    Scaffold(
        modifier = Modifier.fillMaxSize()
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(innerPadding)
        ) { //
            // 첫 번째 4칸의 State
            var apple by remember { mutableStateOf("사과") }
            var banana by remember { mutableStateOf("바나나") }
            var grape by remember { mutableStateOf("포도") }
            var strawberry by remember { mutableStateOf("딸기") }

            // 두 번째 4칸의 State
            var car by remember { mutableStateOf("자동차") }
            var school by remember { mutableStateOf("학교") }
            var book by remember { mutableStateOf("책") }
            var chair by remember { mutableStateOf("의자") }

            // 맨 아래 영어를 보여줄 State
            var meaning by remember { mutableStateOf("") }

            Column(
                modifier = Modifier.fillMaxSize()
            ) {

                // 첫 번째 2 x 2
                Row(
                    modifier = Modifier.weight(1f)
                ) {
                    Button(
                        onClick = {
                            apple = "Apple"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape
                    ) {
                        Text(apple)
                    }

                    Button(
                        onClick = {
                            banana = "Banana"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape
                    ) {
                        Text(banana)
                    }
                }

                Row(
                    modifier = Modifier.weight(1f)
                ) {
                    Button(
                        onClick = {
                            grape = "Grape"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape
                    ) {
                        Text(grape)
                    }

                    Button(
                        onClick = {
                            strawberry = "Strawberry"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape
                    ) {
                        Text(strawberry)
                    }
                }


                // 두 번째 2 x 2
                Row(
                    modifier = Modifier.weight(1f)
                ) {
                    Button(
                        onClick = {
                            meaning = "Car"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape,
                        colors =  ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(car, fontSize = 30.sp, color = Color.Black)
                    }

                    Button(
                        onClick = {
                            meaning = "School"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape,
                        colors =  ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(school, fontSize = 30.sp, color = Color.Black)
                    }
                }

                Row(
                    modifier = Modifier.weight(1f)
                ) {
                    Button(
                        onClick = {
                            meaning = "Book"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape,
                        colors =  ButtonDefaults.buttonColors(containerColor = Color.Blue)
                    ) {
                        Text(book, fontSize = 30.sp, color = Color.Black)
                    }

                    Button(
                        onClick = {
                            meaning = "Chair"
                        },
                        modifier = Modifier.weight(1f).fillMaxHeight().padding(8.dp),
                        shape = RectangleShape,
                        colors =  ButtonDefaults.buttonColors(containerColor = Color.Blue)

                    ) {
                        Text(chair, fontSize = 30.sp, color = Color.Black)
                    }
                }


                // StateVisibility 결과
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(8.dp)
                        .weight(1f)
                        .background(Color.Gray),
                    contentAlignment = Alignment.Center,

                ) {
                    Text(
                        text = meaning,
                        fontSize = 30.sp
                    )
                }
            }
        }
    }
}