package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Moduly;
import pl.esm.elymph.bcell.entities.Stany;
import pl.esm.elymph.bcell.entities.Uzytkownicy;

public interface UprawnieniaRepository extends CrudRepository<Moduly, Integer>, QuerydslPredicateExecutor<Moduly> {
    Page<Moduly> findAll(Pageable pageable);

    @Query(value="SELECT m, p.pwm_uzyt_id FROM Moduly m LEFT JOIN PrawaWMod p ON p.pwm_mod_id=m.mod_id WHERE m.mod_nazwa_gwt IS NOT NULL AND m.mod_ident_gwt IS NOT NULL", nativeQuery = true)
    Page<Moduly> findAllByPrivileges(Pageable pageable);

    @Procedure(procedureName = "prDodajUpr")
    String prDodajUpr(String arg1, String arg2, String arg3);

    @Procedure(procedureName = "prEdytujUpr")
    String prEdytujUpr(String arg1, String arg2);

}
