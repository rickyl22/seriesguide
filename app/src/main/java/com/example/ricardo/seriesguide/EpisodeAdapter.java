package com.example.ricardo.seriesguide;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;


import java.util.ArrayList;

public class EpisodeAdapter extends RecyclerView.Adapter<EpisodeAdapter.ViewHolderItem> implements View.OnClickListener {

    ArrayList<Episode> episodeList ;
    private View.OnClickListener listener;
    @NonNull
    @Override
    public ViewHolderItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.episode,null,false);
        view.setOnClickListener(this);
        return new ViewHolderItem(view);
    }

    public EpisodeAdapter(ArrayList<Episode> list) {
        this.episodeList = list;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItem viewHolderItem, int i) {
        Episode s = episodeList.get(i);
        viewHolderItem.episodeName.setText(s.getName());
        viewHolderItem.episodeDate.setText(s.getDate());
        viewHolderItem.episodeDesc.setText(s.getDesc());
        viewHolderItem.episodeNum.setText(Integer.toString(s.getNum()));
    }

    @Override
    public int getItemCount() {
        return episodeList.size();
    }

    public void setOnClickListener(View.OnClickListener listener){
        this.listener = listener;
    }
    @Override
    public void onClick(View view) {
        if(listener!=null){
            listener.onClick(view);
        }
    }

    public class ViewHolderItem extends RecyclerView.ViewHolder {
        TextView episodeNum, episodeDate, episodeDesc,episodeName;

        // Aqui van los datos, imagenes, texto etc...
        public ViewHolderItem(@NonNull View itemView) {
            super(itemView);
            episodeName = itemView.findViewById(R.id.episode_name);
            episodeDate = itemView.findViewById(R.id.episode_date);
            episodeDesc = itemView.findViewById(R.id.espisode_desc);
            episodeNum = itemView.findViewById(R.id.episode_num);
        }


    }
}