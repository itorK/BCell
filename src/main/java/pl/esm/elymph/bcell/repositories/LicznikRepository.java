package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Kontrahenci;
import pl.esm.elymph.bcell.entities.Licznik;

public interface LicznikRepository extends CrudRepository<Licznik, Integer>, QuerydslPredicateExecutor<Licznik> {
    Page<Licznik> findAll(Pageable pageable);
}
