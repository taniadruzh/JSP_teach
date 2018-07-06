package com.controller;

import com.models.Word;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/addController")
public class AddController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showPage(HttpServletRequest httpServletRequest, Model model) {
        model.addAttribute("name", "its name" + httpServletRequest.getParameter(""));
        return "add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(HttpServletRequest httpServletRequest, Model model) {
        model.addAttribute("name", "its name" + httpServletRequest.getParameter("name"));
        System.out.println(httpServletRequest.getParameter("name"));
        return "redirect:/addController/";
    }

    @RequestMapping(value = "/add2", method = RequestMethod.GET)
    public String add2(@ModelAttribute Word word, Model model) {

        System.out.println(word.getName()+ " -->"+ word.getName2());
        return "redirect:/addController/";
    }
}
