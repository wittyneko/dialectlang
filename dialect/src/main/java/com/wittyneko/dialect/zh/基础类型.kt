@file:Suppress("NonAsciiCharacters", "NOTHING_TO_INLINE", "unused")

package com.wittyneko.dialect.zh

import kotlin.experimental.*

typealias 随便 = Any
typealias 无关 = Nothing
typealias 单元 = Unit

typealias 可比较<类型> = Comparable<类型>

typealias 布尔型 = Boolean
typealias 字符型 = Char
typealias 数值型 = Number
typealias 字节型 = Byte
typealias 短整型 = Short
typealias 整型 = Int
typealias 长整型 = Long
typealias 浮点型 = Float
typealias 单精度型 = 浮点型
typealias 双精度型 = Double

val 对的 = true
val 错的 = false

val 零 = 0
val 一 = 1
val 二 = 2
val 三 = 3
val 四 = 4
val 五 = 5
val 六 = 6
val 七 = 7
val 八 = 8
val 九 = 9
val 十 = 10


inline val <T> T.自身 get() = this
inline val <reified T> T.类型 get() = T::class.java
inline fun Any.转字符串() = toString()
inline fun Any.哈希值() = hashCode()

/**************** 布尔型 ****************/


inline infix fun 布尔型.与(乙: 布尔型) = 自身 and 乙

inline infix fun 布尔型.或(乙: 布尔型) = 自身 or 乙

inline infix fun 布尔型.异或(乙: 布尔型) = 自身 xor 乙


/**************** 字符型 ****************/


inline infix fun 字符型.大于(乙: 字符型) = 自身 > 乙

inline infix fun 字符型.大于等于(乙: 字符型) = 自身 >= 乙

inline infix fun 字符型.小于(乙: 字符型) = 自身 < 乙

inline infix fun 字符型.小于等于(乙: 字符型) = 自身 <= 乙

inline infix fun 字符型.加(乙: 整型) = 自身 + 乙

inline infix fun 字符型.减(乙: 字符型) = 自身 - 乙
inline infix fun 字符型.减(乙: 整型) = 自身 - 乙

inline val 字符型.递增 get() = 自身.inc()
inline val 字符型.递减 get() = 自身.dec()

inline infix fun 字符型.到(乙: 字符型) = 自身..乙


/**************** 数值型 ****************/


inline fun 数值型.转双精度型() = toDouble()

inline fun 数值型.转单精度型() = toFloat()

inline fun 数值型.转浮点型() = toFloat()

inline fun 数值型.转长整型() = toLong()

inline fun 数值型.转整型() = toInt()

inline fun 数值型.转短整型() = toShort()

inline fun 数值型.转字符型() = toChar()

inline fun 数值型.转字节型() = toByte()


/**************** 字节型 ****************/


inline infix fun 字节型.大于(乙: 字节型) = 自身 > 乙

inline infix fun 字节型.大于(乙: 短整型) = 自身 > 乙
inline infix fun 字节型.大于(乙: 整型) = 自身 > 乙
inline infix fun 字节型.大于(乙: 长整型) = 自身 > 乙
inline infix fun 字节型.大于(乙: 浮点型) = 自身 > 乙
inline infix fun 字节型.大于(乙: 双精度型) = 自身 > 乙

inline infix fun 字节型.大于等于(乙: 字节型) = 自身 >= 乙
inline infix fun 字节型.大于等于(乙: 短整型) = 自身 >= 乙
inline infix fun 字节型.大于等于(乙: 整型) = 自身 >= 乙
inline infix fun 字节型.大于等于(乙: 长整型) = 自身 >= 乙
inline infix fun 字节型.大于等于(乙: 浮点型) = 自身 >= 乙
inline infix fun 字节型.大于等于(乙: 双精度型) = 自身 >= 乙

inline infix fun 字节型.小于(乙: 字节型) = 自身 < 乙
inline infix fun 字节型.小于(乙: 短整型) = 自身 < 乙
inline infix fun 字节型.小于(乙: 整型) = 自身 < 乙
inline infix fun 字节型.小于(乙: 长整型) = 自身 < 乙
inline infix fun 字节型.小于(乙: 浮点型) = 自身 < 乙
inline infix fun 字节型.小于(乙: 双精度型) = 自身 < 乙

