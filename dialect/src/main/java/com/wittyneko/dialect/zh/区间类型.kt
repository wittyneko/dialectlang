@file:Suppress("NonAsciiCharacters", "NOTHING_TO_INLINE")

package com.wittyneko.dialect.zh

import kotlin.random.Random

typealias 字符型数列 = CharProgression
typealias 整型数列 = IntProgression
typealias 长整型数列 = LongProgression

typealias 闭区间<类型> = ClosedRange<类型>
typealias 字符型区间 = CharRange
typealias 整型区间 = IntRange
typealias 长整型区间 = LongRange

typealias 闭浮点区间<类型> = ClosedFloatingPointRange<类型>


/**************** 闭区间 ****************/


inline val <类型 : 可比较<类型>> 闭区间<类型>.开始 get() = start
inline val <类型 : 可比较<类型>> 闭区间<类型>.结束 get() = endInclusive
inline fun <类型 : 可比较<类型>> 闭区间<类型>.为空() = isEmpty()

inline infix fun <类型 : 可比较<类型>> 闭区间<类型>.包含(乙: 类型) = this.contains(乙)
inline infix fun <类型 : 可比较<类型>> 闭区间<类型>.不包含(乙: 类型) = !this.contains(乙)

inline infix fun <类型 : 可比较<类型>> 类型.包含于(乙: 闭区间<类型>) = 乙.contains(this)
inline infix fun <类型 : 可比较<类型>> 类型.不包含于(乙: 闭区间<类型>) = !乙.contains(this)


inline infix fun <当前值, 计算值> 当前值.包含(乙: 计算值?)
        where 计算值 : Any, 当前值 : Iterable<计算值>, 当前值 : ClosedRange<计算值> = this.contains(乙)

inline infix fun <当前值, 计算值> 当前值.不包含(乙: 计算值?)
        where 计算值 : Any, 当前值 : Iterable<计算值>, 当前值 : ClosedRange<计算值> = !this.contains(乙)

inline infix fun <当前值, 计算值> 当前值?.包含于(乙: 计算值)
        where 当前值 : Any, 计算值 : Iterable<当前值>, 计算值 : ClosedRange<当前值> = 乙.contains(this)

inline infix fun <当前值, 计算值> 当前值?.不包含于(乙: 计算值)
        where 当前值 : Any, 计算值 : Iterable<当前值>, 计算值 : ClosedRange<当前值> = !乙.contains(this)

inline infix fun <类型 : 可比较<类型>> 类型.到(乙: 类型) = this..乙
inline infix fun 浮点型.到(乙: 浮点型) = this..乙
inline infix fun 双精度型.到(乙: 双精度型) = this..乙

/**************** 字符型区间 ****************/

inline val 字符型区间.空的 get() = CharRange.EMPTY

/**************** 整型区间 ****************/

inline val 整型区间.空的 get() = CharRange.EMPTY

/**************** 长整型区间 ****************/

inline val 长整型区间.空的 get() = CharRange.EMPTY

/**************** 创建区间 ****************/

inline fun 整型区间.随机数() = random()

inline fun 长整型区间.随机数() = random()
inline fun 字符型区间.随机数() = random()

inline fun 整型区间.随机数(random: Random) = random(random)
inline fun 长整型区间.随机数(random: Random) = random(random)
inline fun 字符型区间.随机数(random: Random) = random(random)

//TODO: 包含判断

inline infix fun 字节型.减到(乙: 字节型) = 自身 downTo 乙
inline infix fun 字节型.减到(乙: 短整型) = 自身 downTo 乙
inline infix fun 字节型.减到(乙: 整型) = 自身 downTo 乙
inline infix fun 字节型.减到(乙: 长整型) = 自身 downTo 乙

inline infix fun 短整型.减到(乙: 字节型) = 自身 downTo 乙
inline infix fun 短整型.减到(乙: 短整型) = 自身 downTo 乙
inline infix fun 短整型.减到(乙: 整型) = 自身 downTo 乙
inline infix fun 短整型.减到(乙: 长整型) = 自身 downTo 乙

inline infix fun 整型.减到(乙: 字节型) = 自身 downTo 乙
inline infix fun 整型.减到(乙: 短整型) = 自身 downTo 乙
inline infix fun 整型.减到(乙: 整型) = 自身 downTo 乙
inline infix fun 整型.减到(乙: 长整型) = 自身 downTo 乙

inline infix fun 长整型.减到(乙: 字节型) = 自身 downTo 乙
inline infix fun 长整型.减到(乙: 短整型) = 自身 downTo 乙
inline infix fun 长整型.减到(乙: 整型) = 自身 downTo 乙
inline infix fun 长整型.减到(乙: 长整型) = 自身 downTo 乙

inline fun 整型数列.反向() = reversed()
inline fun 长整型数列.反向() = reversed()
inline fun 字符型数列.反向() = reversed()

inline infix fun 整型数列.每隔(个数: 整型) = 自身 step 个数
inline infix fun 长整型数列.每隔(个数: 长整型) = 自身 step 个数
inline infix fun 字符型数列.每隔(个数: 整型) = 自身 step 个数

//inline fun 整型.转准确字节型() = this.toByteExactOrNull()

inline val 字节型.之前 get() = 自身 - 1
inline val 短整型.之前 get() = 自身 - 1
inline val 整型.之前 get() = 自身 - 1
inline val 长整型.之前 get() = 自身 - 1

inline infix fun 字节型.到之前(乙: 字节型) = 自身 until 乙
inline infix fun 字节型.到之前(乙: 短整型) = 自身 until 乙
inline infix fun 字节型.到之前(乙: 整型) = 自身 until 乙
inline infix fun 字节型.到之前(乙: 长整型) = 自身 until 乙

inline infix fun 短整型.到之前(乙: 字节型) = 自身 until 乙
inline infix fun 短整型.到之前(乙: 短整型) = 自身 until 乙
inline infix fun 短整型.到之前(乙: 整型) = 自身 until 乙
inline infix fun 短整型.到之前(乙: 长整型) = 自身 until 乙

inline infix fun 整型.到之前(乙: 字节型) = 自身 until 乙
inline infix fun 整型.到之前(乙: 短整型) = 自身 until 乙
inline infix fun 整型.到之前(乙: 整型) = 自身 until 乙
inline infix fun 整型.到之前(乙: 长整型) = 自身 until 乙

inline infix fun 长整型.到之前(乙: 字节型) = 自身 until 乙
inline infix fun 长整型.到之前(乙: 短整型) = 自身 until 乙
inline infix fun 长整型.到之前(乙: 整型) = 自身 until 乙
inline infix fun 长整型.到之前(乙: 长整型) = 自身 until 乙

inline fun <类型 : 可比较<类型>> 类型.取最小(乙: 类型) = coerceAtLeast(乙)
// TODO 其它取最小

inline fun <类型 : 可比较<类型>> 类型.取最大(乙: 类型) = coerceAtMost(乙)
// TODO 其它取最大

inline fun <类型 : 可比较<类型>> 类型.取中间(乙: 类型) = coerceAtMost(乙)
// TODO 其它取中间