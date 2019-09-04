package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.KomponZak;
import pl.esm.elymph.bcell.entities.Operacje;

public interface OperacjeRepository extends CrudRepository<Operacje, Integer>, QuerydslPredicateExecutor<Operacje> {
    Page<Operacje> findAll(Pageable pageable);

    @Query(value="SELECT opt_id as id,opt_status as name,slow_nazwa as location,opt_ilosc as ilosc,opt_prac_id as ilosc_zak,opt_data_operacji as data_zam,null as data_wprow,null as data_mod,null as uzyt_wprow,null as uzyt_mod,opt_slow_id_tkrz as gtow,opt_status as widocznosc,opt_id as opis, null as ilosc_zam,opt_komentarz as komentarz,opt_data_zatw as sDod16 from operacje,slowniki where opt_slow_id_tkrz=slow_id AND slow_status<>'N'", nativeQuery=true)
    Page<Operacje> findByActive(Pageable pageable);
}
