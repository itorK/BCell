package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Parametry;
import pl.esm.elymph.bcell.entities.WartParam;

public interface WartParamRepository extends CrudRepository<WartParam, Integer>, QuerydslPredicateExecutor<WartParam> {
    Page<WartParam> findAll(Pageable pageable);
}
