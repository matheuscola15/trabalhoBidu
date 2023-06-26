package br.com.matheus.trabalhoBidu.repository;


import br.com.matheus.trabalhoBidu.model.Contas;
import br.com.matheus.trabalhoBidu.repository.conta.ContasRepositoryQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContasRepository extends JpaRepository<Contas, Integer>, ContasRepositoryQuery {
}
