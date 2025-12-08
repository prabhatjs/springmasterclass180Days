package com.prabhat.springcontainer.springcontainer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringContainerApplication {

    public static void main(String[] args) {

      ApplicationContext factory= SpringApplication.run(SpringContainerApplication.class, args);
      Car car=factory.getBean(Car.class);//get car bean from the container

      car.drive();


    }

}
//Point ->Container manage the bean life cycle
//Point->what is bean definition