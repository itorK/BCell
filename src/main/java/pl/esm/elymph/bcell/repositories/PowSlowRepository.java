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
import pl.esm.elymph.bcell.entities.PowSlow;
import pl.esm.elymph.bcell.entities.QPowSlow;

public interface PowSlowRepository extends CrudRepository<PowSlow, Integer>, QuerydslPredicateExecutor<PowSlow>, QuerydslBinderCustomizer<QPowSlow> {
    Page<PowSlow> findAll(Pageable pageable);

    @Query(value = "SELECT pslo_id,tkrz.slow_nazwa,twzk.slow_nazwa,pslo_slow_id_tkrz,pslo_priorytet,pslo_status,pslo_oper FROM pow_slow, slowniki tkrz,slowniki twzk WHERE pslo_status='T' AND tkrz.slow_id=pslo_slow_id_tkrz AND twzk.slow_id=pslo_slow_id_twzk AND twzk.slow_status<>'N' AND tkrz.slow_status<>'N'", nativeQuery = true)
    Page<PowSlow> findAllKont(Pageable pageable);

    @Procedure(procedureName = "prDodajPslo")
    String prDodajPslo(String arg1, String arg2, String arg3, String arg4, String arg5);

    @Procedure(procedureName = "prUsunPslo")
    String prUsunPslo(String arg1, String arg2);

    @Override
    default public void customize(QuerydslBindings bindings, QPowSlow user) {
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