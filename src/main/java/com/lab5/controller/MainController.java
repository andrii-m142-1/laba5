package com.lab5.controller;

import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class MainController {
    @RequestMapping("/index")
    String index(){
        return "index";
    }
    @RequestMapping("/home")
    String home(@RequestParam String name,Model model){
        model.addAttribute("guest_name",name);
        return "home";
    }

}
