package io.github.shirakamiame.service.impl;

import io.github.shirakamiame.entity.Dish;
import io.github.shirakamiame.mapper.DishMapper;
import io.github.shirakamiame.service.DishService;
import io.github.shirakamiame.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DishServiceImpl implements DishService {
        @Autowired
        private DishMapper dishMapper;
    @Override
    public Page<Dish> list(int current) {
        Page<Dish> page = new Page<>();
        page.setCurrent(current);
        page.setSize(3);
        int offset = (current - 1) * page.getSize();
        page.setList(dishMapper.getDishByLimit(offset, page.getSize()));
        page.setTotal(dishMapper.getCount());
        int end = (int) Math.ceil((double) page.getTotal() / page.getSize());
        page.setEnd(end);

        return page;
    }
}
