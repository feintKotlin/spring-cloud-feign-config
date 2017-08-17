package com.feint.spring_cloud_eureka_client.http



import com.feint.spring_cloud_eureka_client.config.FeignConfig
import feign.RequestLine
import org.springframework.cloud.netflix.feign.FeignClient
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@FeignClient(name = "hello-world",configuration = arrayOf(FeignConfig::class))
interface HelloWorldClient{
    //@RequestMapping(value="/hello",method = arrayOf(RequestMethod.GET))
    @RequestLine("GET /hello")
    fun sayHello():String
}