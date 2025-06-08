package io.github.shirakamiame.service;

import io.github.shirakamiame.entity.Dish;
import io.github.shirakamiame.util.Page;

public interface DishService {
    Page<Dish> list(int current);
}
