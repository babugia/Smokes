package com.example.babugia.smokes;

/**
 * Created by babugia on 16/01/2018.
 */

public class MapsPositions {

    private Position[] mirageBombA = {
            new Position("Base CT", R.drawable.inferno),
            new Position("Cabecinha", R.drawable.cobble)

    };
    public Position [] getMirageBombA(){
        return mirageBombA;
    }

    private Position[] mirageMeio = {
            new Position("Janelão", R.drawable.cache),
            new Position("Passagem", R.drawable.cobble)

    };
    public Position [] getMirageMeio(){
        return mirageMeio;
    }
}
