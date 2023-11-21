package com.example.newsservice.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class News extends BaseEntity{
    private String title;
    private Long newsType_id;
    private String description;

}