inline infix fun 字节型.小于等于(乙: 字节型) = 自身 <= 乙
inline infix fun 字节型.小于等于(乙: 短整型) = 自身 <= 乙
inline infix fun 字节型.小于等于(乙: 整型) = 自身 <= 乙
inline infix fun 字节型.小于等于(乙: 长整型) = 自身 <= 乙
inline infix fun 字节型.小于等于(乙: 浮点型) = 自身 <= 乙
inline infix fun 字节型.小于等于(乙: 双精度型) = 自身 <= 乙

inline infix fun 字节型.加(乙: 字节型) = 自身 + 乙
inline infix fun 字节型.加(乙: 短整型) = 自身 + 乙
inline infix fun 字节型.加(乙: 整型) = 自身 + 乙
inline infix fun 字节型.加(乙: 长整型) = 自身 + 乙
inline infix fun 字节型.加(乙: 浮点型) = 自身 + 乙
inline infix fun 字节型.加(乙: 双精度型) = 自身 + 乙

inline infix fun 字节型.减(乙: 字节型) = 自身 - 乙
inline infix fun 字节型.减(乙: 短整型) = 自身 - 乙
inline infix fun 字节型.减(乙: 整型) = 自身 - 乙
inline infix fun 字节型.减(乙: 长整型) = 自身 - 乙
inline infix fun 字节型.减(乙: 浮点型) = 自身 - 乙
inline infix fun 字节型.减(乙: 双精度型) = 自身 - 乙

inline infix fun 字节型.乘(乙: 字节型) = 自身 * 乙
inline infix fun 字节型.乘(乙: 短整型) = 自身 * 乙
inline infix fun 字节型.乘(乙: 整型) = 自身 * 乙
inline infix fun 字节型.乘(乙: 长整型) = 自身 * 乙
inline infix fun 字节型.乘(乙: 浮点型) = 自身 * 乙
inline infix fun 字节型.乘(乙: 双精度型) = 自身 * 乙

inline infix fun 字节型.除(乙: 字节型) = 自身 / 乙
inline infix fun 字节型.除(乙: 短整型) = 自身 / 乙
inline infix fun 字节型.除(乙: 整型) = 自身 / 乙
inline infix fun 字节型.除(乙: 长整型) = 自身 / 乙
inline infix fun 字节型.除(乙: 浮点型) = 自身 / 乙
inline infix fun 字节型.除(乙: 双精度型) = 自身 / 乙

inline infix fun 字节型.余(乙: 字节型) = 自身 % 乙
inline infix fun 字节型.余(乙: 短整型) = 自身 % 乙
inline infix fun 字节型.余(乙: 整型) = 自身 % 乙
inline infix fun 字节型.余(乙: 长整型) = 自身 % 乙
inline infix fun 字节型.余(乙: 浮点型) = 自身 % 乙
inline infix fun 字节型.余(乙: 双精度型) = 自身 % 乙

inline val 字节型.递增 get() = 自身.inc()
inline val 字节型.递减 get() = 自身.dec()

inline infix fun 字节型.到(乙: 字节型) = 自身..乙
inline infix fun 字节型.到(乙: 短整型) = 自身..乙
inline infix fun 字节型.到(乙: 整型) = 自身..乙
inline infix fun 字节型.到(乙: 长整型) = 自身..乙

inline infix fun 字节型.与(乙: 字节型) = 自身 and 乙
inline infix fun 字节型.或(乙: 字节型) = 自身 or 乙
inline infix fun 字节型.异或(乙: 字节型) = 自身 xor 乙
inline val 字节型.倒置 get() = 自身.inv()


/**************** 短整型 ****************/


inline infix fun 短整型.大于(乙: 字节型) = 自身 > 乙

inline infix fun 短整型.大于(乙: 短整型) = 自身 > 乙
inline infix fun 短整型.大于(乙: 整型) = 自身 > 乙
inline infix fun 短整型.大于(乙: 长整型) = 自身 > 乙
inline infix fun 短整型.大于(乙: 浮点型) = 自身 > 乙
inline infix fun 短整型.大于(乙: 双精度型) = 自身 > 乙

