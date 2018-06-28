package com.example.nthie.truyencuoi.topic;

/**
 * Created by nthie on 4/6/2018.
 */

public class Topic {
    private int idImg;
    private String name;

    public Topic(int idImg, String name) {
        this.idImg = idImg;
        this.name = name;
    }

    public int getIdImg() {
        return idImg;
    }

    public void setIdImg(int idImg) {
        this.idImg = idImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
