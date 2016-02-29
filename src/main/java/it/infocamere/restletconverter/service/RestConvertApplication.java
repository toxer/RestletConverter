package it.infocamere.restletconverter.service;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class RestConvertApplication extends Application {
	  private Set<Object> singletons = new HashSet<Object>();
	    public RestConvertApplication() {
	        singletons.add(new GedocRest());
	    
	       // singletons.add(new FakePrenotationService());
	    }
	    @Override
	    public Set<Object> getSingletons() {
	        return singletons;
	    }
}
