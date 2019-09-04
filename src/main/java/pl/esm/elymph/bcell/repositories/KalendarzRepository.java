package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.GrupaTow;
import pl.esm.elymph.bcell.entities.Kalendarz;

public interface KalendarzRepository extends CrudRepository<Kalendarz, Integer>, QuerydslPredicateExecutor<Kalendarz> {
    Page<Kalendarz> findAll(Pageable pageable);
}
