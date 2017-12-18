package com.example.babugia.smokes;

/**
 * Created by babugia on 18/12/2017.
 */

public class Mapa {
    private String name;
    private final int imageResource;

    public Mapa(String name, int imageResource) {
        this.name = name;
        this.imageResource = imageResource;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getImageResource() { return imageResource; }

}

