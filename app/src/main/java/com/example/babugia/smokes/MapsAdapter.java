package com.example.babugia.smokes;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by babugia on 18/12/2017.
 */

public class MapsAdapter extends ArrayAdapter {

    private final Context mContext;
    private Mapa[] maps;

    public MapsAdapter(Context mContext, Mapa[] maps){
        super(mContext, R.layout.linearlayout_button,maps);
        this.mContext = mContext;
        this.maps = maps;
    }

    @Override
    public int getCount() {
        return maps.length;
    }

    @Override
    public Object getItem(int i) {
        return maps[i];
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        final Mapa map =  maps[i];

        if (view == null) {
            final LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            view = layoutInflater.inflate(R.layout.linearlayout_button, null);
        }

        try{
            final ImageView mapImage = (ImageView)view.findViewById(R.id.imageview_button);
            //final TextView mapName = (TextView)view.findViewById(R.id.textview_button_name);


            mapImage.setImageResource(map.getImageResource());
          //  mapName.setText(map.getName());

        }catch(Exception e) {
            Toast.makeText(mContext, e.toString(), Toast.LENGTH_LONG).show();
        }

        return view;
    }

}
