package com.prabhat.springcontainer.springcontainer;

import org.springframework.stereotype.Component;

@Component
public class Engine
{
    public Engine(){
        System.out.println("Engine Created");
    }
    public void StarEngine(){
        System.out.println("engine Started");
    }
}
