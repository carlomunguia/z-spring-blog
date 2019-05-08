package com.codeup.blog.controllers;

import com.codeup.blog.models.Property;
import com.codeup.blog.repositories.PropertyRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class PropertyController {

    private final PropertyRepository propCRUD;

    public PropertyController(PropertyRepository properties) {
        this.propCRUD = properties;
    }

    @GetMapping("/properties")
    @ResponseBody
    protected String getProperties() {

//        Property prop1 = new Property();
//        prop1.setAddress("123 Main Street");
//        prop1.setDescription("A very nice home. You'll love it.");
//        propCRUD.save(prop1);
//
//        Property codeup = new Property();
//        codeup.setAddress("600 Navarro Street");
//        codeup.setDescription("An 18-week career accelerator...");
//        propCRUD.save(codeup);

//        List<Property> properties = IteratorUtils.toList(propCRUD.findAll().iterator());

        List<Property> properties = propCRUD.findByBedrooms(3);
        for (Property property : properties) {
            System.out.println(property.getId());
            System.out.println(property.getAddress());
        }
        return "success";
    }



}