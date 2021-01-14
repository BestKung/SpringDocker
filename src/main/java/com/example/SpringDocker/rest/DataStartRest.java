package com.example.SpringDocker.rest;

import com.example.SpringDocker.bean.DataStart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping(value = "data/start")
public class DataStartRest {

    @Autowired
    private DataStart dataStart;

    @GetMapping
    public DataStart loadDataStart() {
        return dataStart;
    }

}
