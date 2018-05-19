package com.kodilla.good.patterns.challenges;

public class MoviePrinter {
    public static void main(String[] args) {
        MovieStore movieStore = new MovieStore();

        movieStore.getMovies().entrySet().stream()
                .flatMap(entry -> entry.getValue().stream())
                .forEach(l -> System.out.print(l + " ! "));
    }
}
