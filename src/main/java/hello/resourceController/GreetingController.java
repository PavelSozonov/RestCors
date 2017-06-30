package hello.resourceController;

import hello.resourceRepresentation.Greeting;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Created by pavel on 30.06.17.
 */
@RestController
public class GreetingController {

    private static final String temlate = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @CrossOrigin(origins = "http://localhost:9000")
    //@CrossOrigin(origins = "*")
    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(required = false, defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(temlate, name));
    }
}
