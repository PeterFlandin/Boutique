package com.boutique.boutique.service.implementation;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boutique.boutique.dto.ProduitConsulatationDto;
import com.boutique.boutique.repository.ProduitRepository;
import com.boutique.boutique.service.ClientService;

@Service
public class ClientServiceImpl implements ClientService {

    @Autowired
    private ProduitRepository produitRepository;

    @Override
    public List<ProduitConsulatationDto> getProduits() {
	return produitRepository.findAll().stream()
		.map(a -> new ProduitConsulatationDto(a.getQuantiteStock(), a.getLibelle(), a.getPrixVente()))
		.collect(Collectors.toList());
    }

    @Override
    public void Commande(Integer Id) {
	produitRepository.deleteById(Id);

    }

}
