package com.bukowskaewelina.app;


import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;


public class App
{
    public static void main( String[] args ) throws ExecutionException, InterruptedException {

        Chairman chairman = new Chairman();
        MarketManager manager = new MarketManager(chairman);

        manager.registerPeople();
        manager.openMarket();

        try {
            TimeUnit.SECONDS.sleep(30);

        } catch (InterruptedException e) {

        }

        manager.closeMarket();


    }
}