inline infix fun 短整型.大于等于(乙: 字节型) = 自身 >= 乙
inline infix fun 短整型.大于等于(乙: 短整型) = 自身 >= 乙
inline infix fun 短整型.大于等于(乙: 整型) = 自身 >= 乙
inline infix fun 短整型.大于等于(乙: 长整型) = 自身 >= 乙
inline infix fun 短整型.大于等于(乙: 浮点型) = 自身 >= 乙
inline infix fun 短整型.大于等于(乙: 双精度型) = 自身 >= 乙

inline infix fun 短整型.小于(乙: 字节型) = 自身 < 乙
inline infix fun 短整型.小于(乙: 短整型) = 自身 < 乙
inline infix fun 短整型.小于(乙: 整型) = 自身 < 乙
inline infix fun 短整型.小于(乙: 长整型) = 自身 < 乙
inline infix fun 短整型.小于(乙: 浮点型) = 自身 < 乙
inline infix fun 短整型.小于(乙: 双精度型) = 自身 < 乙

inline infix fun 短整型.小于等于(乙: 字节型) = 自身 <= 乙
inline infix fun 短整型.小于等于(乙: 短整型) = 自身 <= 乙
inline infix fun 短整型.小于等于(乙: 整型) = 自身 <= 乙
inline infix fun 短整型.小于等于(乙: 长整型) = 自身 <= 乙
inline infix fun 短整型.小于等于(乙: 浮点型) = 自身 <= 乙
inline infix fun 短整型.小于等于(乙: 双精度型) = 自身 <= 乙

inline infix fun 短整型.加(乙: 字节型) = 自身 + 乙
inline infix fun 短整型.加(乙: 短整型) = 自身 + 乙
inline infix fun 短整型.加(乙: 整型) = 自身 + 乙
inline infix fun 短整型.加(乙: 长整型) = 自身 + 乙
inline infix fun 短整型.加(乙: 浮点型) = 自身 + 乙
inline infix fun 短整型.加(乙: 双精度型) = 自身 + 乙

inline infix fun 短整型.减(乙: 字节型) = 自身 - 乙
inline infix fun 短整型.减(乙: 短整型) = 自身 - 乙
inline infix fun 短整型.减(乙: 整型) = 自身 - 乙
inline infix fun 短整型.减(乙: 长整型) = 自身 - 乙
inline infix fun 短整型.减(乙: 浮点型) = 自身 - 乙
inline infix fun 短整型.减(乙: 双精度型) = 自身 - 乙

inline infix fun 短整型.乘(乙: 字节型) = 自身 * 乙
inline infix fun 短整型.乘(乙: 短整型) = 自身 * 乙
inline infix fun 短整型.乘(乙: 整型) = 自身 * 乙
inline infix fun 短整型.乘(乙: 长整型) = 自身 * 乙
inline infix fun 短整型.乘(乙: 浮点型) = 自身 * 乙
inline infix fun 短整型.乘(乙: 双精度型) = 自身 * 乙

inline infix fun 短整型.除(乙: 字节型) = 自身 / 乙
inline infix fun 短整型.除(乙: 短整型) = 自身 / 乙
inline infix fun 短整型.除(乙: 整型) = 自身 / 乙
inline infix fun 短整型.除(乙: 长整型) = 自身 / 乙
inline infix fun 短整型.除(乙: 浮点型) = 自身 / 乙
inline infix fun 短整型.除(乙: 双精度型) = 自身 / 乙

inline infix fun 短整型.余(乙: 字节型) = 自身 % 乙
inline infix fun 短整型.余(乙: 短整型) = 自身 % 乙
inline infix fun 短整型.余(乙: 整型) = 自身 % 乙
inline infix fun 短整型.余(乙: 长整型) = 自身 % 乙
inline infix fun 短整型.余(乙: 浮点型) = 自身 % 乙
inline infix fun 短整型.余(乙: 双精度型) = 自身 % 乙

