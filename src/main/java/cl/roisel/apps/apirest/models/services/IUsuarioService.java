package cl.roisel.apps.apirest.models.services;

import cl.roisel.apps.apirest.models.entity.Usuario;

public interface IUsuarioService {

	public Usuario findByUsername(String username);
	
}
