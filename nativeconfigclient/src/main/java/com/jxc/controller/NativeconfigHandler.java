package com.jxc.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/native")
public class NativeconfigHandler {

    @Value("${server.port}")
    private String port;

    @GetMapping("/index")
    private String index() {
        return this.port;
    }
}
