package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
