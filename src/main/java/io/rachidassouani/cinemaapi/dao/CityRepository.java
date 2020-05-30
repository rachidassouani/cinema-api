package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City, Long> {
}
