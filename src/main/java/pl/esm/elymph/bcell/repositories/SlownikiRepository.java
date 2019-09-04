package pl.esm.elymph.bcell.repositories;

import com.querydsl.core.types.dsl.StringPath;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import pl.esm.elymph.bcell.entities.QSlowniki;
import pl.esm.elymph.bcell.entities.Slowniki;

public interface SlownikiRepository extends CrudRepository<Slowniki, Integer>, QuerydslPredicateExecutor<Slowniki>, QuerydslBinderCustomizer<QSlowniki> {
    Page<Slowniki> findAll(Pageable pageable);

    @Procedure(procedureName = "prDodajSlow")
    String prDodajSlow(String arg1, String arg2, String arg3, Double arg4, Integer arg5, String arg6, Integer arg7, Integer arg8, Integer arg9, String arg10, String arg11, String arg12,String arg13, String arg14);

    @Procedure(procedureName = "prEdytujSlowDef")
    String prEdytujSlowDef(String arg1, String arg2, String arg3, Double arg4, Integer arg5, String arg6, Integer arg7, Integer arg8, Integer arg9, String arg10, String arg11, String arg12,String arg13, String arg14);

    @Procedure(procedureName = "prUsunSlow")
    String prUsunSlow(String arg1, String arg2, String arg3);

    @Override
    default public void customize(QuerydslBindings bindings, QSlowniki user) {
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