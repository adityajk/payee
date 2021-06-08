package com.tenx.universalbanking.payee.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payee")
public class HelloController {

    @RequestMapping("/hello")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String helloWorld() {
        return "Live. Die. Repeat.";
    }

    @RequestMapping("/hey")
    @PreAuthorize("hasRole('ROLE_ABC')")
    public String helloMansi() {
        return "Come find me when you wake up!!";
    }
}
