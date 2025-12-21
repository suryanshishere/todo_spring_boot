package com.cool.springboot.myfirstwebapp.logincontroller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.ModelMap;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

@Controller
public class LoginController {
    // private static final Logger logger =
    // LoggerFactory.getLogger(LoginController.class);

    @GetMapping("/login")
    public String login(@RequestParam(required = false) String name,
            @RequestParam(required = false) String age,
            @RequestParam(required = false) String birthday,
            ModelMap model) {
        // logger.debug("name: {}", name);
        // logger.info("age: {}", age);
        // logger.info("birthday: {}", birthday);
        model.put("name", name);
        model.put("age", age);
        model.put("birthday", birthday);
        return "login";
    }

    @PostMapping("/login")
    public String welcome(@RequestParam String name, @RequestParam String password, ModelMap model) {
        model.put("name", name);
        return "welcome";
    }
}
