package fullstack.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public List<String> hello() {
        return Arrays.asList("Hello", "World!", "you bastard");
    }

    @GetMapping("/helloString")
    public String helloString() {
        return "hello world!";
    }
}
