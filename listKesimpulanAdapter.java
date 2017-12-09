package com.lianda.mudabergerak.ib;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lenovo on 06/12/2017.
 */

public class listKesimpulanAdapter extends RecyclerView.Adapter<listKesimpulanAdapter.KesimpulanViewHolder> {

    private ArrayList<listKesimpulanModel> listKesimpulan;
    private Context context;

    public listKesimpulanAdapter (Context context) {this.context = context;}
    public  ArrayList<listKesimpulanModel>getListKesimpulan() {return listKesimpulan;}
    public void setListKesimpulan (ArrayList<listKesimpulanModel>listKesimpulan) { this.listKesimpulan = listKesimpulan;}

    @Override
    public KesimpulanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_kesimpulan, parent, false);
        KesimpulanViewHolder viewHolder = new KesimpulanViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(listKesimpulanAdapter.KesimpulanViewHolder holder, int position) {
        listKesimpulanModel p = getListKesimpulan().get(position);
        holder.ivFotoKesimpulan.setImageResource(p.getFotoListKesimpulan());
        holder.tvJudulKesimpulan.setText(p.getJudulListKesimpulan());
        holder.tvTanggalKesimpulan.setText(p.getTanggalListKesimpulan());


    }

    @Override
    public int getItemCount() {
        return getListKesimpulan().size();
    }

    public class KesimpulanViewHolder extends RecyclerView.ViewHolder {
        ImageView ivFotoKesimpulan, ivPanah;
        TextView tvJudulKesimpulan, tvTanggalKesimpulan;

        public KesimpulanViewHolder (View itemView){
            super(itemView);
            ivFotoKesimpulan = itemView.findViewById(R.id.iv_itemfoto);
            ivPanah = itemView.findViewById(R.id.iv_itempanah);
            tvJudulKesimpulan = itemView.findViewById(R.id.tv_itemjudul);
            tvTanggalKesimpulan = itemView.findViewById(R.id.tv_itemtanggal);

        }

    }
}
