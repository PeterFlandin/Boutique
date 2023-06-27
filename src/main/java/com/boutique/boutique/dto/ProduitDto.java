package com.boutique.boutique.dto;

import java.util.Objects;

import jakarta.validation.constraints.Size;

public class ProduitDto {
    @Size(min = 3, message = "3 lettre minimum et 10 maximum")
    private String libelle;
    private Double prixVente;
    private Double prixAchat;
    private Long quantiteStock;

    public ProduitDto(String libelle, Integer id, Double prixAchat2, Double prixVente2, Long quantiteStock2) {
    }

    public String getLibelle() {
	return this.libelle;
    }

    public void setLibelle(String libelle) {
	this.libelle = libelle;
    }

    public Double getPrixVente() {
	return this.prixVente;
    }

    public void setPrixVente(Double prixVente) {
	this.prixVente = prixVente;
    }

    public Double getPrixAchat() {
	return this.prixAchat;
    }

    public void setPrixAchat(Double prixAchat) {
	this.prixAchat = prixAchat;
    }

    public Long getQuantiteStock() {
	return this.quantiteStock;
    }

    public void setQuantiteStock(Long quantiteStock) {
	this.quantiteStock = quantiteStock;
    }

    @Override
    public int hashCode() {
	return Objects.hash(libelle, prixAchat, prixVente, quantiteStock);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ProduitDto other = (ProduitDto) obj;
	return Objects.equals(this.libelle, other.libelle) && Objects.equals(this.prixAchat, other.prixAchat)
		&& Objects.equals(this.prixVente, other.prixVente)
		&& Objects.equals(this.quantiteStock, other.quantiteStock);
    }

}
