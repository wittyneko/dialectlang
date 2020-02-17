@file:Suppress("NOTHING_TO_INLINE", "NonAsciiCharacters")

package com.wittyneko.dialect.zh

inline fun Any?.print() = print(this)
inline fun Any?.println() = println(this)

inline fun Any?.打印() = print(this)
inline fun Any?.打印换行() = println(this)

inline fun 读取一行() = readLine()

//TODO 预读标记
inline fun 预读标记() = ""