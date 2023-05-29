package com.dz11.manandwoman;

public class Man extends Person {

    public Man(String firstName, String lastName, int age, String partner) {
        super();
    }

    @Override
    public boolean isRetired() {
        return getAge() > 65;
    }
}


