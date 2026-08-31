package com.profile.controller;

import com.profile.model.ProfileModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ProfileController {
    @RequestMapping("/")
    public String showProfileForm(Model model) {
        model.addAttribute("profileModel", new ProfileModel());
        return "profileForm";
    }

    @RequestMapping("/submitProfileForm")
    public String submitProfileForm(
            @ModelAttribute("profileModel") ProfileModel profileModelData,
            Model model) {
        model.addAttribute("profileModel", profileModelData);
        return "profileData";
    }
}
