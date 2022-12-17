package com.tusofia.os.kursova.configuration;

import com.tusofia.os.kursova.daos.StudentDao;
import com.tusofia.os.kursova.services.StudentService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import javax.sql.DataSource;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "com.tusofia.os.kursova")
public class ComponentProvider {
    @Value("${db.driver}")
    String dataBaseDriver;
    @Value("${db.password}")
    String dataBasePasssword;
    @Value("${db.user}")
    String dataBaseUser;
    @Value("${db.url}")
    String databaseUrl;
    @Bean
    public DataSource dataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();

        dataSource.setDriverClassName(dataBaseDriver);
        dataSource.setUsername(dataBaseUser);
        dataSource.setPassword(dataBasePasssword);
        dataSource.setUrl(databaseUrl);

        return dataSource;
    }
}
