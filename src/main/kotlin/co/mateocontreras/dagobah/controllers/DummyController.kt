package co.mateocontreras.dagobah.controllers

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(("/api/v1/dummy"))
class DummyController {

    @GetMapping("/")
    fun dummy(): String {
        return "I'm kinda dummy but I'm here"
    }
}