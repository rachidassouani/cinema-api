package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
