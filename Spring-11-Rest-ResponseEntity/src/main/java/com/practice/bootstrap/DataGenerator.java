package com.practice.bootstrap;

import com.practice.entity.Product;
import com.practice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerator implements CommandLineRunner {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {

        Product pc = new Product("DELL");
        Product laptop = new Product("MACBOOK");
        Product phone = new Product("Iphone");
        Product tablet = new Product("IPAD");

        productRepository.save(pc);
        productRepository.save(laptop);
        productRepository.save(phone);
        productRepository.save(tablet);
    }
}