inline val 短整型.递增 get() = 自身.inc()
inline val 短整型.递减 get() = 自身.dec()

inline infix fun 短整型.到(乙: 字节型) = 自身..乙
inline infix fun 短整型.到(乙: 短整型) = 自身..乙
inline infix fun 短整型.到(乙: 整型) = 自身..乙
inline infix fun 短整型.到(乙: 长整型) = 自身..乙

inline infix fun 短整型.与(乙: 短整型) = 自身 and 乙
inline infix fun 短整型.或(乙: 短整型) = 自身 or 乙
inline infix fun 短整型.异或(乙: 短整型) = 自身 xor 乙
inline val 短整型.倒置 get() = 自身.inv()

/**************** 整型 ****************/


inline infix fun 整型.大于(乙: 字节型) = 自身 > 乙

inline infix fun 整型.大于(乙: 短整型) = 自身 > 乙
inline infix fun 整型.大于(乙: 整型) = 自身 > 乙
inline infix fun 整型.大于(乙: 长整型) = 自身 > 乙
inline infix fun 整型.大于(乙: 浮点型) = 自身 > 乙
inline infix fun 整型.大于(乙: 双精度型) = 自身 > 乙

inline infix fun 整型.大于等于(乙: 字节型) = 自身 >= 乙
inline infix fun 整型.大于等于(乙: 短整型) = 自身 >= 乙
inline infix fun 整型.大于等于(乙: 整型) = 自身 >= 乙
inline infix fun 整型.大于等于(乙: 长整型) = 自身 >= 乙
inline infix fun 整型.大于等于(乙: 浮点型) = 自身 >= 乙
inline infix fun 整型.大于等于(乙: 双精度型) = 自身 >= 乙

inline infix fun 整型.小于(乙: 字节型) = 自身 < 乙
inline infix fun 整型.小于(乙: 短整型) = 自身 < 乙
inline infix fun 整型.小于(乙: 整型) = 自身 < 乙
inline infix fun 整型.小于(乙: 长整型) = 自身 < 乙
inline infix fun 整型.小于(乙: 浮点型) = 自身 < 乙
inline infix fun 整型.小于(乙: 双精度型) = 自身 < 乙

inline infix fun 整型.小于等于(乙: 字节型) = 自身 <= 乙
inline infix fun 整型.小于等于(乙: 短整型) = 自身 <= 乙
inline infix fun 整型.小于等于(乙: 整型) = 自身 <= 乙
inline infix fun 整型.小于等于(乙: 长整型) = 自身 <= 乙
inline infix fun 整型.小于等于(乙: 浮点型) = 自身 <= 乙
inline infix fun 整型.小于等于(乙: 双精度型) = 自身 <= 乙

inline infix fun 整型.加(乙: 字节型) = 自身 + 乙
inline infix fun 整型.加(乙: 短整型) = 自身 + 乙
inline infix fun 整型.加(乙: 整型) = 自身 + 乙
inline infix fun 整型.加(乙: 长整型) = 自身 + 乙
inline infix fun 整型.加(乙: 浮点型) = 自身 + 乙
inline infix fun 整型.加(乙: 双精度型) = 自身 + 乙

inline infix fun 整型.减(乙: 字节型) = 自身 - 乙
inline infix fun 整型.减(乙: 短整型) = 自身 - 乙
inline infix fun 整型.减(乙: 整型) = 自身 - 乙
inline infix fun 整型.减(乙: 长整型) = 自身 - 乙
inline infix fun 整型.减(乙: 浮点型) = 自身 - 乙
inline infix fun 整型.减(乙: 双精度型) = 自身 - 乙

inline infix fun 整型.乘(乙: 字节型) = 自身 * 乙
inline infix fun 整型.乘(乙: 短整型) = 自身 * 乙
inline infix fun 整型.乘(乙: 整型) = 自身 * 乙
inline infix fun 整型.乘(乙: 长整型) = 自身 * 乙
inline infix fun 整型.乘(乙: 浮点型) = 自身 * 乙
inline infix fun 整型.乘(乙: 双精度型) = 自身 * 乙

