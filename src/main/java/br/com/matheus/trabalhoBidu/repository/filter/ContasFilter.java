package br.com.matheus.trabalhoBidu.repository.filter;

import javax.persistence.Column;
import java.math.BigDecimal;
import java.util.Date;

public class ContasFilter {

    private Date dataconta;

    @Column(name = "valorconta")
    private BigDecimal valorConta;

    private String nomecliente;

    public Date getDataconta() {
        return dataconta;
    }

    public void setDataconta(Date dataconta) {
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
