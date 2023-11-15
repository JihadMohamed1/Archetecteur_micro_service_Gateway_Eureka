package com.example.productservice.Repository;

import com.example.productservice.Entity.Produit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface ProduitRepository extends JpaRepository<Produit, Long> {
}
