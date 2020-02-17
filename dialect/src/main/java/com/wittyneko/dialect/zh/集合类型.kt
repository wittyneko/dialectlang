@file:Suppress("unused", "NonAsciiCharacters", "NOTHING_TO_INLINE")

package com.wittyneko.dialect.zh


typealias 可迭代<类型> = Iterable<类型>
typealias 可变可迭代<类型> = MutableIterable<类型>


/**************** 可迭代 ****************/


inline fun <类型> 可迭代<类型>.迭代器() = iterator()

inline infix fun <类型> 可迭代<类型>.循环(代码块: (类型) -> 单元) = forEach(代码块)

