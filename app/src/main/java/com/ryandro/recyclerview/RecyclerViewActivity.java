package com.ryandro.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.ArrayList;

public class RecyclerViewActivity extends AppCompatActivity {

    private RecyclerviewAdapter recyclerviewAdapter;
    private RecyclerViewHeadFootAdapter headFootAdapter;
    private RecyclerView rv_movie;
    private ArrayList<MovieDo> movieDoArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);
        rv_movie = (RecyclerView) findViewById(R.id.rv_movie);
        movieDoArrayList = getMoviedata();
       /* recyclerviewAdapter = new RecyclerviewAdapter(RecyclerViewActivity.this, movieDoArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
       *//* RecyclerView.LayoutParams params = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.setMargins(10,10,10,10);
        rv_movie.setLayoutParams(params);*//*
        rv_movie.setLayoutManager(layoutManager);
        rv_movie.setAdapter(recyclerviewAdapter);*/
//        recyclerviewAdapter.notifyDataSetChanged();

        headFootAdapter = new RecyclerViewHeadFootAdapter(RecyclerViewActivity.this, movieDoArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(RecyclerViewActivity.this);
        rv_movie.setLayoutManager(layoutManager);
        rv_movie.setAdapter(headFootAdapter);
    }

    private ArrayList<MovieDo> getMoviedata() {
        ArrayList<MovieDo> moviewList = new ArrayList<>();
        MovieDo movieDo;
        movieDo = new MovieDo(R.drawable.darknight, "The Dark Knight", "152", "Christopher Nolan", "Christopher Nolan\n" +
                "Emma Thomas", "July 14, 2008");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.avengers, "The Avengers", "154", "Josh Whedon", "Christopher Nolan\n" +
                "Emma Thomas", "June 18, 2014");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.starvar, "Star Wars: The Last Jedi", "162", "Rian Johnson", "Christopher Nolan\n" +
                "Emma Thomas", "May 02, 2004");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.jumanji, "Jumanji: Welcome to the Jungle", "145", "Jake Kasdan", "Christopher Nolan\n" +
                "Emma Thomas", "Nov 22, 2012");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.spiderman, "Spider-Man: Homecoming", "172", "Jon Watts", "Christopher Nolan\n" +
                "Emma Thomas", "Dec 25, 2011");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.darknight, "The Dark Knight", "152", "Christopher Nolan", "Christopher Nolan\n" +
                "Emma Thomas", "July 14, 2008");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.avengers, "The Avengers", "154", "Josh Whedon", "Christopher Nolan\n" +
                "Emma Thomas", "June 18, 2014");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.starvar, "Star Wars: The Last Jedi", "162", "Rian Johnson", "Christopher Nolan\n" +
                "Emma Thomas", "May 02, 2004");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.jumanji, "Jumanji: Welcome to the Jungle", "145", "Jake Kasdan", "Christopher Nolan\n" +
                "Emma Thomas", "Nov 22, 2012");
        moviewList.add(movieDo);
        movieDo = new MovieDo(R.drawable.spiderman, "Spider-Man: Homecoming", "172", "Jon Watts", "Christopher Nolan\n" +
                "Emma Thomas", "Dec 25, 2011");
        moviewList.add(movieDo);

        return moviewList;
    }
}
