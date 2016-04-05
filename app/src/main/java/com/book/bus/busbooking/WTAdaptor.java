package com.book.bus.busbooking;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

public class WTAdaptor extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    List<WTcashModel> wTcashModels;

    public WTAdaptor(List<WTcashModel> wTcashModels) {

        this.wTcashModels = wTcashModels;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemLayoutView = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_wt_adaptor, viewGroup, false);
        VIHolder viewHolder = new VIHolder(itemLayoutView);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if (holder instanceof VIHolder)
            ((VIHolder) holder).amount.setText(wTcashModels.get(position).getAmount());
        ((VIHolder) holder).mode.setText(wTcashModels.get(position).getMode());
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    private class VIHolder extends RecyclerView.ViewHolder {
        TextView amount, mode;

        public VIHolder(View itemView) {
            super(itemView);
            amount = (TextView) itemView.findViewById(R.id.tv_chash);
            mode = (TextView) itemView.findViewById(R.id.tv_offercash);
        }
    }

    public int getItemCount() {
        return wTcashModels.size();
    }
}
