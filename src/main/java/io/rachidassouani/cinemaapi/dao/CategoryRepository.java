package io.rachidassouani.cinemaapi.dao;

import io.rachidassouani.cinemaapi.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*")
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
