package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Cinema;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CinemaRepository extends JpaRepository<Cinema, Long> {
}
