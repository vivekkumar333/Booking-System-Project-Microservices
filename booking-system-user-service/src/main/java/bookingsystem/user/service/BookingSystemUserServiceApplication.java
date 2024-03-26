package bookingsystem.user.service;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BookingSystemUserServiceApplication {
	
	private static Logger LOGGER = LogManager.getLogger(BookingSystemUserServiceApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BookingSystemUserServiceApplication.class, args);
	}

}
