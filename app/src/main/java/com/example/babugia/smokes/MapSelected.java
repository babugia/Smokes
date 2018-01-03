package com.example.babugia.smokes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MapSelected extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map_selected);

        Bundle bundle = getIntent().getExtras();

        if(bundle.containsKey("mapName")){
            String mapName = bundle.getString("mapName");
            this.setTitle(mapName);
            Toast.makeText(this, mapName, Toast.LENGTH_SHORT).show();
        }


    }
}
