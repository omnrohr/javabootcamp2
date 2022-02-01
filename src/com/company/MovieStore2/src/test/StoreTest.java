package com.company.MovieStore2.src.test;


import com.company.MovieStore2.src.main.models.Movie;
import com.company.MovieStore2.src.main.models.Store;
import org.junit.Before;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertFalse;
import static org.testng.AssertJUnit.assertTrue;

public class StoreTest {

    Store store;

    @Before
    public void setup() {
        store = new Store();
        store.addMovie(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2));
        store.addMovie(new Movie("The Godfather", "Blue-Ray", 9.1));

    }

    @Test
    public void movieAdded() {
        assertTrue(store.contains(new Movie("The Godfather", "Blue-Ray", 9.1)));
    }

    @Test
    public void sellMovieTest() {
        store.sellMovie("The Shawshank Redemption");
        assertFalse(store.contains(new Movie("The Shawshank Redemption", "Blue-Ray", 9.2)));
    }

    @Test
    public void rentMovieTest() {
        store.rentMovie("The Godfather");
        assertFalse(store.getMovie(1).isAvailable());
    }

    @Test
    public void returnMovieTest() {
        store.rentMovie("The Godfather");
        store.returnMovie("The Godfather");
        assertTrue(store.getMovie(1).isAvailable());
    }


}

