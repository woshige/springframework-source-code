package com.spring.source.core.dependencies.constructor;

/**
 * @author sunlichao
 */
public class SimpleMovieLister {
    /**
     * the SimpleMovieLister has a dependency on a MovieFinder
     */
    private  MovieFinder movieFinder;

    /**
     * Constructor-based dependency injection
     * a constructor with a number of arguments,each representing a dependency
     *
     * the same to use a factory-method to  accomplish dependency injection
     * @param movieFinder dependency
     */
    public SimpleMovieLister(MovieFinder movieFinder) {
        this.movieFinder = movieFinder;
    }
}
