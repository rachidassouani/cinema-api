package io.rachidassouani.cinemaapi.dao;

import java.util.List;
import io.rachidassouani.cinemaapi.entity.Cinema;
import io.rachidassouani.cinemaapi.entity.City;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CinemaRepository extends JpaRepository<Cinema, Long> {

    List<Cinema> findByCityId(Long id);

    long deleteCinemaByIdAndCityId(Long id, Long cityId);

//    Cinema findCinemaByIdAndCityId(Long id, Long cityId);


}
