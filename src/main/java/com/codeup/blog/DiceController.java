package com.codeup.blog;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiceController {

    @GetMapping("/dice")

    public String rollDice () {
         return "dice";
    }
}
