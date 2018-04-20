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

public class RecyclerViewHeadFootAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private ArrayList<MovieDo> dataArrayList;
    private Context context;
    private static int TYPE_HEADER = 1;
    private static int TYPE_ITEM = 2;
    private static int TYPE_FOOTER = 3;

    public RecyclerViewHeadFootAdapter(Context context, ArrayList<MovieDo> dataArrayList) {
        this.dataArrayList = dataArrayList;
        this.context = context;
    }

    @Override
    public int getItemViewType(int position) {
        if (position == 0) {
            return TYPE_HEADER;
        } else if (position > dataArrayList.size()) {
            return TYPE_FOOTER;
        }
        return TYPE_ITEM;

    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        if (viewType == TYPE_ITEM) {
            View view = LayoutInflater.from(context).inflate(R.layout.recyclerview_cell, parent, false);
            RecyclerViewHeadFootAdapter.ViewHolder viewHolder = new RecyclerViewHeadFootAdapter.ViewHolder(view);
            return viewHolder;
        } else if (viewType == TYPE_HEADER) {
            View view = LayoutInflater.from(context).inflate(R.layout.header_view, parent, false);
            RecyclerViewHeadFootAdapter.HeaderViewHolder headerViewHolder = new RecyclerViewHeadFootAdapter.HeaderViewHolder(view);
            return headerViewHolder;
        } else if (viewType == TYPE_FOOTER) {
            View view = LayoutInflater.from(context).inflate(R.layout.footer_view, parent, false);
            RecyclerViewHeadFootAdapter.FooterViewHolder footerViewHolder = new RecyclerViewHeadFootAdapter.FooterViewHolder(view);
            return footerViewHolder;
        } else
            return null;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof HeaderViewHolder) {
            HeaderViewHolder viewHolder = (HeaderViewHolder) holder;
            viewHolder.tv_header.setText("Top Hollywood Movie List Present Here.");
        } else if (holder instanceof FooterViewHolder) {
            FooterViewHolder viewHolder = (FooterViewHolder) holder;
            viewHolder.tv_footer.setText("Hollywood Movie List End Here.");
        } else if (holder instanceof ViewHolder) {
            MovieDo movieDo = dataArrayList.get(position-1);
            ViewHolder viewHolder = (ViewHolder) holder;
            viewHolder.tv_movieName.setText(movieDo.getMovieName());
            viewHolder.tv_director.setText(movieDo.getDirectorName());
            viewHolder.tv_writter.setText(movieDo.getWriterName());
            viewHolder.tv_releaseDate.setText(movieDo.getReleaseDate());
            viewHolder.iv_movie.setImageDrawable(context.getResources().getDrawable(movieDo.getMovieImage()));
        }
    }

    @Override
    public int getItemCount() {
        if (dataArrayList != null && dataArrayList.size() > 0)
            return (dataArrayList.size()+2) ;
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

    class FooterViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_footer;

        public FooterViewHolder(View itemView) {
            super(itemView);
            tv_footer = itemView.findViewById(R.id.tv_footer);
        }
    }

    class HeaderViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_header;

        public HeaderViewHolder(View itemView) {
            super(itemView);
            tv_header = itemView.findViewById(R.id.tv_header);
        }
    }
}
