@file:Suppress("NOTHING_TO_INLINE", "NonAsciiCharacters")

package com.wittyneko.dialect.zh

inline fun Any?.print() = print(this)
inline fun Any?.println() = println(this)

inline fun Any?.打印() = print(this)
inline fun Any?.打印换行() = println(this)
inline fun Any?.打印(前缀: 字符串 = "", 后缀: 字符串 = "") = print("$前缀$this$后缀")
inline fun Any?.打印换行(前缀: 字符串 = "", 后缀: 字符串 = "") = println("$前缀$this$后缀")
inline fun 打印换行() = println()

inline fun 读取一行() = readLine()

//TODO 预读标记
inline fun 预读标记() = ""