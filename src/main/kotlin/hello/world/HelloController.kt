package hello.world

import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.http.HttpStatus
import io.micronaut.http.MediaType
import java.util.*

@Controller("/hello")
class HelloController {

    @Get("/")
    fun index(): HttpStatus {
        return HttpStatus.OK
    }

    @Get("/{name}", produces = [MediaType.APPLICATION_JSON])
    fun hello(name: String): String {
        return "Hello, $name"
    }
}
