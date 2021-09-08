package ProjetWithLombok;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@Table(name="film")
@Entity
@Setter
@Getter
@ToString
public class Film {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	@Column(name = "titre")
	private String titre;
	@Column(name = "description")
	private String description;
	@Column(name = "idacteurs")
	private int idacteurs;

}
