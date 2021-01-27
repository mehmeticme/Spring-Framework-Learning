package com.rest1.implementation;

import com.rest1.entity.Product;
import com.rest1.repository.ProductRepository;
import com.rest1.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductServiceImpl implements ProductService {

    private ProductRepository productRepository;

    @Autowired
    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<Product> getProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> delete(Long id) {
        productRepository.deleteById(id);
        return productRepository.findAll();
    }

    @Override
    public List<Product> updateProduct(Long id, Product product) {
        Product obj = productRepository.findById(id).get();
        obj.setName(product.getName());
        productRepository.save(obj);

        return  productRepository.findAll();
    }

    @Override
    public List<Product> createProduct(Product product) {
        productRepository.save(product);
        return productRepository.findAll();
    }

    @Override
    public Product getProduct(Long id) {
        return productRepository.findById(id).get();
    }
}
