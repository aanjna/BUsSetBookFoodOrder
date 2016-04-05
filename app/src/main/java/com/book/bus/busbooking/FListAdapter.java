package com.book.bus.busbooking;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Choudhary on 13-Jan-16.
 */
public class FListAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    ArrayList<FoodIteamModel> foodIteamModels;
    Context context;

    public FListAdapter(Context context, ArrayList<FoodIteamModel> foodIteamModels) {
        this.foodIteamModels = foodIteamModels;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.listview_item, viewGroup, false);
        VIHolder viewHolder = new VIHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VIHolder)
            ((VIHolder) holder).tv1.setText(foodIteamModels.get(position).getName());
        ((VIHolder) holder).tv2.setText(foodIteamModels.get(position).getPrice());
        ((VIHolder) holder).count.setText(foodIteamModels.get(position).getSelectedIteamCount());
    }
    public int getItemCount() {
        return foodIteamModels.size();
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    private class VIHolder extends RecyclerView.ViewHolder {
        TextView tv1, tv2, count;
        RoundedImageView Minus;
        RoundedImageView Add;

        public VIHolder(View itemView) {
            super(itemView);
            tv1 = (TextView) itemView.findViewById(R.id.tv_routenumber);
            tv2 = (TextView) itemView.findViewById(R.id.tv_rout);
            count = (TextView) itemView.findViewById(R.id.tv_via);
        }


    }
}
