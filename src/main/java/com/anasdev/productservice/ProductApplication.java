package com.anasdev.product;

import com.anasdev.product.model.Product;
import com.anasdev.product.repo.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class ProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {
            Stream.of(
                    Product.builder().name("Laptop").quantity(10).unitPrice(999.99).build(),
                    Product.builder().name("Phone").quantity(25).unitPrice(499.99).build(),
                    Product.builder().name("Tablet").quantity(15).unitPrice(299.99).build(),
                    Product.builder().name("Headphones").quantity(50).unitPrice(89.99).build()
            ).forEach(productRepository::save);

            productRepository.findAll().forEach(System.out::println);
        };
    }
}
