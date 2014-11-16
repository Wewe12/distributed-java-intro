package com.bukowskaewelina.app;


import java.util.concurrent.Callable;

public class Recipient implements Callable<Recipient>{

    private  String name;
    private Item item = null;

    Recipient(){
    }

    Recipient(String name){
        this.name = name;
    }
    public void setItem(Item item){
        this.item = item;
    }

    public Item getItem(){
        return this.item;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    @Override
    public Recipient call() throws Exception{

        Recipient recipient = new Recipient (getName());


        return recipient;




    }
}
