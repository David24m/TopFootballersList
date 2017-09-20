package com.example.user.topfootballers;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by user on 20/09/2017.
 */

public class TopFootballersAdapter extends ArrayAdapter<Footballer> {

    public TopFootballersAdapter(Context context, ArrayList<Footballer> footballers) {
        super(context, 0, footballers);
    }

    @Override
    public View getView(int position, View listItemView, ViewGroup parent) {

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.footbaler_item, parent, false);
        }

        Footballer currentFootballer = getItem(position);

        TextView ranking = (TextView) listItemView.findViewById(R.id.ranking);
        ranking.setText(currentFootballer.getRanking().toString());

        TextView name = (TextView) listItemView.findViewById(R.id.name);
        name.setText(currentFootballer.getName());

        TextView club = (TextView) listItemView.findViewById(R.id.club);
        club.setText(currentFootballer.getClub());

        listItemView.setTag(currentFootballer);

        return listItemView;
    }
}
