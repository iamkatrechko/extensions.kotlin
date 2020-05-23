package com.github.iamkatrechko.extensions.kotlin

/** Берет текущее значения, либо [default], если текущее пустое */
fun String.ifEmpty(default: String): String =
    if (isEmpty()) default else this

/** Берет текущее значения, либо [default], если текущее пустое, либо null */
fun String?.ifNullOrEmpty(default: String): String =
    if (this.isNullOrEmpty()) default else this

/** Берет текущее значения, либо null, если текущее пустое */
fun String?.nullIfEmpty(): String? =
    if (isNullOrEmpty()) null else this
