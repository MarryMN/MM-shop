package com.example.shop.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.shop.domain.Product;
import com.example.shop.service.ProductService;

@Controller
public class HomeController {
    private final ProductService productService;

    public HomeController(ProductService productService) {
        this.productService = productService;
    }

    @GetMapping(value = { "/home" })
    public String home(Model model) {
        model.addAttribute("products", getAllProducts());
        return "home";
    }

    @GetMapping("/about")
    public String about() {
        return "about";
    }

    private List<Product> getAllProducts() {
        return productService.findAllByOrderByIdAsc();
    }

}
