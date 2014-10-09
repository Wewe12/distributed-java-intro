package exercise2;

        import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList< Thread > list = new ArrayList< Thread >(4);
        String name;
        for ( int i = 0; i < list.size(); i++ ){
            name = "Thread-"+i;
            MyThread thread = new MyThread(name);
            thread.run();

            list.add( thread );
        }

        for ( int i = 0; i < list.size(); i++ ) {
            System.out.println( i+ " "+list.get(i).getName());
        }

        System.out.println( "finished");
    }
}

