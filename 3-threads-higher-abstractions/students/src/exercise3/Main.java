package exercise3;

import common.html.GazetaHtmlDocument;
import common.html.HtmlDocument;

import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main {

    public static void main(String[] args) throws Exception {
        HtmlDocument rootDocument = new GazetaHtmlDocument("http://wiadomosci.gazeta.pl/");
        Set<String> links = rootDocument.getLinks();
        String wordToFound = "sikorski";

        // TODO: Create ExecutorService
        ExecutorService executors = Executors.newCachedThreadPool();

        // TODO: Create list of results of type List<Future<Integer>>
          List<Future<Integer>> list = new List<Future<Integer>>(5);

        for (String link : links) {
            WordCounter counter = new WordCounter();
            executors.submit(counter);
            // TODO: Create new WordCounter and submit it to executorService
            // TODO: Store Future object in list of results
        }

        // TODO: shutdown executor
        executors.shutdown();

        int numberOfWords = 0;
        for (int i = 0; i<5; i++){

        }




        // TODO: Iterate over list of results and for each Future invoke get() method
        // TODO: add value returned from get() method to numberOfWords variable

        System.out.printf("Number of words '%s': %d", wordToFound, numberOfWords);
    }
}
