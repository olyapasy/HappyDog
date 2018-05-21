package com.olyapasy.happydog.model;

public class Item {

    private String title;
    private String description;
    private String descriptionDetailed;
    private int image;


    public Item(String title, String description, String descriptionDetailed, int image) {
        this.title = title;
        this.description = description;
        this.descriptionDetailed = descriptionDetailed;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }


    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getDescriptionDetailed() {
        return descriptionDetailed;
    }

    public void setDescriptionDetailed(String descriptionDetailed) {
        this.descriptionDetailed = descriptionDetailed;
    }
}
