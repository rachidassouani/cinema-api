package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Ticket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TicketRepository extends JpaRepository<Ticket, Long> {
}
