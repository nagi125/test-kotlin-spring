package localhost.test

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@Controller
class HelloController {
    @GetMapping("/hello")
    fun index(model: Model): String {
        model.addAttribute("message", "Hello World!")
        return "index"
    }
}