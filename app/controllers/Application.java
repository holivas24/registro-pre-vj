package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;

public class Application extends Controller {
		

    public static void index() {
    	//List<Usuario> usuarios = Usuario.find("nivel.numero > ?1",getUser().nivel.numero).fetch();//Solo menores
    	List<Usuario> usuarios = Usuario.findAll();//todos
    	render(usuarios);
    }
    
    public static void crearUsuario()
    {
    	render();
    }
    
    public static void newUser(int boleto, String nombre, String telefono, int pago) {
    	Usuario user = new Usuario(boleto,nombre,telefono,pago);    	
    	render(user);
    }
    
    public static void editarUsuario(Long id) {
    	Usuario user = Usuario.findById(id);
    	render(user);
    }
    

    public static void modificarUsuario(Long id,String nombre, String telefono,int boleto, int pago)
    {
    	Usuario user = Usuario.findById(id);
    	user.nombre = nombre;
    	user.telefono = telefono;
    	user.boleto = boleto;
    	user.save();
    	renderJSON(user);    	
    }
    
}