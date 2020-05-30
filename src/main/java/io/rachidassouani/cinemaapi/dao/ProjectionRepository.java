package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.ProjectionMovie;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectionRepository extends JpaRepository<ProjectionMovie, Long> {
}
