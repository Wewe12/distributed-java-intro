package com.bukowskaewelina.app;


import java.util.concurrent.Callable;

public class Donor implements Callable<Donor>{

    private String name;
    private Item item;

    Donor(){
    }

    Donor( String name, Item item ){
        this.name = name;
        this.item = item;
    }
    public Item getItem(){
        return this.item;
    }
    public String getName(){
        return this.name;
    }

    public Donor call() throws Exception{
        Donor donor = new Donor(getName(),getItem());


        return donor;
    }
}
