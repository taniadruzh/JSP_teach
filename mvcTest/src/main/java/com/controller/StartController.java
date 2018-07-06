package com.controller;

import com.dao.UserDao;
import com.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.soap.SOAPBinding;
import java.util.List;

@Controller
public class StartController {

    @Autowired
    private UserDao userDao;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String showIndex(Model model) {
        model.addAttribute("userList", userDao.userList());
        model.addAttribute("message", "Hi man");
        return "index";
    }

    @RequestMapping(value = "/go", method = RequestMethod.GET)
    public String go(Model model) {
        model.addAttribute("message", "Hi man");
        return "redirect://addController/";
    }


}
