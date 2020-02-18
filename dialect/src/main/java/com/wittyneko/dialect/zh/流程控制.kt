@file:Suppress("unused", "NOTHING_TO_INLINE", "NonAsciiCharacters")

package com.wittyneko.dialect.zh


/**************** 表达式 ****************/


inline infix fun <当前值, 计算值> 当前值.相同于(乙: 计算值) = 自身 === 乙

inline infix fun <当前值, 计算值> 当前值.等于(乙: 计算值) = 自身 == 乙
inline infix fun <当前值, 计算值> 当前值.不等于(乙: 计算值) = 自身 != 乙


/**************** 条件 ****************/


inline infix fun <T> Boolean.then(param: T) = if (this) param else null

inline infix fun <T> Boolean.then(block: () -> T) = if (this) block() else null

inline infix fun <T> (() -> Boolean).then(param: T) = if (this()) param else null

inline infix fun <T> (() -> Boolean).then(block: () -> T) = if (this()) block() else null

inline fun 如果(条件: 布尔型) = 条件

inline fun 如果(条件: () -> 布尔型) = 条件()

inline fun <返回值> 如果(条件: 布尔型, 正确的: () -> 返回值) = if (条件) 正确的() else null

inline infix fun <返回值> 布尔型.则(正确的: 返回值) = if (this) 正确的 else null

inline infix fun <返回值> 布尔型.则(正确的: () -> 返回值) = if (this) 正确的() else null

inline infix fun <返回值> (() -> 布尔型).则(正确的: 返回值) = if (this()) 正确的 else null

inline infix fun <返回值> (() -> 布尔型).则(正确的: () -> 返回值) = if (this()) 正确的() else null

inline fun <返回值> 或者(条件: 布尔型, 正确的: () -> 返回值) = 如果(条件, 正确的)

inline fun <返回值> 否则(错误的: 返回值) = 错误的

inline fun <返回值> 否则(错误的: () -> 返回值) = 错误的()

inline fun <返回值> 返回值?.或者(条件: 布尔型, 正确的: () -> 返回值?) = this ?: 如果(条件, 正确的)

inline infix fun <返回值> 返回值?.否则(错误的: 返回值) = this ?: 错误的

inline infix fun <返回值> 返回值?.否则(错误的: () -> 返回值) = this ?: 错误的()

inline fun <返回值> 结束(代码块: () -> 返回值) = 代码块()


/**************** 异常 ****************/


inline fun <异常类型, 正常值> 检验(
    类型: Class<异常类型>,
    noinline 代码块: () -> 正常值
) = 两组(类型, 代码块)

inline infix fun <异常类型, 正常值, 异常值> 两组<Class<异常类型>, () -> 正常值>.捕获(
    noinline 代码块: (异常类型) -> 异常值
) = 三组(first, second, 代码块)

inline infix fun <reified 异常类型, 正常值> 两组<Class<异常类型>, () -> 正常值>.结束(代码块: () -> Unit) = try {
    second()
} catch (e: Throwable) {
    if (e is 异常类型) e else throw e
} finally {
    代码块()
}

/**
 * 返回值可能不一样，需手动强转
 */
inline infix fun <reified 异常类型, 正常值, 异常值> 三组<Class<异常类型>, () -> 正常值, (异常类型) -> 异常值>.结束(
    代码块: () -> Unit
) = try {
    second()
} catch (e: Throwable) {
    if (e is 异常类型) third(e) else throw e
} finally {
    代码块()
}

/**
 * 返回值一样
 */
inline infix fun <reified 异常类型, 返回值> 三组<Class<异常类型>, () -> 返回值, (异常类型) -> 返回值>.结束返回(
    代码块: () -> Unit
) = try {
    second()
} catch (e: Throwable) {
    if (e is 异常类型) third(e) else throw e
} finally {
    代码块()
}


/**************** 循环 ****************/


inline fun 当(noinline 条件: () -> 布尔型) = 条件

inline infix fun (() -> 布尔型).循环(代码块: () -> Unit) {
    while (this()) 代码块()
}

inline fun 循环(noinline 代码块: () -> Unit) = 代码块

inline infix fun (() -> Unit).当(条件: () -> 布尔型) {
    do this() while (条件())
}
