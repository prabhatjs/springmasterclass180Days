package com.prabhat.springcontainer.springcontainer;

import org.springframework.stereotype.Component;

@Component
public class Tyre {
    public Tyre(){
        System.out.println("Tyre Created");
    }
    public void rotate(){
        System.out.println("rotate Started");
    }
}
