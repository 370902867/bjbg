package com.example.demo.entity;

import lombok.Data;

@Data
public class Book {
    private Long id;
    private String title;
    private String author;
    private String isbn;
    private Double price;
    private String description;
} 