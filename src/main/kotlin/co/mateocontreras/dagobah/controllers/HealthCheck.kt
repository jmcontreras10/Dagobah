package co.mateocontreras.dagobah.controllers

import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/health")
class HealthCheck {
    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    fun healthCheck(): String {
        return "OK"
    }
}