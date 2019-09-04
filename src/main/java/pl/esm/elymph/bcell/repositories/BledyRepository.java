package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Bledy;
import pl.esm.elymph.bcell.entities.WartParam;

public interface BledyRepository extends CrudRepository<Bledy, Integer>, QuerydslPredicateExecutor<Bledy> {
    Page<Bledy> findAll(Pageable pageable);
}
