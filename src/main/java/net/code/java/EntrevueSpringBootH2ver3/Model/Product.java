package net.code.java.EntrevueSpringBootH2ver3.Model;



import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.persistence.PrimaryKeyJoinColumn;



@Entity
@Table(name = "products")
@SecondaryTable(name="acteur",pkJoinColumns=@PrimaryKeyJoinColumn(name="idactur"))
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	

	
	@Column(name = "titre")
	private String titre;
	
	@Column(name = "description")
	private String description;
	
	
	
/*On To One*/
	@Column(name = "nom",table="acteur")
	private String nom;
	@Column(name = "prenom",table="acteur")
	private String prenom;
/*One To Many*/
	@OneToMany(mappedBy="product")
	private List<Acteurs>acteur;
	
	
	

	public List<Acteurs> getActeur() {
		return acteur;
	}


	public void setActeur(List<Acteurs> acteur) {
		this.acteur = acteur;
	}


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getTitre() {
		return titre;
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


	public void setTitre(String titre) {
		this.titre = titre;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}



	
	
	
	
}
