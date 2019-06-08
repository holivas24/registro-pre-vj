package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class Usuario extends Model{
	public String nombre;
	public String email;
	public String iglesia;
	public String username;
	public String password;
	
	public Usuario() {}

	public Usuario(String nombre, String email, String iglesia) {
		this.nombre = nombre;
		this.email = email;
		this.iglesia = iglesia;
		this.save();
	}
	
	
	
	

}
