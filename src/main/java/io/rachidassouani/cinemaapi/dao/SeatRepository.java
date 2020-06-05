package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface SeatRepository extends JpaRepository<Seat, Long> {
}
