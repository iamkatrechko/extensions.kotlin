package com.github.iamkatrechko.extensions.kotlin

import java.util.*

/** Обнуляет часы, минуты, секунды, миллисекунды */
fun Calendar.truncate() {
    set(Calendar.HOUR_OF_DAY, 0)
    set(Calendar.MINUTE, 0)
    set(Calendar.SECOND, 0)
    set(Calendar.MILLISECOND, 0)
}
