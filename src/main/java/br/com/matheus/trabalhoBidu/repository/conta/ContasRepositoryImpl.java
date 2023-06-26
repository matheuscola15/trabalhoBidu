package br.com.matheus.trabalhoBidu.repository.conta;

import br.com.matheus.trabalhoBidu.model.Contas;
import br.com.matheus.trabalhoBidu.repository.filter.ContasFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class ContasRepositoryImpl implements ContasRepositoryQuery{

    @PersistenceContext
    EntityManager manager;

    public Page<Contas> Filtrar(ContasFilter contasFilter, Pageable pageable){
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Contas> criteria = builder.createQuery(Contas.class);
        Root<Contas> root = criteria.from(Contas.class);

        Predicate[] predicates = criarRestricoes(contasFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("dataconta")));

        TypedQuery<Contas> query = manager.createQuery(criteria);

        adicionarRestricoesDePaginacao(query, pageable);

        return new PageImpl<>(query.getResultList(), pageable, total(contasFilter));
    }

    private Predicate[] criarRestricoes(ContasFilter contasFilter, CriteriaBuilder builder, Root<Contas> root) {
        List<Predicate> predicates = new ArrayList<>();

        if(contasFilter.getDataconta() != null){
            predicates.add(builder.greaterThanOrEqualTo(root.get("dataconta"),
                    contasFilter.getDataconta()
            ));
        }

        if(contasFilter.getDataconta() != null){
            predicates.add(builder.lessThanOrEqualTo(root.get("dataconta"),
                    contasFilter.getDataconta()
            ));
        }

        return predicates.toArray(new Predicate[predicates.size()]);

    }

    private Long total(ContasFilter contasFilter) {

        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Long> criteria = builder.createQuery(Long.class);
        Root<Contas> root = criteria.from(Contas.class);

        Predicate[] predicates = criarRestricoes(contasFilter, builder, root);
        criteria.where(predicates);
        criteria.orderBy(builder.asc(root.get("dataconta")));

        criteria.select(builder.count(root));

        return manager.createQuery(criteria).getSingleResult();
    }

    private void adicionarRestricoesDePaginacao(TypedQuery<Contas> query, Pageable pageable) {
        int paginaAtual = pageable.getPageNumber();
        int totalRegistrosPorPagina = pageable.getPageSize();
        int primeiroRegistroDaPagina = paginaAtual * totalRegistrosPorPagina;

        query.setFirstResult(primeiroRegistroDaPagina);
        query.setMaxResults(totalRegistrosPorPagina);
    }

}
