package com.ryandro.recyclerview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class RecyclerviewAdapter extends RecyclerView.Adapter<RecyclerviewAdapter.ViewHolder> {
    private ArrayList<MovieDo> dataArrayList;
    private Context context;

    public RecyclerviewAdapter(Context context, ArrayList<MovieDo> dataArrayList) {
        this.dataArrayList = dataArrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_cell, parent, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MovieDo movieDo = dataArrayList.get(position);
        holder.tv_movieName.setText(movieDo.getMovieName());
        holder.tv_director.setText(movieDo.getDirectorName());
        holder.tv_writter.setText(movieDo.getWriterName());
        holder.tv_releaseDate.setText(movieDo.getReleaseDate());
        holder.iv_movie.setImageDrawable(context.getResources().getDrawable(movieDo.getMovieImage()));
    }

    @Override
    public int getItemCount() {
        if (dataArrayList != null && dataArrayList.size() > 0)
            return dataArrayList.size();
        return 0;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_movieName, tv_director, tv_writter, tv_releaseDate;
        private ImageView iv_movie;

        public ViewHolder(View itemView) {
            super(itemView);
            tv_movieName = itemView.findViewById(R.id.tv_movieName);
            tv_director = itemView.findViewById(R.id.tv_director);
            tv_writter = itemView.findViewById(R.id.tv_writter);
            tv_releaseDate = itemView.findViewById(R.id.tv_releaseDate);
            iv_movie = itemView.findViewById(R.id.iv_movie);
        }
    }
}


