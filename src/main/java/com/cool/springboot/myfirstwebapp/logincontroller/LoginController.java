package com.cool.springboot.myfirstwebapp.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;

@Controller
public class LoginController {

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String name,
            @RequestParam(required = false) String age,
            @RequestParam(required = false) String birthday,
            ModelMap model) {
        model.put("name", name);
        model.put("age", age);
        model.put("birthday", birthday);
        return "login";
    }
}
