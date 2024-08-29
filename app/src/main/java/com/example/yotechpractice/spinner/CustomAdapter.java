package com.example.yotechpractice.spinner;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yotechpractice.R;

public class CustomAdapter extends BaseAdapter {

    private String[] deviceIP;
    private String[] deviceName;
    int[] picture;
    Context context;
    LayoutInflater layoutInflater;

    public CustomAdapter(Context context, int[] picture, String[] deviceIP, String[] deviceName) {
        this.deviceIP = deviceIP;
        this.deviceName = deviceName;
        this.picture = picture;
        this.context = context;
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
        if (convertView==null)
        {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = layoutInflater.inflate(R.layout.simple_layout2,null,false);
        }

        ImageView imageView = convertView.findViewById(R.id.imageViewId);
        imageView.setImageResource(picture[position]);

        //Log.d("TAG", "getView: po "+deviceName[position]);

        TextView textView = convertView.findViewById(R.id.deviceNameId);
        textView.setText(deviceName[position]);

        TextView textView1 = convertView.findViewById(R.id.deviceIPId);
        textView1.setText(deviceIP[position]);

        return convertView;
    }
}
