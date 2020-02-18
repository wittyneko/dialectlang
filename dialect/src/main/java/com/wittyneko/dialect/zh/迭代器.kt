@file:Suppress("NonAsciiCharacters")

package com.wittyneko.dialect.zh

typealias 迭代器<类型> = Iterator<类型>
typealias 可变迭代器<类型> = MutableIterator<类型>
typealias 列表迭代器<类型> = ListIterator<类型>
typealias 可变列表迭代器<类型> = MutableListIterator<类型>

typealias 布尔迭代器 = BooleanIterator
typealias 字符迭代器 = CharIterator
typealias 字节迭代器 = ByteIterator
typealias 短整迭代器 = ShortIterator
typealias 整迭代器 = IntIterator
typealias 长整迭代器 = LongIterator
typealias 浮点迭代器 = FloatIterator
typealias 单精度迭代器 = 浮点迭代器
typealias 双精度迭代器 = DoubleIterator


/**************** 迭代器 ****************/


inline fun <类型> 迭代器<类型>.下一个() = next()

inline infix fun <类型> 迭代器<类型>.循环(代码块: (类型) -> 的) = forEach(代码块)