package com.hotelRating.serviceRegistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MicorserviceHotelRatingAppServiceRegistryApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicorserviceHotelRatingAppServiceRegistryApplication.class, args);
		System.out.println("running the service REGISTRY...");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
	}

}
