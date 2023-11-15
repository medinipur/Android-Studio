package com.example.demoapp;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import android.app.Activity;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class MyListAdapter extends ArrayAdapter<String> {
  private  final  Activity context;
  private final  String[]url;
    private final  String[]email;
    private final  String[]phonenumber;
    private  final Integer[] imgid;


    public MyListAdapter(@NonNull Activity context, String[]url, String[]email, String[]phonenumber, Integer[]imgid) {
        super(context, R.layout.activity_my_list_adapter,url);

        this.context=context;
        this.url=url;
        this.email=email;
        this.phonenumber=phonenumber;
        this.imgid=imgid;

    }



    @NonNull
    @Override
    public View getView(int position, @Nullable View view, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.activity_my_list_adapter, null,true);


        TextView titleText=(TextView) rowView.findViewById(R.id.url);
        TextView subtitleText=(TextView) rowView.findViewById(R.id.email);
        TextView phonenumberText=(TextView) rowView.findViewById(R.id.phonenumber);
        ImageView imageView=(ImageView) rowView.findViewById(R.id.icon);
        imageView.setImageResource(imgid[position]);

        titleText.setText(url[position]);
        subtitleText.setText((email[position]));
        phonenumberText.setText(phonenumber[position]);
        Linkify.addLinks(phonenumberText,Linkify.PHONE_NUMBERS);
        return rowView;
    };
}