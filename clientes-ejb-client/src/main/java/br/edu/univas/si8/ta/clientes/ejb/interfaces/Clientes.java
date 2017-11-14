package br.edu.univas.si8.ta.clientes.ejb.interfaces;

public interface Clientes {

	void createNewCliente(String clienteNome, String clienteEmail);
	String[] listClienteNome();
}
