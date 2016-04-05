package com.book.bus.busbooking;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Choudhary on 28-Dec-15.
 */
public class RoutflowAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<RoutflowModel> routflowModels;
    Context context;

    public RoutflowAdaptor(ArrayList<RoutflowModel> routflowModels) {
        this.routflowModels = routflowModels;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_buslist, viewGroup, false);
        VIHolder viewHolder = new VIHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VIHolder)
            ((VIHolder) holder).routnumbar.setText(routflowModels.get(position).getRoutnumber());
        ((VIHolder) holder).rout.setText(routflowModels.get(position).getRout());
        ((VIHolder) holder).via.setText(routflowModels.get(position).getVia());
    }
    public int getItemCount() {
        return routflowModels.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    private class VIHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView rout, via, routnumbar;

        public VIHolder(View itemView) {
            super(itemView);
            routnumbar = (TextView) itemView.findViewById(R.id.tv_routenumber);
            rout = (TextView) itemView.findViewById(R.id.tv_rout);
            via = (TextView) itemView.findViewById(R.id.tv_via);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            //Toast.makeText(context,"The Item Clicked is: "+getPosition(), Toast.LENGTH_SHORT).show();
        }
        }
    }


