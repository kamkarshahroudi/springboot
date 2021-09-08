package net.code.java.EntrevueSpringBootH2ver3.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;

@Entity
@Table(name = "acteurss")

public class Acteurs {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idacteur;
	

	
	@Column(name = "nom")
	private String nom;
	@Column(name = "prenom")
	private String prenom;
	
	@ManyToOne
	private Product product;

	public long getIdacteur() {
		return idacteur;
	}

	public void setIdacteur(long idacteur) {
		this.idacteur = idacteur;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
	
	
}
