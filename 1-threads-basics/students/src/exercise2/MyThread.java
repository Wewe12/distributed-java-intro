package exercise2;

public class MyThread extends Thread {

    private String name;

   public MyThread(String name){
        super();
        this.name=name;
    }

    @Override
    public void run(){
        for ( int i=0; i < 10; i++ ){
            System.out.println("Number" +i+ this.name());
        }

    }

}
