package com.example.nthie.truyencuoi.icon;

/**
 * Created by nthie on 4/6/2018.
 */

public class Icons {
    private int imageId;
    private String name;

    public Icons(int idImage, String name) {
        this.imageId = idImage;
        this.name = name;
    }

    public int getIdImage() {
        return imageId;
    }

    public void setIdImage(int idImage) {
        this.imageId = idImage;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
