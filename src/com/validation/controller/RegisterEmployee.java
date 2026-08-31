package com.validation.controller;

import com.validation.model.Employee;
import com.validation.services.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
public class RegisterEmployee {
    @Autowired
    private RegistrationService registrationService;

    @RequestMapping("/")
    public String showRegisterForm(Model model) {
        model.addAttribute("employee", new Employee());
        return "registerForm";
    }

    @RequestMapping("/registerEmployee")
    public String registerEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("employee", employee);
            return "registerForm";
        }
        registrationService.save(employee);
        model.addAttribute("employee", employee);
        return "formDetails";
    }

    @InitBinder
    private void initBinder(WebDataBinder binder) {
        // Trim whitespace from string inputs, converting all empty strings to null
        StringTrimmerEditor trimmerEditor = new StringTrimmerEditor(true);
        binder.registerCustomEditor(String.class, trimmerEditor);
    }
}
