package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface MovieRepository extends JpaRepository<Movie, Long> {
}
