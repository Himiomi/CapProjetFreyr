package com.example.CapProjetFreyr.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Type {

    @Getter
    @Setter
    private int id;

    @Getter
    @Setter
    private String name;
}
