package com.example.productservice;

import com.example.productservice.Entity.Produit;
import com.example.productservice.Repository.ProduitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProductServiceApplication implements CommandLineRunner {

    @Autowired
    ProduitRepository produitRepository;

    public static void main(String[] args) {
        SpringApplication.run(ProductServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        produitRepository.save(new Produit(null, "MacBook Pro M1", 12000.0));
        produitRepository.save(new Produit(null, "MacBook Air M1", 11500.0));
        produitRepository.save(new Produit(null, "MacBook Pro M1 Max", 18000.0));
    }
}
