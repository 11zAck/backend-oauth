package cl.roisel.apps.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.roisel.apps.apirest.models.entity.Usuario;

public interface IUsuarioDao extends CrudRepository<Usuario, Long>{

	public Usuario findByUsername( String username );
		
}
