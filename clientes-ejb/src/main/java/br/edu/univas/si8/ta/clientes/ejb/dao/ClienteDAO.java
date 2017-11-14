package br.edu.univas.si8.ta.clientes.ejb.dao;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.edu.univas.si8.ta.clientes.ejb.entities.Cliente;

@Stateless
public class ClienteDAO {

	@PersistenceContext(unitName = "clients")
	private EntityManager em;

	public void insert(Cliente cliente) {
		em.persist(cliente);
	}

	public List<Cliente> listAll() {
		return em.createQuery("from clientes c", Cliente.class).getResultList();
	}
}
