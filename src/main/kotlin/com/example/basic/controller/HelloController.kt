package com.example.basic.controller

import com.example.basic.service.HelloService
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

data class HelloRequest(val name: String)

@RestController
class HelloController(private val helloService : HelloService) {

    @GetMapping("/hello")
    fun hello() : HelloRequest {
        return HelloRequest(helloService.getHello().name)
    }
}