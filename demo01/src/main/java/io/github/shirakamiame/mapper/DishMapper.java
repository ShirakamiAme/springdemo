package io.github.shirakamiame.mapper;

import io.github.shirakamiame.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DishMapper {
    List<Dish> getDishByLimit(int offset, int size);

    int getCount();
}
