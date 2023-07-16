package com.threemeadows.a3mcafeteria;

import android.content.Context;
import android.media.Image;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.content.ContextCompat;

import java.util.ArrayList;

public class SnackAdapter extends ArrayAdapter<Snack> {
    private static final String TAG = "SnackAdapter";

    public SnackAdapter(Context context, ArrayList<Snack> snacks){
        super(context,0,snacks);
    }

    public static class ViewHolder{
        ImageView ivSnackSmallImage;
        TextView tvSnackName;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Log.i(TAG, "getView: called for position" + position);
        // get the snack data
        Snack snack = getItem(position);

        ViewHolder viewHolder;

        if(convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.row_item_snack, parent, false);
            viewHolder = new ViewHolder();
            viewHolder.tvSnackName = convertView.findViewById(R.id.tv_snack_name);
            viewHolder.ivSnackSmallImage = convertView.findViewById(R.id.iv_snack_small);
            convertView.setTag(viewHolder);
        }else{
            viewHolder = (ViewHolder)convertView.getTag();
        }
        // fetching the views
//        ImageView ivSnackSmallImage = convertView.findViewById(R.id.iv_snack_small);
//        TextView tvSnackName = convertView.findViewById(R.id.tv_snack_name);

        // populating the views
        viewHolder.ivSnackSmallImage.setImageDrawable(ContextCompat.getDrawable(getContext(),
                snack.getmSmallImageSrcId()));

        viewHolder.tvSnackName.setText(snack.getmName());

        return convertView;
    }
}
