package com.bukowskaewelina.app;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Item {

    private final String name;


    public Item( String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

}
