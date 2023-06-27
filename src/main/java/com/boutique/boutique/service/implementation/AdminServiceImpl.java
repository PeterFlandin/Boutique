package com.boutique.boutique.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutique.boutique.dto.ProduitDto;
import com.boutique.boutique.model.Produit;
import com.boutique.boutique.repository.ProduitRepository;
import com.boutique.boutique.service.AdminService;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<ProduitDto> getProduits() {
	return produitRepository.findAll().stream().map(c -> new ProduitDto(c.getLibelle(), c.getId(), c.getPrixAchat(),
		c.getPrixVente(), c.getQuantiteStock())).collect(Collectors.toList());
    }

    @Override
    public void addProduit(ProduitDto produitDto) {
	Produit produit = new Produit();
	produit.setLibelle(produitDto.getLibelle());
	produit.setPrixAchat(produitDto.getPrixAchat());
	produit.setPrixVente(produitDto.getPrixVente());
	produit.setQuantiteStock(produitDto.getQuantiteStock());
	produitRepository.save(produit);
    }

    @Override
    public void updateProduit(Produit produit) {
	produitRepository.save(produit);
    }

    @Override
    public void deleteProduit(Integer Id) {
	produitRepository.deleteById(Id);

    }

}
