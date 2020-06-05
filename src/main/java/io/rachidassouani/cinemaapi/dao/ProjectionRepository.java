package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.ProjectionMovie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface ProjectionRepository extends JpaRepository<ProjectionMovie, Long> {
}
