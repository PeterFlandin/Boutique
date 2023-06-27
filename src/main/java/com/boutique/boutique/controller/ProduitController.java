package com.boutique.boutique.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.boutique.boutique.dto.ProduitDto;
import com.boutique.boutique.model.Produit;
import com.boutique.boutique.service.AdminService;

@RestController
@RequestMapping("admin/gestionBoutique/produit")
public class ProduitController {

    @Autowired
    private AdminService produitService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<ProduitDto> getProduit() {
	return produitService.getProduits();
    }

    @PostMapping("/ajouter")
    @ResponseStatus(HttpStatus.CREATED)
    public void postProduit(@RequestBody ProduitDto request) {

	produitService.addProduit(request);
    }

    @DeleteMapping("/Supprimer/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduit(@PathVariable("id") Integer id) {
	produitService.deleteProduit(id);
    }

    @PutMapping("/modifier/{id}")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void updateProduit(@PathVariable("id") Integer id, @RequestBody Produit produit) {
	produitService.updateProduit(produit);
    }

}