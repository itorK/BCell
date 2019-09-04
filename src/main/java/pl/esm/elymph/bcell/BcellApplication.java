package pl.esm.elymph.bcell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;
import pl.esm.elymph.bcell.configs.CustomRoutingDataSource;
import pl.esm.elymph.bcell.services.DatabaseService;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableSpringDataWebSupport
public class BcellApplication {

	public static void main(String[] args) {
		SpringApplication.run(BcellApplication.class, args);
	}
	@Bean
	public DataSource dataSource(){
		CustomRoutingDataSource customDataSource=new CustomRoutingDataSource();
		customDataSource.setTargetDataSources(DatabaseService.getDataSourceHashMap());
		return customDataSource;
	}
}
