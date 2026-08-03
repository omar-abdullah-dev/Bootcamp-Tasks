package main.com.myApp.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.time.Year;

@Controller
public class AgeController
{
    @RequestMapping("/")
    public String calculatorApp(){
        return "ageCalculatorForm";
    }

    @RequestMapping("resultView")
    public String resultView(@RequestParam ("yearParam")String year,
                             @RequestParam ("monthParam") String month,
                             @RequestParam ("dayParam") String day  ,
                             Model model ){
        String age=  calculateAge(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(day));
        model.addAttribute("age",age);
        return "resultView";
    }
    private String calculateAge (int year,int month ,int day ){
        int age= Year.now().getValue()- year;
        System.out.println("you are "+age +" years old");
        return  String.valueOf(age);
    }
}
