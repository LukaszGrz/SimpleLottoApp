package com.example.lotto.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

@Controller
public class LottoController {

    @GetMapping("/")
    public String getHello(ModelMap modelMap){
        Set<Integer> set = new TreeSet<>();
        Random random = new Random();
        while (set.size() != 6){
               set.add(random.nextInt(49)+1 );
        }
        modelMap.put("numer",set);
        return "";
    }
}
