package com.pranoppal.demoh2jpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {
    @Autowired
    private BookDao repo;


    @RequestMapping("/books")
    @ResponseBody
    public String getBooks(){
        return repo.findAll().toString();
    }
}
