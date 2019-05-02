package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{num1}/and/{num2}")
    @ResponseBody
    public String add(@PathVariable Integer num1, @PathVariable Integer num2){
        return String.valueOf(num1 + num2);
    }

    @GetMapping("/subtract/{num1}/and/{num2}")
    @ResponseBody
    public String subtract(@PathVariable Integer num1, @PathVariable Integer num2){
        return String.valueOf(num1 - num2);
    }

    @GetMapping("/multiply/{num1}/and/{num2}")
    @ResponseBody
    public String multiply(@PathVariable Integer num1, @PathVariable Integer num2){
        return String.valueOf(num1 * num2);
    }

    @GetMapping("/divide/{num1}/and/{num2}")
    @ResponseBody
    public String divide(@PathVariable Integer num1, @PathVariable Integer num2){
        return String.valueOf(num1 / num2);
    }
}
