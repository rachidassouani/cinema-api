package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface RoomRepository extends JpaRepository<Room, Long> {

    
        int countByCinemaId(Long cinemaId);
}
