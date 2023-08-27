package com.bms;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.bms.repository.MovieRepository;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.bms.entity.*;
//@EnableSwagger2
@SpringBootApplication
public class BookMyShowAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookMyShowAppApplication.class, args);
	}

	
//	 @Bean
//	   public Docket productApi() {
//	      return new Docket(DocumentationType.SWAGGER_2).select()
//	         .apis(RequestHandlerSelectors.basePackage("com.bms.controller")).build();
//	   }
//    @Bean
//    CommandLineRunner run(MovieRepository movieRepository) throws Exception {
//        return (String[] args) -> {
//            Movie movie = new Movie(1,"Dhoni","The movie about indain cricketer",(float) 9.0,"Biography",300.00);
//            movieRepository.save(movie);
//            movieRepository.findAll().forEach(System.out::println);
//        };
//    }
}

