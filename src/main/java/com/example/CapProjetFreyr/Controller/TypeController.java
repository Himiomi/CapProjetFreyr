package com.example.CapProjetFreyr.Controller;

import com.example.CapProjetFreyr.Storage.Database;
import com.example.CapProjetFreyr.Entity.Type;
import com.example.CapProjetFreyr.Storage.DatabaseConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TypeController {

    private DatabaseConfig databaseMock;

    @Autowired
    public TypeController(DatabaseConfig databaseMock) {
        this.databaseMock=databaseMock;
    }

    @GetMapping("/type")
    public List<Type> getAllTypes(){
        List mylist = (List) Database.getTypes();
        return mylist;
    }
}
