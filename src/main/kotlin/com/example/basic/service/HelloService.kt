package com.example.basic.service

import org.springframework.stereotype.Service

data class Hello(val name: String)

@Service
class HelloService {
    fun getHello() : Hello {
        return Hello("wusucuma")
    }
}