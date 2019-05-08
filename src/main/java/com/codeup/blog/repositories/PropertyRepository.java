package com.codeup.blog.repositories;

import com.codeup.blog.models.Property;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PropertyRepository extends CrudRepository<Property,Long> {
    // List<Property> findAll();
    // Property findOne(Long id);
    // void save(Property property); // handles Create and Update
    // void delete(Property prop);
    List<Property> findByBedrooms(int bedrooms);
}