package com.cool.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.ui.ModelMap;
// import org.slf4j.Logger;
// import org.slf4j.LoggerFactory;

@Controller
@SessionAttributes("name")
public class LoginController {
    // private static final Logger logger =
    // LoggerFactory.getLogger(LoginController.class);
    private AuthenticationService authenticationService;

    public LoginController(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

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
        model.put("password", password);

        if (authenticationService.authenticate(name, password)) {
            return "welcome";
        }
        model.put("errorMessage", "Invalid credentials");
        return "login";
    }
}
