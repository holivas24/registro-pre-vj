package controllers;

import play.*;
import play.mvc.*;
import java.util.*;
import models.*;

public class Application extends Controller {
		

    public static void index() {
    	Usuario user = new Usuario(pregunta);    	
    	render(user);
    }
    
    public static void crearUsuario()
    {
    	render();
    }
    
    public static void newUser(String pregunta) {
    	//List<Usuario> usuarios = Usuario.find("nivel.numero > ?1",getUser().nivel.numero).fetch();//Solo menores
    	List<Usuario> usuarios = Usuario.findAll();//todos
    	render(usuarios);

}
    
}