package com.boutique.boutique.service;

import java.util.List;

import com.boutique.boutique.dto.ProduitConsulatationDto;

public interface ClientService {

    List<ProduitConsulatationDto> getProduits();

    void Commande(Integer Id);

}
