package com.feint.spring_cloud_eureka_client.config

import feign.Contract
import feign.auth.BasicAuthRequestInterceptor
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

@Configuration
class FeignConfig {
    @Bean
    fun basicRequestAuth():BasicAuthRequestInterceptor=
            BasicAuthRequestInterceptor("feintkotlin","goodjob")
    @Bean
    fun contract():Contract=Contract.Default()
}