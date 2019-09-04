package pl.esm.elymph.bcell.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.repository.CrudRepository;
import pl.esm.elymph.bcell.entities.DokPozycje;
import pl.esm.elymph.bcell.entities.Dokumenty;
import pl.esm.elymph.bcell.entities.GrupaTow;

public interface DokPozycjeRepository extends CrudRepository<DokPozycje, Integer>, QuerydslPredicateExecutor<DokPozycje> {
    Page<DokPozycje> findAll(Pageable pageable);

    @Query(value = "SELECT dpz_id as id,RTRIM(CONCAT(slow_nazwa,' ',IFNULL(slow_rodzaj,''),' ',IFNULL(slow_kolor,''),' ',IFNULL(slow_wielkosc,''),' ',IFNULL(slow_rozmiar,''),' ',fnDajNazweKpoz(dpz_id),' ' ,fnDajNazweElem(dpz_ele_id))) as name,dok_komentarz as location,dpz_ilosc as ilosc,dpz_dok_id as ilosc_zak,dok_data_gen as data_zam,dpz_data_wprow as data_wprow,null as data_mod,dpz_tow_id as uzyt_wprow,dpz_uzyt_wprow as uzyt_mod,dpz_slow_id as gtow,dok_nr as widocznosc,dpz_typ_oper as opis,null as ilosc_zam,dok_komentarz as komentarz,(select wpa_nazwa from wart_param where wpa_id=dpz_jedn_wpa_id) as sDod16, dpz_komentarz as sDod17,slow_nazwa as sDod18,slow_zdjecie as sDod19 FROM dok_pozycje,slowniki,dokumenty WHERE slow_id=dpz_slow_id and dok_id=dpz_dok_id AND slow_status<>'N' AND dpz_dok_id=? UNION ALL SELECT dpz_id as id,dpz_wlasny,dok_komentarz as location,dpz_ilosc as ilosc,dpz_dok_id as ilosc_zak,dok_data_gen as data_zam,dpz_data_wprow as data_wprow,null as data_mod,dpz_tow_id as uzyt_wprow,dpz_uzyt_wprow as uzyt_mod,dpz_slow_id as gtow,dok_nr as widocznosc,dpz_typ_oper as opis,null as ilosc_zam,dok_komentarz as komentarz,(select wpa_nazwa from wart_param where wpa_id=dpz_jedn_wpa_id) as sDod16, dpz_komentarz as sDod17,dpz_wlasny as sDod18,'' as sDod19 FROM dok_pozycje,dokumenty  WHERE dok_id=dpz_dok_id AND dok_id=dpz_dok_id AND LENGTH(TRIM(dpz_wlasny))>0 AND dpz_dok_id=?", nativeQuery = true)
    Page<DokPozycje> findAllActive(Pageable pageable);

    @Procedure(procedureName = "prDodajDokPoz")
    String prDodajDokPoz(String arg1, String arg2, String arg3,String arg4, String arg5, String arg6, String arg7, String arg8, String arg9, String arg10, String arg11, String arg12, String arg13, String arg14);;

    @Procedure(procedureName = "prUsunDokPoz")
    String prUsunDokPoz(String arg1, String arg2);

}
