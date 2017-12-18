package com.example.babugia.smokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    MapsAdapter mapsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridView gridView = (GridView) findViewById(R.id.gridView);
        mapsAdapter = new MapsAdapter(this, maps);
        gridView.setAdapter(mapsAdapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Mapa map = maps[position];

                //ir para a view das smokes do mapa clicado


            }
        });
    }

    private Mapa[] maps = {
            new Mapa("cache", R.drawable.cache),
            new Mapa("cobble", R.drawable.cobble),
            new Mapa("dust2", R.drawable.dust2),
            new Mapa("inferno", R.drawable.inferno),
            new Mapa("mirage", R.drawable.mirage),
            new Mapa("nuke", R.drawable.nuke),
            new Mapa("overpass", R.drawable.overpass),
            new Mapa("train", R.drawable.train)

    };
}
