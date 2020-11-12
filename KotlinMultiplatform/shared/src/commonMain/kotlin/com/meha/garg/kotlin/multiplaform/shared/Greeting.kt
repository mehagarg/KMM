package com.meha.garg.kotlin.multiplaform.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
