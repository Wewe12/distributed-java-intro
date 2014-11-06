package exercise3;

import common.html.GazetaHtmlDocument;
import common.html.HtmlDocument;

import java.util.concurrent.Callable;

public class WordCounter implements Callable<Integer>{

    private final String documentUrl;
    private final String wordToCount;

    @Override
    public Integer call() throws Exception {

        HtmlDocument newDocument = new GazetaHtmlDocument(documentUrl);
        String content = newDocument.getContent().toLowerCase();



        return null;
    }

    public WordCounter(String documentUrl, String wordToCount) {
        this.documentUrl = documentUrl;
        this.wordToCount = wordToCount;
    }
}
