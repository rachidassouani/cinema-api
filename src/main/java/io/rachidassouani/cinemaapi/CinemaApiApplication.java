package io.rachidassouani.cinemaapi;

import io.rachidassouani.cinemaapi.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CinemaApiApplication implements CommandLineRunner {

	@Autowired
	ICinemaInitService iCinemaInitService;

	public static void main(String[] args) {
		SpringApplication.run(CinemaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iCinemaInitService.initCities();
		iCinemaInitService.initCinemas();
		iCinemaInitService.initRooms();
		iCinemaInitService.initSeats();
		iCinemaInitService.initSessions();
		iCinemaInitService.initCategories();
		iCinemaInitService.initMovies();
		iCinemaInitService.initProjections();
		iCinemaInitService.initTickets();
	}
}
