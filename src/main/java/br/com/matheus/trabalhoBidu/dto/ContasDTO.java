package br.com.matheus.trabalhoBidu.dto;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class ContasDTO {

    private Integer id;
    private LocalDate dataconta;
    @Column(name = "valorconta")
    private BigDecimal valorConta;
    private String nomecliente;

    public ContasDTO(Integer id, LocalDate dataconta, BigDecimal valorConta, String nomecliente) {
        this.id = id;
        this.dataconta = dataconta;
        this.valorConta = valorConta;
        this.nomecliente = nomecliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDataconta() {
        return dataconta;
    }

    public void setDataconta(LocalDate dataconta) {
        this.dataconta = dataconta;
    }

    public BigDecimal getValorConta() {
        return valorConta;
    }

    public void setValorConta(BigDecimal valorConta) {
        this.valorConta = valorConta;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
}
