package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Faktury;
import pl.esm.elymph.bcell.entities.GrupaTow;

public interface FakturyRepository extends CrudRepository<Faktury, Integer>, QuerydslPredicateExecutor<Faktury> {
    Page<Faktury> findAll(Pageable pageable);

    @Procedure(procedureName = "prDodajFakture")
    String prDodajFakture(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6, String arg7, String arg8, String arg9);

    @Procedure(procedureName = "prEdytujFakture")
    String prEdytujFakture(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6, String arg7, String arg8, String arg9);

    @Procedure(procedureName = "prUsunFakture")
    String prUsunFakture(String arg1, String arg2);

}
