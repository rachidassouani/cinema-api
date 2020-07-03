package io.rachidassouani.cinemaapi;

import io.rachidassouani.cinemaapi.entity.Movie;
import io.rachidassouani.cinemaapi.entity.Room;
import io.rachidassouani.cinemaapi.entity.Ticket;
import io.rachidassouani.cinemaapi.entity.Review;
import io.rachidassouani.cinemaapi.entity.City;
import io.rachidassouani.cinemaapi.entity.Cinema;

import io.rachidassouani.cinemaapi.service.ICinemaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;


@SpringBootApplication
public class CinemaApiApplication implements CommandLineRunner {

	@Autowired
	ICinemaInitService iCinemaInitService;

   	@Autowired
	RepositoryRestConfiguration restConfiguration;

   	public static void main(String[] args) {
		SpringApplication.run(CinemaApiApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
        restConfiguration.exposeIdsFor(Movie.class);
        restConfiguration.exposeIdsFor(Room.class);
        restConfiguration.exposeIdsFor(Ticket.class);
        restConfiguration.exposeIdsFor(Review.class);
        restConfiguration.exposeIdsFor(City.class);
        restConfiguration.exposeIdsFor(Cinema.class);

        iCinemaInitService.initUsers();
        iCinemaInitService.initCities();
		iCinemaInitService.initCinemas();
		iCinemaInitService.initRooms();
		iCinemaInitService.initSeats();
		iCinemaInitService.initSessions();
		iCinemaInitService.initCategories();
		iCinemaInitService.initMovies();
		iCinemaInitService.initReviews();
		iCinemaInitService.initProjections();
		iCinemaInitService.initTickets();
	}
}
