package com.infy.customerMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.PropertySource;

import com.infy.customerMS.model.Customer;


@SpringBootApplication
@PropertySource(value={"classpath:messages.properties"})


public class EkartServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(EkartServerApplication.class, args);
	}

}
