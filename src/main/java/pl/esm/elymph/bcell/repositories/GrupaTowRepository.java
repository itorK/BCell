package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.GrupaTow;
import pl.esm.elymph.bcell.entities.Towar;

public interface GrupaTowRepository extends CrudRepository<GrupaTow, Integer>, QuerydslPredicateExecutor<GrupaTow> {
    Page<GrupaTow> findAll(Pageable pageable);

    @Query(value = "SELECT g.gtow_id,g.gtow_nazwa,g.gtow_status,g.gtow_data,g.gtow_kont_id,(select k.kont_nazwa FROM kontrahenci k WHERE k.kont_id=g.gtow_kont_id) as widocznosc FROM grupaTow g", nativeQuery = true)
    Page<GrupaTow> findAllActive(Pageable pageable);
    @Procedure(procedureName = "prDodajGrupa")
    String prDodajGrupa(String arg1, String arg2, String arg3,String arg4, String arg5);

    @Procedure(procedureName = "prEdytujGrupa")
    String prEdytujGrupa(String arg1, String arg2, String arg3,String arg4, String arg5);

}
