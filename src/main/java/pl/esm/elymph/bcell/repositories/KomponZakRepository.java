package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.KomponZak;
import pl.esm.elymph.bcell.entities.Stany;

public interface KomponZakRepository extends CrudRepository<KomponZak, Integer>, QuerydslPredicateExecutor<KomponZak> {
    Page<KomponZak> findAll(Pageable pageable);

}
