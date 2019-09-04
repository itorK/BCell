package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Dokumenty;
import pl.esm.elymph.bcell.entities.Faktury;

public interface DokumentyRepository extends CrudRepository<Dokumenty, Integer>, QuerydslPredicateExecutor<Dokumenty> {
    Page<Dokumenty> findAll(Pageable pageable);

    @Procedure(procedureName = "prDodajDok")
    String prDodajDok(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6);

    @Procedure(procedureName = "prZatwierdzDok")
    String prZatwierdzDok(String arg1, String arg2);

}
