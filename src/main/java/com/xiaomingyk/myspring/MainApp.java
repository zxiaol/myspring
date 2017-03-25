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

        HelloWorld hello = (HelloWorld) context.getBean("HelloWorld");

        hello.getMessage();

    }
}
