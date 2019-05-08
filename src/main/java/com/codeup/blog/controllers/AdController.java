
package com.codeup.blog.controllers;

import com.codeup.blog.models.Ad;
import com.codeup.blog.repositories.AdRepository;
import com.codeup.blog.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class AdController {
    private final AdRepository adsRepo;
    private final UserRepository userRepo;

    public AdController(AdRepository ads, UserRepository users) {
        this.adsRepo = ads;
        this.userRepo = users;
    }

    @GetMapping("/ads")
    public String showPosts(Model model) {
//        init();

        model.addAttribute("ads", adsRepo.findAll());
        return "ads/index";
    }

    @GetMapping("/ads/{id}")
    public String showAd(@PathVariable long id, Model model) {
        Ad ad = adsRepo.findOne(id);
        model.addAttribute("ad", ad);
        return "ads/show";
    }

    @GetMapping("/ads/create")
    public String showCreateForm(Model model) {
        model.addAttribute("ad", new Ad());
        return "ads/create";
    }

    @PostMapping("/ads/create")
    @ResponseBody
    public String createPost(@ModelAttribute Ad ad) {
        //@RequestParam String title, @RequestParam String description){
//        Ad newAd = new Ad();
//        newAd.setTitle(title);
//        newAd.setDescription(description);
//        newAd.setOwner(userRepo.findOne(1L));
//        adsRepo.save(newAd);
        ad.setOwner(userRepo.findOne(1L));
        adsRepo.save(ad);
        return "new ad created";
    }