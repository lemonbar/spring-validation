package com.lemon.test;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.validation.Valid;

/**
 * Created by lemon on 2014/10/21.
 */
@Controller
public class TestController {

    @RequestMapping(value = "/signin", method = RequestMethod.POST)
    public String doSignin(@Valid UserForm userForm, BindingResult error, Model model) {
        String result = "welcome";
        if (error.hasErrors()) {
            return "signin";
        }
        return result;
    }

    @RequestMapping(value = "/signin", method = RequestMethod.GET)
    public String signin(Model model) {
        model.addAttribute(new UserForm());
        return "signin";
    }
}
