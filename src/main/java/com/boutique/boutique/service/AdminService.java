package com.boutique.boutique.service;

import java.util.List;

import com.boutique.boutique.dto.ProduitDto;
import com.boutique.boutique.model.Produit;

public interface AdminService {

    List<ProduitDto> getProduits();

    void addProduit(ProduitDto produitDto);

    void updateProduit(Produit produit);

    void deleteProduit(Integer Id);

}
