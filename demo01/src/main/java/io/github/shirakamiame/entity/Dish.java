package io.github.shirakamiame.entity;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Dish {
    private int id;
    private String name;
    private String categoryName;
    private double price;
    private String status;
    private LocalDateTime createTime;
    private LocalDateTime updateTime;
}
