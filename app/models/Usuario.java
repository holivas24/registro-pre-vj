package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class Usuario extends Model{
	public String pregunta;
	
	public Usuario() {}

	public Usuario(String pregunta) {
		this.pregunta = pregunta;
		this.save();
	}
	
	
	
	

}
