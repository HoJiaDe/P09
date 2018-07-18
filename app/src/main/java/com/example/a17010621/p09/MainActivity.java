package com.example.a17010621.p09;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lvMovie;
    ArrayList<MovieItem> alMovieList;
    CustomAdapter caMovie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvMovie = findViewById(R.id.listViewMovie);
        alMovieList = new ArrayList<>();
        MovieItem item1 = new MovieItem("Avengers Infinity War", "Release Date: April 2018", "PG13");
        MovieItem item2 = new MovieItem("Incredibles 2", "Release Date: June 2018", "PG13");
        MovieItem item3 = new MovieItem("Justice League", "Release Date: November 2018", "NC16");
        alMovieList.add(item1);
        alMovieList.add(item2);
        alMovieList.add(item3);

        caMovie = new CustomAdapter(this, R.layout.movie_item, alMovieList);

        lvMovie.setAdapter(caMovie);

    }
}
