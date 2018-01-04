package au.com.redenergy.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@RestController
class HomeController {

    @RequestMapping("/")
    @ResponseBody
    String greeting() {
        "Greetings on ${System.currentTimeMillis()}"
    }
}