inline infix fun 整型.除(乙: 字节型) = 自身 / 乙
inline infix fun 整型.除(乙: 短整型) = 自身 / 乙
inline infix fun 整型.除(乙: 整型) = 自身 / 乙
inline infix fun 整型.除(乙: 长整型) = 自身 / 乙
inline infix fun 整型.除(乙: 浮点型) = 自身 / 乙
inline infix fun 整型.除(乙: 双精度型) = 自身 / 乙

inline infix fun 整型.余(乙: 字节型) = 自身 % 乙
inline infix fun 整型.余(乙: 短整型) = 自身 % 乙
inline infix fun 整型.余(乙: 整型) = 自身 % 乙
inline infix fun 整型.余(乙: 长整型) = 自身 % 乙
inline infix fun 整型.余(乙: 浮点型) = 自身 % 乙
inline infix fun 整型.余(乙: 双精度型) = 自身 % 乙

inline val 整型.递增 get() = 自身.inc()
inline val 整型.递减 get() = 自身.dec()

inline infix fun 整型.到(乙: 字节型) = 自身..乙
inline infix fun 整型.到(乙: 短整型) = 自身..乙
inline infix fun 整型.到(乙: 整型) = 自身..乙
inline infix fun 整型.到(乙: 长整型) = 自身..乙

inline infix fun 整型.左移(乙: 整型) = 自身 shl 乙
inline infix fun 整型.右移(乙: 整型) = 自身 shr 乙
inline infix fun 整型.正右移(乙: 整型) = 自身 ushr 乙
inline infix fun 整型.与(乙: 整型) = 自身 and 乙
inline infix fun 整型.或(乙: 整型) = 自身 or 乙
inline infix fun 整型.异或(乙: 整型) = 自身 xor 乙
inline val 整型.倒置 get() = 自身.inv()


/**************** 长整型 ****************/


inline infix fun 长整型.大于(乙: 字节型) = 自身 > 乙

inline infix fun 长整型.大于(乙: 短整型) = 自身 > 乙
inline infix fun 长整型.大于(乙: 整型) = 自身 > 乙
inline infix fun 长整型.大于(乙: 长整型) = 自身 > 乙
inline infix fun 长整型.大于(乙: 浮点型) = 自身 > 乙
inline infix fun 长整型.大于(乙: 双精度型) = 自身 > 乙

inline infix fun 长整型.大于等于(乙: 字节型) = 自身 >= 乙
inline infix fun 长整型.大于等于(乙: 短整型) = 自身 >= 乙
inline infix fun 长整型.大于等于(乙: 整型) = 自身 >= 乙
inline infix fun 长整型.大于等于(乙: 长整型) = 自身 >= 乙
inline infix fun 长整型.大于等于(乙: 浮点型) = 自身 >= 乙
inline infix fun 长整型.大于等于(乙: 双精度型) = 自身 >= 乙

inline infix fun 长整型.小于(乙: 字节型) = 自身 < 乙
inline infix fun 长整型.小于(乙: 短整型) = 自身 < 乙
inline infix fun 长整型.小于(乙: 整型) = 自身 < 乙
inline infix fun 长整型.小于(乙: 长整型) = 自身 < 乙
inline infix fun 长整型.小于(乙: 浮点型) = 自身 < 乙
inline infix fun 长整型.小于(乙: 双精度型) = 自身 < 乙

inline infix fun 长整型.小于等于(乙: 字节型) = 自身 <= 乙
inline infix fun 长整型.小于等于(乙: 短整型) = 自身 <= 乙
inline infix fun 长整型.小于等于(乙: 整型) = 自身 <= 乙
inline infix fun 长整型.小于等于(乙: 长整型) = 自身 <= 乙
inline infix fun 长整型.小于等于(乙: 浮点型) = 自身 <= 乙
inline infix fun 长整型.小于等于(乙: 双精度型) = 自身 <= 乙

inline infix fun 长整型.加(乙: 字节型) = 自身 + 乙
inline infix fun 长整型.加(乙: 短整型) = 自身 + 乙
inline infix fun 长整型.加(乙: 整型) = 自身 + 乙
inline infix fun 长整型.加(乙: 长整型) = 自身 + 乙
inline infix fun 长整型.加(乙: 浮点型) = 自身 + 乙
inline infix fun 长整型.加(乙: 双精度型) = 自身 + 乙

