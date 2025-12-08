package com.prabhat.springcontainer.springcontainer;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

//old way to create object in java,build car add battery engine and tyre
//New Spring comes to picture after object is created by ur self and manage by you

    //The Spring IOC Container says you don't need to create object -I will create and manage them for you.

    @Autowired
    Battery battery;
    @Autowired
    Engine engine;
    @Autowired
    Tyre tyre;

    public Car(){
        System.out.println("Car Constructor create car");
            }
            //container handle life cycle before drive method this method run and run checks its happen by @PostConstruct
            @PostConstruct
            public void intialCheck(){
                System.out.println("Unlock the car");
                System.out.println("Check car tyre air before the car object initialize");
    }

            public void drive(){
            System.out.println("------------------drive Started-----------------------s");
                //add object method with old way
                battery.providePower();
                engine.StarEngine();
                tyre.rotate();

                System.out.println("-------------Drive Completed------------------------");
            }

    //final checks its handle by container
//when my container is container the check before conatiner destory
    @PreDestroy
    public void finalCheck(){
        System.out.println("Car is Locked ");
    }

}

