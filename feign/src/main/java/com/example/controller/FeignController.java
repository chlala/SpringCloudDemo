package com.example.controller;

import com.example.entity.Student;
import com.example.feign.FeignProviderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/feign")
public class FeignController {

    @Autowired
    private FeignProviderClient providerClient;

    @GetMapping("/findAll")
    public Collection<Student> findAll(){
        return providerClient.findAll();
    }

    @GetMapping("/index")
    public String index(){
        return providerClient.index();
    }
}
