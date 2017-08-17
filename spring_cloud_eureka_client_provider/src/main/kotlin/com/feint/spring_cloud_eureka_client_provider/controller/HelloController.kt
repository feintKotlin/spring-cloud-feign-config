package com.feint.spring_cloud_eureka_client_provider.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloController{
    @GetMapping("/hello")
    fun sayHello()="Hello World,My Kotlin!"
}