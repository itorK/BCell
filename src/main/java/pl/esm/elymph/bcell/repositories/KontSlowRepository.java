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
import pl.esm.elymph.bcell.entities.*;

public interface KontSlowRepository extends CrudRepository<KontSlow, Integer>, QuerydslPredicateExecutor<KontSlow>, QuerydslBinderCustomizer<QKontSlow> {
    Page<KontSlow> findAll(Pageable pageable);

    @Query(value = "SELECT kslo_id,slow_nazwa,kslo_status,kslo_slow_id,kslo_kont_id FROM kont_slow, slowniki WHERE kslo_slow_id=slow_id and kslo_status='A' AND slow_status<>'N'", nativeQuery = true)
    Page<KontSlow> findAllKont(Pageable pageable);

    @Procedure(procedureName = "prDodajKslo")
    String prDodajKslo(String arg1, String arg2, String arg3);

    @Procedure(procedureName = "prUsunKslo")
    String prUsunKslo(String arg1, String arg2);

    @Override
    default public void customize(QuerydslBindings bindings, QKontSlow user) {
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
