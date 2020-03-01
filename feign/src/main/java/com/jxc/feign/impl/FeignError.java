package com.jxc.feign.impl;

import com.jxc.entiity.Student;
import com.jxc.feign.FeignProvider;
import org.springframework.stereotype.Component;

import java.util.Collection;

@Component
public class FeignError implements FeignProvider {
    @Override
    public Collection<Student> findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务器维护中";
    }
}
