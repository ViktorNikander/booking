package com.lasias.hostelbookingbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class HostelBookingBackendApplication {

	//TEST

	public static void main(String[] args) {
		SpringApplication.run(HostelBookingBackendApplication.class, args);
	}

}
