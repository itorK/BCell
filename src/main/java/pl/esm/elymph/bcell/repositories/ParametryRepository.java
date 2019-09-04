package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.GrupaTow;
import pl.esm.elymph.bcell.entities.Parametry;

public interface ParametryRepository extends CrudRepository<Parametry, Integer>, QuerydslPredicateExecutor<Parametry> {
    Page<Parametry> findAll(Pageable pageable);
}
