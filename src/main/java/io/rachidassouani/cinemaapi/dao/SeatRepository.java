package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatRepository extends JpaRepository<Seat, Long> {
}
