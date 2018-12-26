package cl.roisel.apps.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import cl.roisel.apps.apirest.models.entity.Cliente;

public interface IClienteDao extends CrudRepository<Cliente, Long>{

}
