@file:Suppress("NonAsciiCharacters", "NOTHING_TO_INLINE")
@file:UseExperimental(ExperimentalUnsignedTypes::class)

package com.wittyneko.dialect.zh

typealias 正字节型 = UByte
typealias 正短整型 = UShort
typealias 正整型 = UInt
typealias 正长整型 = ULong


inline fun 字节型.转正字节型() = toUByte()
inline fun 短整型.转正字节型() = toUByte()
inline fun 整型.转正字节型() = toUByte()
inline fun 长整型.转正字节型() = toUByte()