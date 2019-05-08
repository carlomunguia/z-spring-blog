package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class DiceController {

    @GetMapping("/roll-dice")
    public String rollDiceView() {
        return "roll-dice";
    }

    @GetMapping("/roll-dice/{n}")
    @ResponseBody
    public String viewGuessDice(@PathVariable int n, Model model) {
        model.addAttribute("guess", n);
        int dice = (int) Math.floor(Math.random() * 6 + 1);
        model.addAttribute("dice", dice);
        return "guess-dice";
    }
}
