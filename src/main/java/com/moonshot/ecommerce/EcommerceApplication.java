EcommerceApplication.java:

package com.moonshot.ecommerce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }
}ProductController.java:

package com.moonshot.ecommerce.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    // 这里我们将使用伪数据，实际应用中应该从数据库获取
    private static final Product[] PRODUCTS = {
        new Product("Product 1", 10.0),
        new Product("Product 2", 20.0),
        new Product("Product 3", 30.0)
    };

    @GetMapping
    public Product[] listProducts() {
        return PRODUCTS;
    }

    // 其他API端点（如获取单个商品、创建新商品等）将在这里添加
}

class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    // Getters and setters...
}
