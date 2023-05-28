package org.example.model;

import java.security.Principal;

public class MyPrincipal implements Principal {

    private String name;

    public MyPrincipal(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }
}
