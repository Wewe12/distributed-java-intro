package exercise3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        String name;
        ArrayList < Thread > list = new ArrayList < Thread > ( 4 );
        for ( int i = 0; i < 4; i++ ){
            name = "Thread-" + i;
            Thread thread = new Thread(new MyRunnable(), name );
            list.add( thread );

        }

        for ( int i = 0; i < list.size(); i++ ){
            list.get(i).start();
           // list.get(i).run();
            System.out.print( "\n" );
        }
    }
}
