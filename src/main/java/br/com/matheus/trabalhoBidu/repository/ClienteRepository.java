package br.com.matheus.trabalhoBidu.repository;

import br.com.matheus.trabalhoBidu.model.Cliente;
import br.com.matheus.trabalhoBidu.repository.cliente.ClienteRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer>, ClienteRepositoryQuery {
}
