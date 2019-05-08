package com.codeup.blog.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String welcome() {
        return "home";
    }

    @GetMapping("/contact")
    public String showContactPage() {
        return "contact";
    }

    @GetMapping("/home/{name}")
    public String welcome(@PathVariable String name, Model viewModel) {

        List<String> names = new ArrayList<>();

        names.add("fer");
        names.add("daniel");
        names.add("sophie");
        names.add("ryan");

        if(name.equals("fer")){
            viewModel.addAttribute("admin", true);
        }
        viewModel.addAttribute("names", names);
        viewModel.addAttribute("username", name.toUpperCase());
        return "home";
    }
}