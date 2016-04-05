package com.book.bus.busbooking;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Choudhary on 22-Oct-15.
 */
public class ListAdapter extends BaseAdapter {
    ArrayList<FoodIteam> foodIteams;
    Context mContext;

    public ListAdapter(Context context, ArrayList<FoodIteam> foodIteams){
        this.foodIteams = foodIteams;
        mContext = context;
    }
    @Override
    public int getCount() {
        return foodIteams.size();
    }

    @Override
    public Object getItem(int position) {
        return foodIteams.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {
        PlaceHolder placeHolder = new PlaceHolder();
        if(convertView == null){
            convertView = LayoutInflater.from(mContext).inflate(R.layout.listview_item, null);
            placeHolder.textView1 = (TextView) convertView.findViewById(R.id.textview1);
            placeHolder.textView2 = (TextView) convertView.findViewById(R.id.textview2);
            placeHolder.Add = (RoundedImageView) convertView.findViewById(R.id.Add);
            placeHolder.Minus = (RoundedImageView) convertView.findViewById(R.id.Minus);
            placeHolder.Count = (TextView) convertView.findViewById(R.id.Count);
            convertView.setTag(placeHolder);
        } else{
            placeHolder = (PlaceHolder) convertView.getTag();
        }
        placeHolder.textView1.setText(foodIteams.get(position).name);
        placeHolder.textView2.setText(foodIteams.get(position).price);
        if(foodIteams.get(position).selectedIteamCount == 0){
            placeHolder.Count.setText("Add item");
            placeHolder.Minus.setVisibility(View.GONE);
        } else{
            placeHolder.Minus.setVisibility(View.VISIBLE);
            placeHolder.Count.setText(""+foodIteams.get(position).selectedIteamCount);
        }
        placeHolder.Add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodIteams.get(position).selectedIteamCount++;
                notifyDataSetChanged();
            }
        });
        placeHolder.Minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                foodIteams.get(position).selectedIteamCount--;
                notifyDataSetChanged();
            }
        });


        return convertView;
    }
    public class PlaceHolder{
        TextView textView1;
        TextView textView2;
        RoundedImageView Minus;
        TextView Count;
        RoundedImageView Add;
    }
}
