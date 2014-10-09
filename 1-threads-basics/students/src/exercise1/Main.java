package exercise1;


public class Main {

    public static void main(String[] args) {

       Thread thread = Thread.currentThread();
        System.out.println("thread name: " + thread.getName());
        System.out.println("thread ID: " + thread.getId());

    }
}
