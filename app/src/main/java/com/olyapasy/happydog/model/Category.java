package com.olyapasy.happydog.model;

public class Category {
    private String title;
    private int ImageId;

    public Category(String title, int imageId) {

        this.title = title;
        ImageId = imageId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setImageId(int imageId) {
        ImageId = imageId;
    }


    public String getTitle() {
        return title;
    }

    public int getImageId() {
        return ImageId;
    }

}
