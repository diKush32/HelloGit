package com.api.TestGit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@ComponentScan({"com.api.TestGit"})

@Configuration
@EnableScheduling
@EnableAutoConfiguration (exclude = { HibernateJpaAutoConfiguration.class, JpaRepositoriesAutoConfiguration.class,DataSourceAutoConfiguration.class })

public class App  extends SpringBootServletInitializer
{
    public static void main( String[] args )
    {

		SpringApplication.run(App.class, args);
		System.out.println("Hello world builder" );
		
		
    }
    
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(App.class);
    }
	
}
