package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;

public class Application extends Controller {
		

    public static void crearUsuario(String pregunta) {
    	Usuario user = new Usuario(pregunta);    	
    	render(user);
    }
    
    public static void index()
    {
    	render();
    }
    
    public static void newUser() {
    	//List<Usuario> usuarios = Usuario.find("nivel.numero > ?1",getUser().nivel.numero).fetch();//Solo menores
    	List<Usuario> usuarios = Usuario.findAll();//todos
    	render(usuarios);

}
    
}