package com.codeup.blog.repositories;

import com.codeup.blog.models.AdCategory;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<AdCategory, Long> {
}