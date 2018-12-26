package cl.roisel.apps.apirest.models.services;

import java.util.List;

import cl.roisel.apps.apirest.models.entity.Cliente;

public interface IClienteService {

	public List<Cliente> findAll();
	public Cliente findById( Long id );
	
}
