package pl.esm.elymph.bcell.repositories;

import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.esm.elymph.bcell.entities.QSlowniki;
import pl.esm.elymph.bcell.entities.QWzorKomp;
import pl.esm.elymph.bcell.entities.WzorKomp;

public interface WzorKompRepository extends CrudRepository<WzorKomp, Integer>, QuerydslPredicateExecutor<WzorKomp>, QuerydslBinderCustomizer<QWzorKomp> {
    Page<WzorKomp> findAll(Pageable pageable);

    @Query(value="SELECT w.wzk_id,t1.slow_nazwa,t2.slow_nazwa,w.wzk_ilosc,w.wzk_slow_id_tkrz,w.wzk_slow_id_twzk,w.wzk_typ_oper FROM WzorKomp w,Slowniki t1,Slowniki t2 WHERE wzk_slow_id_tkrz=t1.slow_id AND t1.slow_status<>'N' AND t2.slow_status<>'N' and w.wzk_slow_id_twzk=t2.slow_id order by t1.slow_nazwa", nativeQuery = true)
    Page<WzorKomp> findAllByWzk(Pageable pageable);

    @Query(value = "SELECT 1 as id,CONCAT('Masz niezdefiniowane produkty: ',sum(b.tkrz),', kompon.: ',sum(b.twzk)) as name,'' as location,1 as ilosc,1 as ilosc_zak,NOW() as data_zam FROM (select count(*) as tkrz,0 as twzk FROM slowniki where NOT exists (select wzk_slow_id_tkrz FROM wzor_komp WHERE wzk_slow_id_tkrz=slow_id) and slow_tslo_kod='TKRZ' and slow_status <> 'N' union all select 0 as tkrz,count(*) as twzk FROM slowniki where NOT exists (select wzk_slow_id_twzk FROM wzor_komp WHERE wzk_slow_id_twzk=slow_id) and slow_tslo_kod='TWZK' and slow_status <> 'N') b", nativeQuery = true)
    Page<WzorKomp> findAllByNotFound(Pageable pageable);

 //   @Procedure(procedureName = "prDodajSlow")
 //   String prDodajSlow(String arg1, String arg2, String arg3, Double arg4, Integer arg5, String arg6, Integer arg7, Integer arg8, Integer arg9, String arg10, String arg11, String arg12,String arg13, String arg14);

    @Procedure(procedureName = "prUpdWzk")
    String prUpdWzk(String arg1, String arg2, String arg3, Double arg4, Integer arg5, String arg6, Integer arg7, Integer arg8, Integer arg9, String arg10, String arg11, String arg12,String arg13, String arg14);

 //   @Procedure(procedureName = "prUsunSlow")
//    String prUsunSlow(String arg1, String arg2, String arg3);
 @Override
 default public void customize(QuerydslBindings bindings, QWzorKomp user) {
     //bindings.bind(root.creationDateFrom).first((path, value) ->
     //        root.creationDate.after(value));
     //bindings.bind(root.creationDateTo).first((path, value) ->
     //        root.creationDate.before(value));

        /*
        bindings.bind(user.dateOfBirth).all((path, value) -> {

  Iterator<? extends LocalDate> it = value.iterator();
  return path.between(it.next(), it.next());
});
         */
     bindings.bind(String.class)
             .first((StringPath path, String value) -> path.containsIgnoreCase(value));
 }

}