inline infix fun 长整型.减(乙: 字节型) = 自身 - 乙
inline infix fun 长整型.减(乙: 短整型) = 自身 - 乙
inline infix fun 长整型.减(乙: 整型) = 自身 - 乙
inline infix fun 长整型.减(乙: 长整型) = 自身 - 乙
inline infix fun 长整型.减(乙: 浮点型) = 自身 - 乙
inline infix fun 长整型.减(乙: 双精度型) = 自身 - 乙

inline infix fun 长整型.乘(乙: 字节型) = 自身 * 乙
inline infix fun 长整型.乘(乙: 短整型) = 自身 * 乙
inline infix fun 长整型.乘(乙: 整型) = 自身 * 乙
inline infix fun 长整型.乘(乙: 长整型) = 自身 * 乙
inline infix fun 长整型.乘(乙: 浮点型) = 自身 * 乙
inline infix fun 长整型.乘(乙: 双精度型) = 自身 * 乙

inline infix fun 长整型.除(乙: 字节型) = 自身 / 乙
inline infix fun 长整型.除(乙: 短整型) = 自身 / 乙
inline infix fun 长整型.除(乙: 整型) = 自身 / 乙
inline infix fun 长整型.除(乙: 长整型) = 自身 / 乙
inline infix fun 长整型.除(乙: 浮点型) = 自身 / 乙
inline infix fun 长整型.除(乙: 双精度型) = 自身 / 乙

inline infix fun 长整型.余(乙: 字节型) = 自身 % 乙
inline infix fun 长整型.余(乙: 短整型) = 自身 % 乙
inline infix fun 长整型.余(乙: 整型) = 自身 % 乙
inline infix fun 长整型.余(乙: 长整型) = 自身 % 乙
inline infix fun 长整型.余(乙: 浮点型) = 自身 % 乙
inline infix fun 长整型.余(乙: 双精度型) = 自身 % 乙

inline val 长整型.递增 get() = 自身.inc()
inline val 长整型.递减 get() = 自身.dec()

inline infix fun 长整型.到(乙: 字节型) = 自身..乙
inline infix fun 长整型.到(乙: 短整型) = 自身..乙
inline infix fun 长整型.到(乙: 整型) = 自身..乙
inline infix fun 长整型.到(乙: 长整型) = 自身..乙

inline infix fun 长整型.左移(乙: 整型) = 自身 shl 乙
inline infix fun 长整型.右移(乙: 整型) = 自身 shr 乙
inline infix fun 长整型.正右移(乙: 整型) = 自身 ushr 乙
inline infix fun 长整型.与(乙: 长整型) = 自身 and 乙
inline infix fun 长整型.或(乙: 长整型) = 自身 or 乙
inline infix fun 长整型.异或(乙: 长整型) = 自身 xor 乙
inline val 长整型.倒置 get() = 自身.inv()

/**************** 浮点型 ****************/

inline infix fun 浮点型.大于(乙: 字节型) = 自身 > 乙

inline infix fun 浮点型.大于(乙: 短整型) = 自身 > 乙
inline infix fun 浮点型.大于(乙: 整型) = 自身 > 乙
inline infix fun 浮点型.大于(乙: 长整型) = 自身 > 乙
inline infix fun 浮点型.大于(乙: 浮点型) = 自身 > 乙
inline infix fun 浮点型.大于(乙: 双精度型) = 自身 > 乙

inline infix fun 浮点型.大于等于(乙: 字节型) = 自身 >= 乙
inline infix fun 浮点型.大于等于(乙: 短整型) = 自身 >= 乙
inline infix fun 浮点型.大于等于(乙: 整型) = 自身 >= 乙
inline infix fun 浮点型.大于等于(乙: 长整型) = 自身 >= 乙
inline infix fun 浮点型.大于等于(乙: 浮点型) = 自身 >= 乙
inline infix fun 浮点型.大于等于(乙: 双精度型) = 自身 >= 乙

