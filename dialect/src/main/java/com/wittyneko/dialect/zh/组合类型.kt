@file:Suppress("NonAsciiCharacters")

package com.wittyneko.dialect.zh


typealias 两组<甲, 乙> = Pair<甲, 乙>
typealias 三组<甲, 乙, 丙> = Triple<甲, 乙, 丙>

sealed class 二选一<左, 右> {
    class 左边<左, 右>(val 值: 左) : 二选一<左, 右>()
    class 右边<左, 右>(val 值: 右) : 二选一<左, 右>()
}

sealed class 薛定谔的猫<死, 活> {
    class 死的<死, 活>(val 值: 死) : 薛定谔的猫<死, 活>()
    class 活的<死, 活>(val 值: 活) : 薛定谔的猫<死, 活>()
}