package com.bukowskaewelina.app;


import java.util.ArrayList;
import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

public class Chairman implements Runnable{

   private final BlockingQueue<Item> queueOfItem = new ArrayBlockingQueue<Item>(10);
   private ArrayList<Recipient>  listofRecipient = new ArrayList<Recipient>(10);
    private MarketManager manager;

    public Chairman (MarketManager manager){
        this.manager = manager;

    }


    public Chairman(){  }

    public MarketManager getManager(){
        return this.manager;
    }
    public void registerItem(Item i) throws InterruptedException {

       // System.out.println(queueOfItem.size());

        if (queueOfItem.size() < 10) {
            queueOfItem.offer(i);
            System.out.println("Registering " + i.getName());
        }
        else{
            System.out.println("Queue is full");
            Thread.sleep(1000);
        }


    }

    public void registerRecipient(Recipient r){
        listofRecipient.add(r);
        System.out.println("Registering " + r.getName());


    }




    Recipient  winingRecipient() throws InterruptedException {

        Recipient recipient = new Recipient();
        Random rand = new Random();

        recipient = listofRecipient.get(rand.nextInt(10));

        recipient.setItem(queueOfItem.take());


//        notify();

        return recipient;
    }


    public void run(){

        while(!queueOfItem.isEmpty()) {

            try {
                Recipient recipient = winingRecipient();

                System.out.println("Winnning Recipient: " + recipient.getName());

                Thread.sleep(1000);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }


        }


        System.out.println("Chairman says good bye");

    }

}
