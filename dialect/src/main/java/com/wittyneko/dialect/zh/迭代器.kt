@file:Suppress("NonAsciiCharacters", "NOTHING_TO_INLINE")

package com.wittyneko.dialect.zh

typealias 迭代器<类型> = Iterator<类型>
typealias 可变迭代器<类型> = MutableIterator<类型>
typealias 列表迭代器<类型> = ListIterator<类型>
typealias 可变列表迭代器<类型> = MutableListIterator<类型>

typealias 布尔迭代器 = BooleanIterator
typealias 字符迭代器 = CharIterator
typealias 字节迭代器 = ByteIterator
typealias 短整迭代器 = ShortIterator
typealias 整型迭代器 = IntIterator
typealias 长整型迭代器 = LongIterator
typealias 浮点迭代器 = FloatIterator
typealias 单精度迭代器 = 浮点迭代器
typealias 双精度迭代器 = DoubleIterator

typealias 索引值<类型> = IndexedValue<类型>


/**************** 迭代器 ****************/


inline fun <类型> 迭代器<类型>.下一个() = next()

inline fun <类型> 迭代器<类型>.有下一个() = hasNext()

inline fun <类型> 迭代器<类型>.迭代器() = iterator()

inline fun <类型> 迭代器<类型>.索引迭代器() = withIndex()

inline infix fun <类型> 迭代器<类型>.循环(代码块: (类型) -> 的) = forEach(代码块)


/**************** 可变迭代器 ****************/


inline fun <类型> 可变迭代器<类型>.删除() = remove()


/**************** 列表迭代器 ****************/


inline fun <类型> 列表迭代器<类型>.上一个() = previous()

inline fun <类型> 列表迭代器<类型>.有上一个() = hasPrevious()

inline fun <类型> 列表迭代器<类型>.上一个索引() = previousIndex()

inline fun <类型> 列表迭代器<类型>.下一个索引() = nextIndex()


/**************** 可变列表迭代器 ****************/


inline fun <类型> 可变列表迭代器<类型>.设(值: 类型) = set(值)

inline fun <类型> 可变列表迭代器<类型>.添加(值: 类型) = add(值)