inline infix fun 浮点型.小于(乙: 字节型) = 自身 < 乙
inline infix fun 浮点型.小于(乙: 短整型) = 自身 < 乙
inline infix fun 浮点型.小于(乙: 整型) = 自身 < 乙
inline infix fun 浮点型.小于(乙: 长整型) = 自身 < 乙
inline infix fun 浮点型.小于(乙: 浮点型) = 自身 < 乙
inline infix fun 浮点型.小于(乙: 双精度型) = 自身 < 乙

inline infix fun 浮点型.小于等于(乙: 字节型) = 自身 <= 乙
inline infix fun 浮点型.小于等于(乙: 短整型) = 自身 <= 乙
inline infix fun 浮点型.小于等于(乙: 整型) = 自身 <= 乙
inline infix fun 浮点型.小于等于(乙: 长整型) = 自身 <= 乙
inline infix fun 浮点型.小于等于(乙: 浮点型) = 自身 <= 乙
inline infix fun 浮点型.小于等于(乙: 双精度型) = 自身 <= 乙

inline infix fun 浮点型.加(乙: 字节型) = 自身 + 乙
inline infix fun 浮点型.加(乙: 短整型) = 自身 + 乙
inline infix fun 浮点型.加(乙: 整型) = 自身 + 乙
inline infix fun 浮点型.加(乙: 长整型) = 自身 + 乙
inline infix fun 浮点型.加(乙: 浮点型) = 自身 + 乙
inline infix fun 浮点型.加(乙: 双精度型) = 自身 + 乙

inline infix fun 浮点型.减(乙: 字节型) = 自身 - 乙
inline infix fun 浮点型.减(乙: 短整型) = 自身 - 乙
inline infix fun 浮点型.减(乙: 整型) = 自身 - 乙
inline infix fun 浮点型.减(乙: 长整型) = 自身 - 乙
inline infix fun 浮点型.减(乙: 浮点型) = 自身 - 乙
inline infix fun 浮点型.减(乙: 双精度型) = 自身 - 乙

inline infix fun 浮点型.乘(乙: 字节型) = 自身 * 乙
inline infix fun 浮点型.乘(乙: 短整型) = 自身 * 乙
inline infix fun 浮点型.乘(乙: 整型) = 自身 * 乙
inline infix fun 浮点型.乘(乙: 长整型) = 自身 * 乙
inline infix fun 浮点型.乘(乙: 浮点型) = 自身 * 乙
inline infix fun 浮点型.乘(乙: 双精度型) = 自身 * 乙

inline infix fun 浮点型.除(乙: 字节型) = 自身 / 乙
inline infix fun 浮点型.除(乙: 短整型) = 自身 / 乙
inline infix fun 浮点型.除(乙: 整型) = 自身 / 乙
inline infix fun 浮点型.除(乙: 长整型) = 自身 / 乙
inline infix fun 浮点型.除(乙: 浮点型) = 自身 / 乙
inline infix fun 浮点型.除(乙: 双精度型) = 自身 / 乙

inline infix fun 浮点型.余(乙: 字节型) = 自身 % 乙
inline infix fun 浮点型.余(乙: 短整型) = 自身 % 乙
inline infix fun 浮点型.余(乙: 整型) = 自身 % 乙
inline infix fun 浮点型.余(乙: 长整型) = 自身 % 乙
inline infix fun 浮点型.余(乙: 浮点型) = 自身 % 乙
inline infix fun 浮点型.余(乙: 双精度型) = 自身 % 乙

inline val 浮点型.递增 get() = 自身.inc()
inline val 浮点型.递减 get() = 自身.dec()


/**************** 双精度型 ****************/


inline infix fun 双精度型.大于(乙: 字节型) = 自身 > 乙

inline infix fun 双精度型.大于(乙: 短整型) = 自身 > 乙
inline infix fun 双精度型.大于(乙: 整型) = 自身 > 乙
inline infix fun 双精度型.大于(乙: 长整型) = 自身 > 乙
inline infix fun 双精度型.大于(乙: 浮点型) = 自身 > 乙
inline infix fun 双精度型.大于(乙: 双精度型) = 自身 > 乙

