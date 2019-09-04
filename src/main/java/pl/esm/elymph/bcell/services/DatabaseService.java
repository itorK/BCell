package pl.esm.elymph.bcell.services;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import pl.esm.elymph.bcell.configs.Constants;

import java.util.HashMap;
import java.util.Map;


public class DatabaseService {
    public static Map<Object, Object> getDataSourceHashMap() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/magazyn");
        dataSource.setUsername("admin");
        dataSource.setPassword("esmtechnology");
        DriverManagerDataSource dataSource1 = new DriverManagerDataSource();
        dataSource1.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource1.setUrl("jdbc:mysql://localhost:3306/metale");
        dataSource1.setUsername("admin");
        dataSource1.setPassword("esmtechnology");
        DriverManagerDataSource dataSource2 = new DriverManagerDataSource();
        dataSource2.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource2.setUrl("jdbc:mysql://localhost:3306/administrator");
        dataSource2.setUsername("admin");
        dataSource2.setPassword("esmtechnology");
        HashMap hashMap = new HashMap();
        hashMap.put(Constants.MAGAZYN, dataSource);
        hashMap.put(Constants.METALE, dataSource1);
        hashMap.put(Constants.ADMIN, dataSource2);
        return hashMap;
    }
}
