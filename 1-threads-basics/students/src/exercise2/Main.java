package exercise2;

        import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList< Thread > list = new ArrayList< Thread >(4);
        String name;
        for ( int i = 0; i <4; i++ ){
            name = "Thread-"+i;
            MyThread thread = new MyThread(name);
            thread.run();
            list.add( thread );
            System.out.print("\n");
        }

        for ( int i = 0; i <list.size(); i++ ) {

            System.out.println("\n"+list.get(i));
            list.get(i).start();

        }
    }
}


