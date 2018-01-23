package com.example.babugia.smokes;

import android.app.TabActivity;
import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.TabHost;
import android.widget.TabWidget;
import android.widget.TextView;
import android.widget.Toast;

public class MapSelected extends AppCompatActivity {

    TabHost tabHost;
    PositionsAdapter positionsAdapter;
    String mapName = new String();
    MapsPositions mapsPositions;
    Position[] bombA, meio, bombB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_selected);

        Bundle bundle = getIntent().getExtras();
        if(bundle.containsKey("mapName")){
            mapName = bundle.getString("mapName");
            this.setTitle(mapName);
            Toast.makeText(this, mapName, Toast.LENGTH_SHORT).show();
        }

        TabHost host = (TabHost)findViewById(R.id.tabHost);
        host.setup();

        //Tab 1
        TabHost.TabSpec spec = host.newTabSpec("Tab One");
        spec.setContent(R.id.tabCT);
        spec.setIndicator("CT");
        host.addTab(spec);

        //Tab 2
        spec = host.newTabSpec("Tab Two");
        spec.setContent(R.id.tabTR);
        spec.setIndicator("TR");
        host.addTab(spec);

        host.getTabWidget().getChildAt(0).setBackgroundColor(Color.parseColor("#188CF6"));
        host.getTabWidget().getChildAt(1).setBackgroundColor(Color.parseColor("#DFA33B"));


        TextView localText = (TextView)findViewById(R.id.localText);
        localText.setText("Base CT");


        mapsPositions = new MapsPositions();


        if(mapName.equals("Mirage")){
            bombA = mapsPositions.getMirageMeio();
        }

        //GRIDVIEW

        GridView gridViewA = (GridView) findViewById(R.id.gridViewBombA);
        positionsAdapter = new PositionsAdapter(this, bombA);
        gridViewA.setAdapter(positionsAdapter);



    }

}
