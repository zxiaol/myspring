package com.xiaomingyk.twoinjectbeans;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by My on 3/25/2017.
 */
public class MainApp {

    public static void main(String[] args){

        AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        TextEditor checkerConsInject = (TextEditor)context.getBean("TextEditorConsInject");

        checkerConsInject.spellCheck();

        TextEditor checkerSetterInject = (TextEditor)context.getBean("TextEditorSetterInject");

        checkerSetterInject.spellCheck();
    }
}
