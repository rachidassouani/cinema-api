package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
