package com.prabhat.springcontainer.springcontainer;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    public Battery() {
        System.out.println("Battery Created");
    }
    public void providePower(){
        System.out.println("Battery gives Power to car");
    }
}
