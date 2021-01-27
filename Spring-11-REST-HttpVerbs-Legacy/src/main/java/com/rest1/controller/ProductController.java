package com.rest1.controller;

import com.rest1.entity.Product;
import com.rest1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {


    private ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @RequestMapping(value = "/products/{id}",method = RequestMethod.GET)
    public @ResponseBody Product getProduct(@PathVariable("id") Long id){

        return productService.getProduct(id);
    }
    @RequestMapping(value = "/products",method = RequestMethod.GET)
    public @ResponseBody List<Product> getProducts(){
        return productService.getProducts();
    }

    //CREATE
    @RequestMapping(value = "/products",method = RequestMethod.POST)
        public @ResponseBody List<Product> createProduct(@RequestBody Product product){
            return productService.createProduct(product);
        }

    //DELETE
    @RequestMapping(value = "products/{id}", method = RequestMethod.DELETE)
    public @ResponseBody List<Product> deleteProduct(@PathVariable("id") Long id) {
        return productService.delete(id);

    }


    //UPDATE

    @RequestMapping(value = "products/{id}",method = RequestMethod.PUT)
    public @ResponseBody List<Product> updateProduct(@PathVariable("id") Long id,@RequestBody Product product){
        return productService.updateProduct(id,product);
    }
}
