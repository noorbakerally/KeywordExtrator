import info.nooranibakerally.KeywordExtractor;

import java.io.IOException;
import java.util.Set;

public class main {
    public static void main(String [] args) throws IOException {
        String text = "This ontology describes sensors, actuators and observations, and related concepts. It does not describe domain concepts, time, locations, etc. these are intended to be included from other ontologies via OWL imports";

        String path = "/home/noor/Downloads/ProjectTest/WordNet3";
        KeywordExtractor extractor = new KeywordExtractor(path);
        Set<String> keywords = extractor.extractKeywords(text);
        System.out.println(keywords);
    }
}