inline infix fun 双精度型.大于等于(乙: 字节型) = 自身 >= 乙
inline infix fun 双精度型.大于等于(乙: 短整型) = 自身 >= 乙
inline infix fun 双精度型.大于等于(乙: 整型) = 自身 >= 乙
inline infix fun 双精度型.大于等于(乙: 长整型) = 自身 >= 乙
inline infix fun 双精度型.大于等于(乙: 浮点型) = 自身 >= 乙
inline infix fun 双精度型.大于等于(乙: 双精度型) = 自身 >= 乙

inline infix fun 双精度型.小于(乙: 字节型) = 自身 < 乙
inline infix fun 双精度型.小于(乙: 短整型) = 自身 < 乙
inline infix fun 双精度型.小于(乙: 整型) = 自身 < 乙
inline infix fun 双精度型.小于(乙: 长整型) = 自身 < 乙
inline infix fun 双精度型.小于(乙: 浮点型) = 自身 < 乙
inline infix fun 双精度型.小于(乙: 双精度型) = 自身 < 乙

inline infix fun 双精度型.小于等于(乙: 字节型) = 自身 <= 乙
inline infix fun 双精度型.小于等于(乙: 短整型) = 自身 <= 乙
inline infix fun 双精度型.小于等于(乙: 整型) = 自身 <= 乙
inline infix fun 双精度型.小于等于(乙: 长整型) = 自身 <= 乙
inline infix fun 双精度型.小于等于(乙: 浮点型) = 自身 <= 乙
inline infix fun 双精度型.小于等于(乙: 双精度型) = 自身 <= 乙

inline infix fun 双精度型.加(乙: 字节型) = 自身 + 乙
inline infix fun 双精度型.加(乙: 短整型) = 自身 + 乙
inline infix fun 双精度型.加(乙: 整型) = 自身 + 乙
inline infix fun 双精度型.加(乙: 长整型) = 自身 + 乙
inline infix fun 双精度型.加(乙: 浮点型) = 自身 + 乙
inline infix fun 双精度型.加(乙: 双精度型) = 自身 + 乙

inline infix fun 双精度型.减(乙: 字节型) = 自身 - 乙
inline infix fun 双精度型.减(乙: 短整型) = 自身 - 乙
inline infix fun 双精度型.减(乙: 整型) = 自身 - 乙
inline infix fun 双精度型.减(乙: 长整型) = 自身 - 乙
inline infix fun 双精度型.减(乙: 浮点型) = 自身 - 乙
inline infix fun 双精度型.减(乙: 双精度型) = 自身 - 乙

inline infix fun 双精度型.乘(乙: 字节型) = 自身 * 乙
inline infix fun 双精度型.乘(乙: 短整型) = 自身 * 乙
inline infix fun 双精度型.乘(乙: 整型) = 自身 * 乙
inline infix fun 双精度型.乘(乙: 长整型) = 自身 * 乙
inline infix fun 双精度型.乘(乙: 浮点型) = 自身 * 乙
inline infix fun 双精度型.乘(乙: 双精度型) = 自身 * 乙

inline infix fun 双精度型.除(乙: 字节型) = 自身 / 乙
inline infix fun 双精度型.除(乙: 短整型) = 自身 / 乙
inline infix fun 双精度型.除(乙: 整型) = 自身 / 乙
inline infix fun 双精度型.除(乙: 长整型) = 自身 / 乙
inline infix fun 双精度型.除(乙: 浮点型) = 自身 / 乙
inline infix fun 双精度型.除(乙: 双精度型) = 自身 / 乙

inline infix fun 双精度型.余(乙: 字节型) = 自身 % 乙
inline infix fun 双精度型.余(乙: 短整型) = 自身 % 乙
inline infix fun 双精度型.余(乙: 整型) = 自身 % 乙
inline infix fun 双精度型.余(乙: 长整型) = 自身 % 乙
inline infix fun 双精度型.余(乙: 浮点型) = 自身 % 乙
inline infix fun 双精度型.余(乙: 双精度型) = 自身 % 乙

inline val 双精度型.递增 get() = 自身.inc()
inline val 双精度型.递减 get() = 自身.dec()