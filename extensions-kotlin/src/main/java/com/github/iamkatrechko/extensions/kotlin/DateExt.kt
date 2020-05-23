package com.github.iamkatrechko.extensions.kotlin

import java.util.*
import java.util.Calendar.YEAR

/** Создает дату па заданным параметрам */
fun dateOf(year: Int, month: Int, day: Int, hour: Int = 0, minute: Int = 0, seconds: Int = 0, millisecond: Int = 0): Date {
    val calendar = Calendar.getInstance()
    calendar.set(year, month, day)
    calendar.set(Calendar.HOUR_OF_DAY, hour)
    calendar.set(Calendar.MINUTE, minute)
    calendar.set(Calendar.SECOND, seconds)
    calendar.set(Calendar.MILLISECOND, millisecond)
    return calendar.time
}

/** Конвертирует дату в календарь */
fun Date.toCalendar(): Calendar {
    val calendar = Calendar.getInstance()
    calendar.time = this
    return calendar
}

/** Совпадают ли года даты с [указанной][other] */
fun Date.isSameYear(other: Date): Boolean =
        toCalendar().get(YEAR) == other.toCalendar().get(YEAR)

/** Совпадает ли год с годом на устройстве */
fun Date.isCurrentYear(): Boolean =
        isSameYear(Calendar.getInstance().time)
