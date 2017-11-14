package br.edu.univas.si8.ta.clientes.rest.impl;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;

import br.edu.univas.si8.ta.clientes.ejb.interfaces.Clientes;
import br.edu.univas.si8.ta.clientes.rest.api.ClientesService;

@RequestScoped
public class ClientesServiceImpl implements ClientesService{

	@EJB(mappedName = "java:app/clientes-ejb-0.1-SNAPSHOT/ClientesBean!br.edu.univas.si8.ta.clientes.ejb.interfaces.ClientesRemote")
	private Clientes cliente;

	
	@Override
	public String[] listClientesNomes() {
		return cliente.listClienteNome();	
	}

	@Override
	public String saveNewClient(String nome, String email) {
		cliente.createNewCliente(nome, email);
		return "{\"message\": \"Success\"}";
	}

}
