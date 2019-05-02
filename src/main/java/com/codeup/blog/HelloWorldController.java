package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HelloWorldController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello from Spring";
    }

    @GetMapping("/hello/{name}")
    @ResponseBody
    public String sayHelloWithName(@PathVariable String name) {
        return "Hello from " + name;

    }


}
