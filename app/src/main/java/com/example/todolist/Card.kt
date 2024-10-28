package com.example.todolist

import android.graphics.drawable.Icon
import androidx.compose.ui.graphics.Color

data class Card(
    val sign : Int = 0,
    val bank_name : String? = null,
    val card_number_start : String? = null,
    val card_number_end : String? = null,
    val start_color : Color? = null,
    val end_color : Color? = null,
    val mm: String = "",
    val yy: String = ""
) {
}