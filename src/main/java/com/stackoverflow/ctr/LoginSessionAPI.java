package com.stackoverflow.ctr;

import com.stackoverflow.svr.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v0.1/login")
public class LoginSessionAPI {

    @Autowired
    UserService service;

    @RequestMapping(method = RequestMethod.POST)
    public String verify(@RequestBody  AuthForm authForm) {
        String auth = service.excute(authForm.getId(), authForm.getPw());
        return auth;
    }
}