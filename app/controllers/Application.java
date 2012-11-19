package controllers;

import play.*;
import play.mvc.*;
import play.data.Form;
import play.libs.Json;

import views.html.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import models.CreationCompte;
import models.UserAccount;


import org.codehaus.jackson.node.ObjectNode;

public class Application extends Controller {
  
    static Form<CreationCompte> creationCompteForm = form(CreationCompte.class);
    //static Form<Project> projectForm = form(Project.class);
  
  
    /* public static Result index() {
	    return ok(index.render("Bienvenu dans votre application 3DTWITTER."));
    }	*/    
    

	public static Result index() {
		return redirect(routes.Application.creationComptes());
	}
  






































}