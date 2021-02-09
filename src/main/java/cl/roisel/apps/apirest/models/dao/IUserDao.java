package cl.roisel.apps.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.roisel.apps.apirest.models.entity.User;

public interface IUserDao extends CrudRepository<User, Long>{

	public User findByUsername(String username );

}
