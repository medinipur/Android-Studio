package com.example.demoapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    ListView list;
    String[]urls= {
            "https://www.yoururl1.com/", "https://www.yoururl2.com/",
            "https://www.yoururl3.com/", "https://www.yoururl4.com/",
            "https://www.yoururl5.com/", "https://www.yoururl6.com/",
            "https://www.yoururl7.com/", "https://www.yoururl8.com/",
            "https://www.yoururl8.com/", "https://www.yoururl19.com/",
    };
  String[]emails={
          "email_1@mail.com","email_2@mail.com",
          "email_3@mail.com","email_4@gmail.com",
          "email_5@mail.com","email_6@mail.com",
          "email_7@mail.com","email_8@mail.com",
          "email_9@gmail.com","email_10@mail.com"
  };

  String[]phonenumber={
          "6789799797","90879687",
          "6789799797","90879687",
          "6789799797","90879687",
          "6789799797","90879687",
  };
    Integer[] imgid={
          R.drawable.images,R.drawable.whts,
            R.drawable.images,R.drawable.whts,
            R.drawable.images,R.drawable.whts,
            R.drawable.images,R.drawable.whts,


  };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyListAdapter adapter=new MyListAdapter(this,urls,emails,phonenumber,imgid);
                list=(ListView) findViewById(R.id.listView);
        list.setAdapter(adapter);
    }
}