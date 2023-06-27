package com.boutique.boutique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.boutique.boutique.dto.ProduitConsulatationDto;
import com.boutique.boutique.service.ClientService;

@RestController
@RequestMapping(value = "/magasin")
public class ClientConsultationProduit {

    @Autowired
    private ClientService clientService;

    private ProduitConsulatationDto produitConsulatationDto;

    @GetMapping
    List<ProduitConsulatationDto> getProduitConsulatation() {
	return clientService.getProduits();

    }

    @DeleteMapping(value = "{id}")
    public void commandeProduit(@PathVariable("id") Integer id) {

	try {
	    if (produitConsulatationDto.getQuantiteStock() != null && produitConsulatationDto.getQuantiteStock() > 0) {
		clientService.Commande(id);
	    } else {
		throw new RuntimeException(
			"Le produit n'existe pas ou la quantité en stock est nulle. Impossible de commander ce produit.");
	    }

	} catch (Exception e) {
	    e.printStackTrace();
	}
    }

}
