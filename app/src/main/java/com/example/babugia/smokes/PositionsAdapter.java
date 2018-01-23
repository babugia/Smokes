package com.example.babugia.smokes;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by babugia on 12/01/2018.
 */

public class PositionsAdapter extends ArrayAdapter {

    private final Context mContext;
    private Position[] positions;

    public PositionsAdapter(Context mContext, Position[] positions){
        super(mContext, R.layout.linearlayout_positions,positions);
        this.mContext = mContext;
        this.positions = positions;
    }

    @Override
    public int getCount() {
        return positions.length;
    }

    @Override
    public Object getItem(int i) {
        return positions[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Position position =  positions[i];

        if (view == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(R.layout.linearlayout_positions, null);
        }

        try{
            final ImageView positionImage = (ImageView)view.findViewById(R.id.imageview_position);
            final TextView positionName = (TextView)view.findViewById(R.id.textview_position_name);


            positionImage.setImageResource(position.getImageResource());
            positionName.setText(position.getName());

        }catch(Exception e) {
            Toast.makeText(mContext, e.toString(), Toast.LENGTH_LONG).show();
        }

        return view;
    }
}
