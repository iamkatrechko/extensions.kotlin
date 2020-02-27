package com.github.iamkatrechko.extensions.kotlin

/** Тег для логирования */
val Any.TAG: String
    get() = this::class.java.run {
        val enclosingClass = enclosingClass
        if (isAnonymousClass && enclosingClass != null) {
            enclosingClass.simpleName
        } else {
            simpleName
        }
    }

/** Функция безопасного приведения объекта к типу [T] */
inline fun <reified T> Any?.asGeneric(): T? =
    this as? T
