package com.codeup.blog.controllers;

import com.codeup.blog.repositories.CategoryRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class CategoryController {
    private final CategoryRepository catRepo;

    public CategoryController(CategoryRepository ads) {
        this.catRepo = ads;
    }

    @GetMapping("/category/{id}")
    public String showPost(@PathVariable long id, Model model) {
        model.addAttribute("category", catRepo.findOne(id));
        return "categories/show";
    }

}