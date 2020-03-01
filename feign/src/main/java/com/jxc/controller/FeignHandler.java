package com.jxc.controller;

import com.jxc.entiity.Student;
import com.jxc.feign.FeignProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignHandler {
    @Autowired
    private FeignProvider feignProvider;

    @GetMapping("/findAll")
    public Collection<Student> findAll() {
        return feignProvider.findAll();
    }

    @GetMapping("/index")
    public String index() {
        return feignProvider.index();
    }

}
