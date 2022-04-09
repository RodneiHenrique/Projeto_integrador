package br.com.project.adv.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.project.adv.models.Clientes;

public interface ClienteRepository extends CrudRepository<Clientes, String>{

}
