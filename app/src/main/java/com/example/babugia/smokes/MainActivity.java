package com.example.babugia.smokes;

import android.content.Intent;
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

        final Intent it = new Intent(this, MapSelected.class);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                Mapa map = maps[position];

                //ir para a view das smokes do mapa clicado

                it.putExtra("mapName", map.getName());
                startActivity(it);

            }
        });
    }

    private Mapa[] maps = {
            new Mapa("Cache", R.drawable.cache),
            new Mapa("Cobble", R.drawable.cobble),
            new Mapa("Dust2", R.drawable.dust2),
            new Mapa("Inferno", R.drawable.inferno),
            new Mapa("Mirage", R.drawable.mirage),
            new Mapa("Nuke", R.drawable.nuke),
            new Mapa("Overpass", R.drawable.overpass),
            new Mapa("Train", R.drawable.train)

    };
}
