package models;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import play.db.jpa.Model;
import play.libs.Codec;

@Entity
public class Usuario extends Model{
	public int boleto;
	public String nombre;
	public String telefono;
	public int pago;
	public String username;
	public String password;
	
	public Usuario() {}

	public Usuario(int boleto, String nombre, String telefono, int pago) {
		this.boleto = boleto;
		this.nombre = nombre;
		this.telefono = telefono;
		this.pago = pago;
		this.save();
	}
	
	
	
	

}
