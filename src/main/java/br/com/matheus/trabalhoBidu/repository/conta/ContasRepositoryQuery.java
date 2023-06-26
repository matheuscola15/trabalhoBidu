package br.com.matheus.trabalhoBidu.repository.conta;

import br.com.matheus.trabalhoBidu.model.Contas;
import br.com.matheus.trabalhoBidu.repository.filter.ContasFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ContasRepositoryQuery {
    public Page<Contas> Filtrar(ContasFilter contasFilter, Pageable pageable);

}
