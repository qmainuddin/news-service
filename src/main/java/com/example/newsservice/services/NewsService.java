package com.example.newsservice.services;


import com.example.newsservice.dtos.NewsDto;

import java.util.List;

public interface NewsService {
    void create(NewsDto newsDto);

    List<NewsDto> findAll();

    NewsDto update(NewsDto newsDto, Long id);

    NewsDto getNewsById(Long id);

    void delete(Long id);
}

