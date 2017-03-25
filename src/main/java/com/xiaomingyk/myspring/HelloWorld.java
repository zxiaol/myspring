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
}
