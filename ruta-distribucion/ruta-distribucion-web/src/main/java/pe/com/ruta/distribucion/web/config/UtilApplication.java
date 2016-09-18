package pe.com.ruta.distribucion.web.config;

import javax.naming.NamingException;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jndi.JndiObjectFactoryBean;
import org.springframework.web.WebApplicationInitializer;

import de.codecentric.boot.admin.model.Application;

@Configuration
@ComponentScan("pe.com.ruta.distribucion.*")
@EnableAutoConfiguration
public class UtilApplication extends SpringBootServletInitializer implements WebApplicationInitializer {

	// @Value("${util.application.datasource.persona.jndi-name}")
	// private String jndiDatasourcePersona;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(UtilApplication.class);
	}

	// @Bean
	// public DataSource dataSourcePer() {
	// JndiObjectFactoryBean jndi = new JndiObjectFactoryBean();
	// jndi.setExpectedType(DataSource.class);
	// jndi.setJndiName(jndiDatasourcePersona);
	//
	// try {
	// jndi.afterPropertiesSet();
	// } catch (NamingException e) {
	// logger.error("Error while retrieving datasource with JNDI name
	// jdbc/jndidatasource", e);
	// }
	// return (DataSource) jndi.getObject();
	// }
	//
	// @Bean
	// public JdbcTemplate jdbcTemplatePer() {
	// JdbcTemplate jdbcTemplate = new JdbcTemplate();
	// jdbcTemplate.setDataSource(dataSourcePer());
	// return jdbcTemplate;
	// }

	@Bean(name = "dataSource")
	public DriverManagerDataSource driverManagerDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/bdTest");
		dataSource.setUsername("root");
		dataSource.setPassword("root");
		return dataSource;
	}
}
