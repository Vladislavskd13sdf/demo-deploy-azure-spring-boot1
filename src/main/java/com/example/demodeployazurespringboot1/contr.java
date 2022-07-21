package com.example.demodeployazurespringboot1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class contr
{

    @GetMapping("/")
    public String gg()
    {
        return "Good)";
    }
}
