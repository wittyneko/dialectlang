@file:Suppress("NonAsciiCharacters", "NOTHING_TO_INLINE")

package com.wittyneko.dialect.zh

typealias 字符序列 = CharSequence
typealias 字符串 = String

inline fun 字符序列.裁剪(predicate: (Char) -> Boolean) = trim(predicate)


/**************** 字符序列 ****************/


inline infix fun 字符序列.取值(索引: 整型) = get(索引)

inline fun 字符序列.子序列(开始索引: 整型, 结束索引: 整型) = subSequence(开始索引, 结束索引)


/**************** 字符串 ****************/


inline infix fun 字符串.加(其它: Any?) = plus(其它)