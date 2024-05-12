package com.MegabyteSized.FlightDetailsAPI;

import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableEncryptableProperties
public class FlightDetailsApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(FlightDetailsApiApplication.class, args);
	}

}
