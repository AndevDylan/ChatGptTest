package com.dylan.chatgpttest

/**
 * Creator: Dylan.
 * Date: 2023/5/22.
 * desc:
 */
enum class LogType(val value: Int) {
    KOTLIN_LOG(0), JAVA_LOG(1);

    companion object {
        fun pause(value: Int): LogType {
            return when (value % 2) {
                KOTLIN_LOG.value -> KOTLIN_LOG
                JAVA_LOG.value -> JAVA_LOG
                else -> {
                    KOTLIN_LOG
                }
            }
        }
    }
}