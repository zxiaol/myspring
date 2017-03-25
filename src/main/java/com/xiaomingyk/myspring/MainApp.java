package com.xiaomingyk.myspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by XZhu7 on 3/25/2017.
 */
public class MainApp {

    public static void main(String[] args){

        System.out.println("starting ....");

        ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        HelloWorld helloSingleton = (HelloWorld) context.getBean("HelloWorldSingleton");

        helloSingleton.getMessage();

        helloSingleton.setMessage("i am super man!");

        helloSingleton.getMessage();

        HelloWorld helloSingleton1 = (HelloWorld) context.getBean("HelloWorldSingleton");

        helloSingleton1.getMessage();

        /*--------prototype-----*/
        HelloWorld helloWorldPrototype = (HelloWorld) context.getBean("HelloWorldPrototype");

        helloWorldPrototype.getMessage();

        helloWorldPrototype.setMessage("i am new prototype!");

        helloWorldPrototype.getMessage();

        HelloWorld helloWorldPrototype1 = (HelloWorld) context.getBean("HelloWorldPrototype");

        helloWorldPrototype1.getMessage();

    }
}
