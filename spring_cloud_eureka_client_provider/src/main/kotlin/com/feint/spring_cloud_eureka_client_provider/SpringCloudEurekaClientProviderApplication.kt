package com.feint.spring_cloud_eureka_client_provider

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class SpringCloudEurekaClientProviderApplication

fun main(args: Array<String>) {
    SpringApplication.run(SpringCloudEurekaClientProviderApplication::class.java, *args)
}
