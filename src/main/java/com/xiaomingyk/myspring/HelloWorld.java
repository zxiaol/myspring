package com.xiaomingyk.myspring;

/**
 * Created by XZhu7 on 3/25/2017.
 */
public class HelloWorld {

    private String message;

    public String getMessage(){

        System.out.println(message);

        return message;
    }

    public void setMessage(String message) {

        this.message = message;

    }

    public void initPrototype(){

        System.out.println("Initializing HelloWorld in the way of prototype.");
    }

    public void initSingleton(){

        System.out.println("Initializing HelloWorld in the way of singleton.");
    }

    public void destroyPrototype(){

        System.out.println("Destroying HelloWorld in the way of prototype.");
    }

    public void destroySingleton(){

        System.out.println("Destroying HelloWorld in the way of singleton.");
    }

}
