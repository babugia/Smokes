package com.example.babugia.smokes;

/**
 * Created by babugia on 12/01/2018.
 */

public class Position {
    private String name;
    private final int imageResource;

    public Position(String name, int imageResource) {
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
