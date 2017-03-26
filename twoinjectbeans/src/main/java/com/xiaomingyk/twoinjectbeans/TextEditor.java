package com.xiaomingyk.twoinjectbeans;

/**
 * Created by My on 3/25/2017.
 */
public class TextEditor {

    private SpellChecker spellChecker;

    public TextEditor(){

        System.out.println("Create instance using default constructor");
    }

    public TextEditor(SpellChecker spellChecker){

        System.out.println("Initialize spell checker in constructor.");

        this.spellChecker = spellChecker;

    }


    public void setSpellChecker(SpellChecker spellChecker){

        System.out.println("Initialize spell checker in setter.");

        this.spellChecker = spellChecker;
    }

    public void spellCheck(){

        spellChecker.spellCheck();
    }
}
