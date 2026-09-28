package com.agecalculator.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Year;

@Controller
public class AgeController {

    @RequestMapping("/")
    public String showForm() {
        return "ageCalculatorForm";
    }

    @RequestMapping("/resultView")
    public String calculateMyAge(
            @RequestParam("yearParam") String year,
            @RequestParam("monthParam") String month,
            @RequestParam("dayParam") String day,
            Model model) {
        model.addAttribute("age", calculateAge(Integer.parseInt(year), Integer.parseInt(month), Integer.parseInt(day)));
        return "resultView";
    }

    private String calculateAge(int year, int month, int day) {
        int age = Year.now().getValue() - year;
        System.out.println("you are " + age + " years old");
        return String.valueOf(age);
    }
}
