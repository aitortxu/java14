package com.java14.model;

public record Person(String name, int age) {
    private static String modifiedName = "";

    public Person {
        if (age<0){
            throw new IllegalArgumentException("Age should be greater than 0");
        }
    }

    public void modifyName(String modifiedName) {
        this.modifiedName = modifiedName;
    }
    public String name(){
        if (!modifiedName.isEmpty())
        {
            return this.modifiedName;
        }
        return name;
    }
}
