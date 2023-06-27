package com.boutique.boutique.dto;

import java.util.Objects;

public class ProduitConsulatationDto {

    private String libelle;
    private Double prixVente;
    private Long quantiteStock;

    public ProduitConsulatationDto(Long quantiteStock2, String libelle, Double prixVente2) {
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

    public Long getQuantiteStock() {
	return this.quantiteStock;
    }

    public void setQuantiteStock(Long quantiteStock) {
	this.quantiteStock = quantiteStock;
    }

    @Override
    public int hashCode() {
	return Objects.hash(libelle, prixVente, quantiteStock);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	ProduitConsulatationDto other = (ProduitConsulatationDto) obj;
	return Objects.equals(this.libelle, other.libelle) && Objects.equals(this.prixVente, other.prixVente)
		&& Objects.equals(this.quantiteStock, other.quantiteStock);
    }

    @Override
    public String toString() {
	return "ProduitConsulatationdTO [libelle=" + this.libelle + ", prixVente=" + this.prixVente + ", quantiteStock="
		+ this.quantiteStock + "]";
    }

}
