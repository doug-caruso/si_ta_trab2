package br.edu.univas.si8.ta.clientes.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/clients")
public interface ClientesService {
	@GET
	@Path("/clients/nomes")
	@Produces(MediaType.APPLICATION_JSON)
	String[] listClientesNomes();

	@POST
	@Path("/clients/{nome}/email/{email}")
	@Produces(MediaType.APPLICATION_JSON)
	String saveNewClient(@PathParam("nome") String nome, @PathParam("email") String email);
}
