package com.github.iamkatrechko.extensions.kotlin

import java.util.*

/** Конвертирует дату в календарь */
fun Date.toCalendar(): Calendar {
    val calendar = Calendar.getInstance()
    calendar.time = this
    return calendar
}
