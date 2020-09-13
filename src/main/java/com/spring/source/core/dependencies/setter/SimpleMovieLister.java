package com.spring.source.core.dependencies.setter;

/**
 * @author sunlichao
 * Setter-based DI is accompplished by a container calling a setter methods on your bean after invoking a no-argument constuctor
 * or no-argument static factory method to instantiate your bean
 */
public class SimpleMovieLister {
    private MovieFinder movieFinder;

    public SimpleMovieLister() {
    }

    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    public MovieFinder getMovieFinder() {
        return movieFinder;
    }

    public void setMovieFinder(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }

    @Override
    public String toString() {
        return "SimpleMovieLister{" +
                "movieFinder=" + movieFinder +
                '}';
    }
}
