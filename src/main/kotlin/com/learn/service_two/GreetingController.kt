package com.learn.service_two

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/hello")
class GreetingController {
    @GetMapping
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) : String {
        return "Hello $name, from Service 2"
    }
}