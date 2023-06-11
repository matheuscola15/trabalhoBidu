package br.com.matheus.trabalhoBidu.repository.cliente;

import br.com.matheus.trabalhoBidu.model.Cliente;
import br.com.matheus.trabalhoBidu.repository.filter.ClienteFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteRepositoryQuery{

    public Page<Cliente> Filtrar(ClienteFilter clienteFilter, Pageable pageable);

}
