package br.com.matheus.trabalhoBidu.resource;


import br.com.matheus.trabalhoBidu.model.Contas;
import br.com.matheus.trabalhoBidu.repository.ContasRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/contas")

public class ContasResource {

    @Autowired
    private ContasRepository contasRepository;

    @GetMapping("/todos")
    public List<Contas> listarTodasContas(){
        return contasRepository.findAll();
    }



}
