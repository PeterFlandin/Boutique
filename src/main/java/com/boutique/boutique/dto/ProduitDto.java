package com.boutique.boutique.dto;

import java.util.Objects;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

public class ProduitDto {
    @NotBlank(message = "obligatoire")
    @Size(min = 3, message = "3 lettre minimum et 10 maximum")
    private String libellé;
    @NotBlank(message = "obligatoire")
    private Double prixVente;
    @NotBlank(message = "obligatoire")
    private Double prixAchat;
    @NotBlank(message = "obligatoire")
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
	return Objects.hash(libellé, prixAchat, prixVente, quantiteStock);
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
	return Objects.equals(this.libellé, other.libellé) && Objects.equals(this.prixAchat, other.prixAchat)
		&& Objects.equals(this.prixVente, other.prixVente)
		&& Objects.equals(this.quantiteStock, other.quantiteStock);
    }

}
