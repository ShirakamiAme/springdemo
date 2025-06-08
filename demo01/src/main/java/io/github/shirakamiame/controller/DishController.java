package io.github.shirakamiame.controller;

import io.github.shirakamiame.entity.Dish;
import io.github.shirakamiame.service.DishService;
import io.github.shirakamiame.util.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dish")
public class DishController {
    @Autowired
    private DishService dishService;
    @RequestMapping("/list/{current}")
    public String list(@PathVariable int current, Model model) {
        Page<Dish> page = dishService.list(current);
        model.addAttribute("page", page);
        return "dish/index";
    }
}
