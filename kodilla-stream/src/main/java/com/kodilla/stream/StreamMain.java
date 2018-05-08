package com.kodilla.stream;

import com.kodilla.stream.beautifier.PoemBeautifier;

public class StreamMain {
    public static void main(String[] args) {
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        poemBeautifier.beutify("Lalka", (text) -> "ABC " + text + " ABC");
        poemBeautifier.beutify("xyz", String::toUpperCase);
        poemBeautifier.beutify("This iS A plAin Text.", String::toLowerCase);
        poemBeautifier.beutify("Some text, ", (text) -> text.concat("and other text."));
    }
}
