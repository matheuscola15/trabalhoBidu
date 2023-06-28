package br.com.matheus.trabalhoBidu.repository.filter;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

public class ContasFilter {

    private LocalDate dataconta;

    @Column(name = "valorconta")
    private BigDecimal valorConta;

    private String nomecliente;

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
