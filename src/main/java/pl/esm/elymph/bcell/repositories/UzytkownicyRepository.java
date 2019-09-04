package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.GrupaTow;
import pl.esm.elymph.bcell.entities.Uzytkownicy;

public interface UzytkownicyRepository extends CrudRepository<Uzytkownicy, Integer>, QuerydslPredicateExecutor<Uzytkownicy> {
    Page<Uzytkownicy> findAll(Pageable pageable);

    @Procedure(procedureName = "prDodajUzyt")
    String prDodajUzyt(String arg1, String arg2, String arg3,String arg4);

    @Procedure(procedureName = "prZmienUzyt")
    String prZmienUzyt(String arg1, String arg2, String arg3,String arg4);
}
