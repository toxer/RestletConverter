package it.infocamere.restletconverter.service;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/gedocRest")
public class GedocRest {
	@POST
	@Path("/scriviDocumento")
	
	@Produces(MediaType.APPLICATION_JSON)
	public Map scriviDocumento() {
		
		HashMap<String,String>map = new HashMap<String,String>();
		map.put("Message","OK");
		return map;
	}
}
