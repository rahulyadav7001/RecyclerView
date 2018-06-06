package com.ryandro.recyclerview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class MovieDetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);

        TextView tv_moviewName = findViewById(R.id.tv_moviewName);
        ImageView iv_movie = findViewById(R.id.iv_movie);

        MovieDo movieDo = (MovieDo) getIntent().getSerializableExtra("KEY");

        if (movieDo != null) {
            tv_moviewName.setText(movieDo.getMovieName() + "\n" + movieDo.getDirectorName() + "\n" + movieDo.getReleaseDate() + "\n" + movieDo.getWriterName());
            iv_movie.setImageResource(movieDo.getMovieImage());
        }
    }
}
