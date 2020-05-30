package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MovieRepository extends JpaRepository<Movie, Long> {
}
