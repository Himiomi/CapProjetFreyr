package com.example.CapProjetFreyr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

    @GetMapping("/type")
    public List<Type> getAllTypes(){
        List mylist = (List) Database.getTypes();
        return mylist;
    }
}
