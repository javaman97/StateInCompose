package com.aman.stateincompose

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun StatelessCounter(count:Int, onIncrement:() -> Unit, modifier: Modifier) {
    Column(modifier = Modifier.padding(16.dp)) {
        if (count > 0) {
//            var showTask by remember {
//                mutableStateOf(true)
//            }
//
//            if(showTask){
//                WelllnessTaskItem(taskName = "Have you taken your 20 minutes break?", onClose = { showTask = false })
//            }
            Text(text = "You've had $count glasses.")
        }

//        Row(Modifier.padding(top =8.dp)) {
        Button(onClick = onIncrement, Modifier.padding(top = 10.dp), enabled = count < 10) {
            Text(text = "Add one")
        }

//            Button(onClick = { count = 0 }, Modifier.padding(start = 8.dp) ) {
//                Text(text = "Clear Water Count")
//            }
        //}
    }
}


    @Composable
    fun StatefulCounter(modifier: Modifier = Modifier){
        var watercounter by rememberSaveable {
            mutableStateOf(0)
        }
        var juicecounter by rememberSaveable {
            mutableStateOf(0)
        }

        StatelessCounter(juicecounter, { juicecounter++}, modifier)
        StatelessCounter(watercounter, { watercounter++}, modifier)
    }

