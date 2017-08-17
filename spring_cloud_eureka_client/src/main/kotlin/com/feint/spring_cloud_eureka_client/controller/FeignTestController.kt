package com.feint.spring_cloud_eureka_client.controller

import com.feint.spring_cloud_eureka_client.http.HelloWorldClient
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class FeignTestController{

    @Autowired
    lateinit var helloClient: HelloWorldClient

    @GetMapping("/hello")
    fun sayHello()=helloClient.sayHello()
}