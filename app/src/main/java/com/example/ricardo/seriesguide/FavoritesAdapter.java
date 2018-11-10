package com.example.ricardo.seriesguide;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;


import java.util.ArrayList;

public class FavoritesAdapter extends RecyclerView.Adapter<FavoritesAdapter.ViewHolderItem> implements View.OnClickListener {

    ArrayList<Season> datos ;
    private View.OnClickListener listener;
    @NonNull
    @Override
    public ViewHolderItem onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.season,null,false);
        view.setOnClickListener(this);
        return new ViewHolderItem(view);
    }

    public FavoritesAdapter(ArrayList<Season> datoss) {
        this.datos = datoss;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderItem viewHolderItem, int i) {
        Season s = datos.get(i);
        System.out.println("solid");
        System.out.println(viewHolderItem.seasonNum.getText());
        System.out.println("solid");
        viewHolderItem.seasonNum.setText("Season "+Integer.toString(s.getNumber()));
        viewHolderItem.seasonRate.setText(s.getCaps());
        viewHolderItem.seasonRemain.setText(s.getDesc());
        viewHolderItem.seasonProg.setProgress(s.getBar());
    }

    @Override
    public int getItemCount() {
        return datos.size();
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
        TextView seasonNum, seasonRate, seasonRemain;
        ProgressBar seasonProg;
        // Aqui van los datos, imagenes, texto etc...
        public ViewHolderItem(@NonNull View itemView) {
            super(itemView);
            seasonNum = itemView.findViewById(R.id.season_id);

            System.out.println(seasonNum.getText());
            System.out.println("solid2");
            seasonRate = itemView.findViewById(R.id.season_rate);
            seasonRemain = itemView.findViewById(R.id.season_remaining);
            seasonProg = itemView.findViewById(R.id.season_progress);
        }


    }
}
