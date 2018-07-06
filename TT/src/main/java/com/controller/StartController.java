package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StartController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(Model model){
        model.addAttribute("message", "Hi man");
        return "index";
    }

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String go(Model model){
        model.addAttribute("message", "Hi man");
        return "redirect://addController/";
    }



}
