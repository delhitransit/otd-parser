package com.delhitransit.core.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/admin")
public class AdminController {

    // TODO
    @PostMapping("init")
    public void initializeDatabase() {
    }

}
