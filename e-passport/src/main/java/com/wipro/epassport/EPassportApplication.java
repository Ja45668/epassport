package com.wipro.epassport;

import com.wipro.epassport.Dao.EpassportRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@ComponentScan(basePackageClasses = {EpassportRepository.class})
@SpringBootApplication
public class EPassportApplication {

	public static void main(String[] args) {
		SpringApplication.run(EPassportApplication.class, args);
	}

}
