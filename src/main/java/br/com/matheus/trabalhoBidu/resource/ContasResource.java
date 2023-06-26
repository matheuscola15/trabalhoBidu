package br.com.matheus.trabalhoBidu.resource;


import br.com.matheus.trabalhoBidu.dto.ContasDTO;
import br.com.matheus.trabalhoBidu.model.Contas;
import br.com.matheus.trabalhoBidu.repository.ContasRepository;
import br.com.matheus.trabalhoBidu.repository.filter.ContasFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")

public class ContasResource {

    @Autowired
    private ContasRepository contasRepository;

    @GetMapping
    public Page<ContasDTO> pesquisar(ContasFilter contasFilter, Pageable pageable){
        return contasRepository.Filtrar(contasFilter, pageable);
    }

    @GetMapping("/todos")
    public List<Contas> listarTodasContas(){
        return contasRepository.findAll();
    }




}
