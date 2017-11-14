package br.edu.univas.si8.ta.clientes.ejb.beans;

import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Stateless;

import br.edu.univas.si8.ta.clientes.ejb.dao.ClienteDAO;
import br.edu.univas.si8.ta.clientes.ejb.entities.Cliente;
import br.edu.univas.si8.ta.clientes.ejb.interfaces.ClientesLocal;
import br.edu.univas.si8.ta.clientes.ejb.interfaces.ClientesRemote;

@Stateless
@Local(ClientesLocal.class)
@Remote(ClientesRemote.class)
public class ClientesBean implements ClientesLocal, ClientesRemote {

	@EJB
	private ClienteDAO dao;

	@Override
	public void createNewCliente(String clienteNome, String clienteEmail) {
		Cliente cliente = new Cliente();
		cliente.setNome(clienteNome);
		cliente.setEmail(clienteEmail);
		dao.insert(cliente);
	}

	@Override
	public String[] listClienteNome() {
		return dao.listAll()
				.stream()
				.map(Cliente::getNome)
				.collect(Collectors.toList())
				.toArray(new String[0]);
	}

	
	
}
