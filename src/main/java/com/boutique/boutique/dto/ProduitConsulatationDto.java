package com.boutique.boutique.dto;

import java.util.Objects;

public class ProduitConsulatationDto {

    private String libellé;
    private Double prixVente;
    private Long quantiteStock;

    public String getLibellé() {
	return this.libellé;
    }

    public void setLibellé(String libellé) {
	this.libellé = libellé;
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
	return Objects.hash(libellé, prixVente, quantiteStock);
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
	return Objects.equals(this.libellé, other.libellé) && Objects.equals(this.prixVente, other.prixVente)
		&& Objects.equals(this.quantiteStock, other.quantiteStock);
    }

    @Override
    public String toString() {
	return "ProduitConsulatationdTO [libellé=" + this.libellé + ", prixVente=" + this.prixVente + ", quantiteStock="
		+ this.quantiteStock + "]";
    }

}
