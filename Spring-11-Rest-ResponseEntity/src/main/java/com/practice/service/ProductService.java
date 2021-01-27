package com.practice.service;


import com.practice.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getProducts();
    List<Product> delete(Long id);
    List<Product> updateProduct(Long id,Product product);
    List<Product> createProduct(Product product);
    Product getProduct(Long id);

}
