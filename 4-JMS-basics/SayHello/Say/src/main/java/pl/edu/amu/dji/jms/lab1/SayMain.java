package pl.edu.amu.dji.jms.lab1;

import org.apache.activemq.ActiveMQConnectionFactory;

import javax.jms.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SayMain {

    public static final String EXIT = "exit";

    public static void main(String[] args) throws Exception {
        ConnectionFactory connectionFactory = new ActiveMQConnectionFactory("tcp://localhost:61616");
<<<<<<< HEAD

        /*
        Create Connection instance from ConnectionFactory


        Create Session instance from connection object.
        - Session shouldn't by transactional and should by in auto acknowledge mode (Session.AUTO_ACKNOWLEDGE).

        Create Destination queue from session (check Session class and createQueue method)
        - queue name should be "SayHelloQueue"

        Create MessageProducer from session for given queue/topic
        - set producer delivery mode to non persistent (DeliveryMode.NON_PERSISTENT);
         */


        Connection connection = createConnection();
        Session session = null;
        Destination queue = null;
        MessageProducer producer = null;


        connection.start();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String text = "";
        while (!text.equalsIgnoreCase(EXIT)) {
            System.out.print("Say hello to:");
            text = bufferedReader.readLine();

            //Create TextMessage from session with text variable
            //Send this message to queue (use producer for that)
        }

        //Close stuff
=======
        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
        Destination queue = session.createQueue("SayHelloQueue");
        MessageProducer producer = session.createProducer(queue);

<<<<<<< HEAD
        /*
        Create Connection instance from ConnectionFactory

        Create Session instance from connection object.
        - Session shouldn't by transactional and should by in auto acknowledge mode (Session.AUTO_ACKNOWLEDGE).

        Create Destination queue from session (check Session class and createQueue method)
        - queue name should be "SayHelloQueue"

        Create MessageProducer from session for given queue/topic
        - set producer delivery mode to non persistent (DeliveryMode.NON_PERSISTENT);
         */

        Connection connection = connectionFactory.createConnection();
        Session session = connection.createSession(false,Session.AUTO_ACKNOWLEDGE);
        Destination queue = session.createQueue("SayHelloQueue");
        MessageProducer producer = session.createProducer(queue);

        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT );

=======
        producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
>>>>>>> 70355818d5ae88cb22052c3f9bfc9fe16bb8925a

        connection.start();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
<<<<<<< HEAD

        String in = "";
        while (!in.equalsIgnoreCase(EXIT)) {

=======
        String in = "";
        while (!in.equalsIgnoreCase(EXIT)) {
>>>>>>> 70355818d5ae88cb22052c3f9bfc9fe16bb8925a
            System.out.print("Say hello to:");
            in = bufferedReader.readLine();
            TextMessage message = session.createTextMessage(in);
            producer.send(message);
<<<<<<< HEAD

            //Create TextMessage from session with text variable
            //Send this message to queue (use producer for that)
=======
>>>>>>> 70355818d5ae88cb22052c3f9bfc9fe16bb8925a
        }

>>>>>>> 70355818d5ae88cb22052c3f9bfc9fe16bb8925a
        session.close();
        connection.close();
    }
}

