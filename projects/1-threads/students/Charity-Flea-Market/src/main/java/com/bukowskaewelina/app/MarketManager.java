package com.bukowskaewelina.app;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MarketManager{

    public int numberOfDonors = 15;
    public int numberOfRecipient = 11;
    protected final Recipient recipient = new Recipient();
    protected final Donor donor = new Donor();
    private Chairman chairman;

    public List<Future<Donor>> donorList = new ArrayList<Future<Donor>>(numberOfDonors);
    public List<Future<Recipient>> recipientList = new ArrayList<Future<Recipient>>(numberOfRecipient);

    private ExecutorService executors = Executors.newCachedThreadPool();
    private ExecutorService executors2 = Executors.newCachedThreadPool();


    MarketManager(){

    }
    MarketManager(Chairman chairman){
        this.chairman = chairman;
    }

    public void setNumberOfRecipient(int numberOfRecipient) {
        this.numberOfRecipient = numberOfRecipient;
    }

    public void setnumberOfDonors(int numberOfDonors) {
        this.numberOfDonors = numberOfDonors;
    }

    public void setnumberOfRecipient(int numberOfRecipient) {
        this.numberOfRecipient = numberOfRecipient;
    }

    public int getNumberOfDonors(){
        return this.numberOfDonors;
    }

    public int getNumberOfRecipient(){
        return this.numberOfRecipient;
    }

    public void registerPeople() {



        for (int i = 0; i < numberOfDonors; ++i ) {
            Future<Donor> donorLists = executors.submit(new Donor("Donor " +i,new Item("Item "+i )));
            donorList.add(donorLists);
        }


       for (int i = 0; i < numberOfRecipient; ++i) {
           Future<Recipient> recipientLists = executors2.submit(new Recipient("Recipient " + i));
           recipientList.add(recipientLists);

       }
    }


    public void openMarket() throws ExecutionException, InterruptedException {



        for( Future<Recipient> recipientLists : recipientList ) {
            chairman.registerRecipient(recipientLists.get());
        }

        for( Future<Donor> donorLists : donorList ){
            chairman.registerItem(donorLists.get().getItem());
        }

        Thread thread = new Thread (chairman);
        thread.start();

    }
    public void closeMarket() throws ExecutionException, InterruptedException {


        executors.shutdown();
        executors2.shutdown();


     }


}









