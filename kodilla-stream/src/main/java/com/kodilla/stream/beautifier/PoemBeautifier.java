package com.kodilla.stream.beautifier;

import java.sql.SQLOutput;

public class PoemBeautifier {
    public void beautify(String textToDecorate, PoemDecorator poemDecorator){
        String textAfterDecorate = poemDecorator.decorate(textToDecorate);
        System.out.println("This is your text after beautifying: " + textAfterDecorate);
    }
}
