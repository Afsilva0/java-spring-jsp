package com.personalsoft.afsilva.login.controller;

import com.personalsoft.afsilva.login.service.impl.AuthenticationServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {

    private AuthenticationServiceImpl authenticationService;

    public LoginController(AuthenticationServiceImpl authenticationService) {
        this.authenticationService = authenticationService;
    }

    @RequestMapping(value = "login", method = RequestMethod.GET)
    public String goToLoginPage() {
        return "login";
    }

    @RequestMapping(value = "login", method = RequestMethod.POST)
    public String goToWlcome(@RequestParam String name, @RequestParam String password, ModelMap modelMap) {

       if(authenticationService.authenticate(name,password)){
           modelMap.put("name", name);
           return "welcome";
        }

       modelMap.put("errorMessage","Error in the authentication");
        return "login";
    }
}
