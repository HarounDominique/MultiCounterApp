package com.example.ej01tercerintento.ui.elements

import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Counter(
    firstButtonAction:()->Unit,
    secondButtonAction:()->Unit,
    number:Int
){
    Row() {
        Button(onClick = { firstButtonAction() }) {
            Text(text = "Decrementar")
        }
        Text(text=number.toString())
        Button(onClick = { secondButtonAction() }) {
            Text(text = "Incrementar")
        }
    }
}