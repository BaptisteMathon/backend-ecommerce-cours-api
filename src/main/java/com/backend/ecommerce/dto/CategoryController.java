package com.backend.ecommerce.dto;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.backend.ecommerce.controllers.CategoryDto;

@RestController
@RequestMapping("/v1/categories")
public class CategoryController {
    @GetMapping
    public List<CategoryDto> findAll() {
        return List.of(new CategoryDto(1L, "Ordi"));
    }
}
