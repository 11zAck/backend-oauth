package cl.roisel.apps.apirest.models.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import cl.roisel.apps.apirest.models.entity.Cliente;
import cl.roisel.apps.apirest.models.entity.Region;

public interface IClienteDao extends JpaRepository<Cliente, Long>{
	
	@Query("from Region")
	public List<Region> findAllRegiones();

}
