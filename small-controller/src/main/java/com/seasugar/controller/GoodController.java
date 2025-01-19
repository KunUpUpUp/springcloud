package com.seasugar.controller;

import com.seasugar.api.domain.Good;
import com.seasugar.api.service.GoodService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("good")
public class GoodController {
    @DubboReference
    private GoodService goodService;

    @GetMapping("{id}")
    public Good getGood(@PathVariable("id") Long id) {
        return goodService.getGoodById(id);
    }
}