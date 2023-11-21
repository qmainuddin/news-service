package com.example.newsservice.repositories;

import com.example.newsservice.entities.News;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Long> {
}
