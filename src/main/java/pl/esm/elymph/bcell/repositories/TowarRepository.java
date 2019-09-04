package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.KomponZak;
import pl.esm.elymph.bcell.entities.Towar;

public interface TowarRepository extends CrudRepository<Towar, Integer>, QuerydslPredicateExecutor<Towar> {
    Page<Towar> findAll(Pageable pageable);

    @Query(value="SELECT towar.tow_id, grupa_tow.gtow_nazwa, slowniki.slow_nazwa, towar.tow_zam,  towar.tow_data_zam, towar.tow_data_wprow,  towar.tow_data_mod, towar.tow_uzyt_wprow, towar.tow_uzyt_mod, towar.tow_gtow_id, towar.tow_zak, towar.tow_status,towar.tow_komentarz FROM towar, slowniki, grupa_tow WHERE towar.tow_slow_id_tkrz=slowniki.slow_id and grupa_tow.gtow_id=towar.tow_gtow_id AND slow_status<>'N' AND 1=1", nativeQuery = true)
    Page<Towar> findAllActive(Pageable pageable);

    @Query(value="SELECT towar.tow_id, grupa_tow.gtow_nazwa, slowniki.slow_nazwa, towar.tow_zam, towar.tow_suma,  towar.tow_data_zam, towar.tow_data_wprow,  towar.tow_data_mod, towar.tow_uzyt_wprow, towar.tow_uzyt_mod, towar.tow_gtow_id, towar.tow_zak , towar.tow_status,towar.tow_komentarz FROM towar LEFT JOIN slowniki ON slowniki.slow_id = towar.tow_slow_id_tkrz LEFT JOIN grupa_tow ON towar.tow_gtow_id = grupa_tow.gtow_id WHERE towar.tow_status='O'",nativeQuery = true)
    Page<Towar> findAllSend(Pageable pageable);


    @Procedure(procedureName = "prDodajTowar")
    String prDodajTowar(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6);

    @Procedure(procedureName = "prZrealizujTowar")
    String prZrealizujTowar(String arg1, String arg2);

    @Procedure(procedureName = "prUsunTowar")
    String prUsunTowar(String arg1, String arg2);

}
