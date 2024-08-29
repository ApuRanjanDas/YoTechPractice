package com.example.yotechpractice.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.yotechpractice.R;

public class CustomAdapter2 extends BaseAdapter {
    int[] picture;
    String[] deviceName;
    String[][] deviceDescription;
    Context context;
    private LayoutInflater inflater;

    CustomAdapter2(Context context, String[] deviceName, String[] deviceDescription[], int[] picture){
        this.context = context;
        this.deviceName = deviceName;
        this.deviceDescription = deviceDescription;
        this.picture = picture;


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
            convertView = inflater.inflate(R.layout.sample_listview_layout,parent,false);

        }

        ImageView imageView = convertView.findViewById(R.id.imageViewID);
        TextView textView = convertView.findViewById(R.id.sampleTxtViewId);
        TextView textView1 = convertView.findViewById(R.id.txtdescriptionId);

        imageView.setImageResource(picture[position]);
        textView.setText(deviceName[position]);
        textView1.setText(deviceName[position]);

        return convertView;
    }
}
