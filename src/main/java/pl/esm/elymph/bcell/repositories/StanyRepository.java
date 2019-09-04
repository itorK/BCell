package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.Stany;
import pl.esm.elymph.bcell.entities.WzorKomp;

public interface StanyRepository extends CrudRepository<Stany, Integer>, QuerydslPredicateExecutor<Stany> {
    Page<Stany> findAll(Pageable pageable);

    @Query(value = "SELECT stan_tow_id,CONCAT(slow_nazwa,' ',IFNULL(slow_rodzaj,''),' ',IFNULL(slow_kolor,''),' ',IFNULL(slow_wielkosc,''),' ',IFNULL(slow_rozmiar,'')) as slow_name,stan_ilosc_zak,stan_ilosc_zam,stan_suma,stan_wysl,case when schema()='metale' THEN (fnDajDostKompMET (stan_tow_id)) ELSE 0 END,stan_ilosc_zak,stan_wysp,stan_wypr,slow_grupa_wpa_id,slow_wpa_id_jedn,slow_zdjecie,slow_dodatek FROM stany,slowniki WHERE slow_id=stan_tow_id AND slow_status<>'N'",nativeQuery = true)
    Page<Stany> findAllByStan(Pageable pageable);

    @Procedure(procedureName = "prDodajZakup")
    String prDodajZakup(String arg1, String arg2, String arg3, Double arg4, Integer arg5, String arg6);


}
