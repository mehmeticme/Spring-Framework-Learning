package com.rest1.controller;

import com.rest1.entity.Product;
import com.rest1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {


    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }


    @GetMapping(value = "/{id}")
    public Product getProduct(@PathVariable("id") Long id){

        return productService.getProduct(id);
    }
    @GetMapping
    public List<Product> getProducts(){
        return productService.getProducts();
    }

    //CREATE
    @PostMapping
    public List<Product> createProduct(@RequestBody Product product){
            return productService.createProduct(product);
    }

    //DELETE
    @DeleteMapping(value = "/{id}")
    public List<Product> deleteProduct(@PathVariable("id") Long id) {
        return productService.delete(id);

    }

    //UPDATE
    @PutMapping(value = "products/{id}")
    public List<Product> updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.updateProduct(id,product);
    }
}
