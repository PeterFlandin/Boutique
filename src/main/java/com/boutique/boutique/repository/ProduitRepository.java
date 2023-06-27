package com.boutique.boutique.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boutique.boutique.model.Produit;

@Repository
public interface ProduitRepository extends JpaRepository<Produit, Integer> {

}
