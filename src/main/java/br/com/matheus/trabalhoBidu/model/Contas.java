package br.com.matheus.trabalhoBidu.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Objects;

@Entity
@Table(name = "contas")

public class Contas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private LocalDate dataconta;
    @Column(name = "valorconta")
    private BigDecimal valorConta;

    @ManyToOne
    @JoinColumn(name = "id_cliente")
    private Cliente cliente;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contas contas = (Contas) o;
        return id.equals(contas.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
