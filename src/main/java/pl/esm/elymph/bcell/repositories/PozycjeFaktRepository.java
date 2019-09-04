package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.GrupaTow;
import pl.esm.elymph.bcell.entities.PozycjeFakt;

public interface PozycjeFaktRepository extends CrudRepository<PozycjeFakt, Integer>, QuerydslPredicateExecutor<PozycjeFakt> {
    Page<PozycjeFakt> findAll(Pageable pageable);

    @Procedure(procedureName = "prDodajPozycjeFak")
    String prDodajPozycjeFak(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6, String arg7, String arg8);

}
