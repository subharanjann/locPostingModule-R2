package com.mobillor.locpostingmodule.presentation.viewModel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel


class TextColorViewModel : ViewModel() {
    var color1 by mutableStateOf(Color.Black)
    var color2 by mutableStateOf(Color.Black)
    var color3 by mutableStateOf(Color.Black)

    fun changeColors(exceptIndex: Int) {
        when (exceptIndex) {
            1 -> {
                color2 = Color.Red
                color3 = Color.Red
            }
            2 -> {
                color1 = Color.Red
                color3 = Color.Red
            }
            3 -> {
                color1 = Color.Red
                color2 = Color.Red
            }
        }
    }

    fun resetColors() {
        color1 = Color.Black
        color2 = Color.Black
        color3 = Color.Black
    }
}