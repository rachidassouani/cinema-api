package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
