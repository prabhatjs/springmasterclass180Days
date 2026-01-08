package com.car.example.Bean;

public class MyBean {

    private String name;
    public void setName(String name) {
        this.name = name;
    }

    public void ShowName(){
        System.out.println(name);
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "name='" + name + '\'' +
                '}';
    }
}
