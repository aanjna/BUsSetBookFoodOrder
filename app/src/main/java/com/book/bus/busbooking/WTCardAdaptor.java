package com.book.bus.busbooking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Choudhary on 10-Dec-15.
 */
public class WTCardAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<WtCardModel> wtCardModels;

    public WTCardAdaptor(List<WtCardModel> wtCardModels) {

        this.wtCardModels = wtCardModels;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wtcard_list, viewGroup, false);
        VIHolder viewHolder = new VIHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VIHolder)
            ((VIHolder) holder).amount.setText(wtCardModels.get(position).getAmount());
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    private class VIHolder extends RecyclerView.ViewHolder {
        TextView amount;

        public VIHolder(View itemView) {
            super(itemView);
            amount = (TextView) itemView.findViewById(R.id.tv_chash);
        }
    }

    public int getItemCount() {
        return wtCardModels.size();
    }
}
