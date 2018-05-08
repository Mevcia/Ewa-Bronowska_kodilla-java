package com.kodilla.stream.beautifier;

public class PoemBeautifier {
    public void beutify(String text, PoemDecorator poemDecorator) {
        String newText = poemDecorator.decorate(text);
        System.out.println("Original text: \"" + text + "\" and a new text: \"" + newText + "\"");
    }
}
