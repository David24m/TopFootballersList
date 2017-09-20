package com.example.user.topfootballers;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopFootballersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_top_footballers);

        TopFootballers topFootballers = new TopFootballers();
        ArrayList<Footballer> list = topFootballers.getList();

        TopFootballersAdapter footballersAdapter = new TopFootballersAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(footballersAdapter);

    }

    public void getFootballer(View listItem) {
        Footballer footballer = (Footballer) listItem.getTag();
        Log.d("Footballer's name:", footballer.getName());
    }
}
