package com.example.yotechpractice.grideview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yotechpractice.R;

import java.util.zip.Inflater;

public class Customadapter extends BaseAdapter {
    Context context;
    int[] pictures;
    String[] deviceName;
    private LayoutInflater inflater;

    Customadapter(Context context, String[] deviceName, int[] pictures){
        this.context = context;
        this.deviceName = deviceName;
        this.pictures = pictures;

    }



    @Override
    public int getCount() {
        return deviceName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView==null){
            inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.sample_layout_for_gridview, parent, false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewID);
        TextView textView = convertView.findViewById(R.id.textViewID);

        imageView.setImageResource(pictures[position]);
        textView.setText(deviceName[position]);

        return convertView;
    }
}
