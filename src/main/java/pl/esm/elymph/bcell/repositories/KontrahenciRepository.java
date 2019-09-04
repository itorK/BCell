package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Faktury;
import pl.esm.elymph.bcell.entities.Kontrahenci;

public interface KontrahenciRepository extends CrudRepository<Kontrahenci, Integer>, QuerydslPredicateExecutor<Kontrahenci> {
    Page<Kontrahenci> findAll(Pageable pageable);

    @Procedure(procedureName = "prDodajKont")
    String prDodajKont(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14);

    @Procedure(procedureName = "prEdytujKont")
    String prEdytujKont(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14, String arg15);

}
