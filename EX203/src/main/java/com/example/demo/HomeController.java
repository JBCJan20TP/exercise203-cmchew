package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class HomeController {
    @GetMapping("/officeform")
    public String loadFormPage(Model model) {
        model.addAttribute("office", new Office());
        return "officeform";
    }

    @PostMapping("/officeform")
    public String loadFromPage(@ModelAttribute Office office,
                               Model model) {
        model.addAttribute("office", office);
        return "confirmoffice";
    }
}

