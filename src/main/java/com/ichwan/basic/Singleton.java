package com.ichwan.basic;

public class Singleton {

    private static Singleton singleton;

    //static method untuk membuat object dirinya sendiri
    public static Singleton getInstance(){
        if (singleton == null){
            singleton = new Singleton();
        }

        return singleton;
    }

    private Singleton() {

    }
}
