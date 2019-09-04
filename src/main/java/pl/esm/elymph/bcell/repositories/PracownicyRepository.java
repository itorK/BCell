package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.GrupaTow;
import pl.esm.elymph.bcell.entities.Pracownicy;

public interface PracownicyRepository extends CrudRepository<Pracownicy, Integer>, QuerydslPredicateExecutor<Pracownicy> {
    Page<Pracownicy> findAll(Pageable pageable);

    @Query(value="SELECT p.*,s.slow_nazwa, o.opt_ilosc,o.opt_id,o.opt_data_operacji, o.opt_slow_id_tkrz, o.opt_status, o.opt_data_zatw, (select slow_nazwa from slowniki where slow_id=opt_pslo_id_twzk AND slow_status<>'N') as slow from pracownicy p LEFT join operacje o on o.opt_prac_id=p.prac_id LEFT join slowniki s ON o.opt_slow_id_tkrz=s.slow_id",nativeQuery = true)
    Page<Pracownicy> findAllWorkers(Pageable pageable);

    @Procedure(procedureName = "prEdytujPrac")
    String prEdytujPrac(String arg1, String arg2);

}
