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
    
    public static void newUser(String nombre, String email, String iglesia) {
    	Usuario user = new Usuario(nombre,email,iglesia);    	
    	render(user);
}
    
}