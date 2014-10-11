package exercise2;

public class MyThread extends Thread {

    private String name;

   public MyThread(String name){
        super(name);
       
    }

    @Override
    public void run(){
        for ( int i=0; i < 10; i++ ){
            System.out.println("Number " +i+" "+ super.getName());
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }

}
