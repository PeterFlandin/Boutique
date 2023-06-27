package com.boutique.boutique.model;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Produit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String libelle;
    private Double prixVente;

    private Double prixAchat;

    private Long quantiteStock;

    public Integer getId() {
	return this.id;
    }

    public void setId(Integer id) {
	this.id = id;
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

    public Produit() {
	super();
	// TODO Auto-generated constructor stub
    }

    @Override
    public int hashCode() {
	return Objects.hash(id, libelle, prixAchat, prixVente, quantiteStock);
    }

    @Override
    public boolean equals(Object obj) {
	if (this == obj)
	    return true;
	if (obj == null)
	    return false;
	if (getClass() != obj.getClass())
	    return false;
	Produit other = (Produit) obj;
	return Objects.equals(this.id, other.id) && Objects.equals(this.libelle, other.libelle)
		&& Objects.equals(this.prixAchat, other.prixAchat) && Objects.equals(this.prixVente, other.prixVente)
		&& Objects.equals(this.quantiteStock, other.quantiteStock);
    }

    @Override
    public String toString() {
	return "Produit [id=" + this.id + ", libelle=" + this.libelle + ", prixVente=" + this.prixVente + ", prixAchat="
		+ this.prixAchat + ", quantiteStock=" + this.quantiteStock + "]";
    }

}
