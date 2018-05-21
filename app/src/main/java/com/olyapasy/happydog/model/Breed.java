package com.olyapasy.happydog.model;

import android.graphics.Color;

public class Breed {

        private String title;
        private String description;
        private String type;
        private int image;
        private int detailedImage;
        private String background;

        public Breed(String title, String description, String type, int image, int detailedImage, String background) {
            this.title = title;
            this.description = description;
            this.type = type;
            this.image = image;
            this.detailedImage = detailedImage;
            this.background = background;
        }

    public String getBackground() {
        return background;
    }

    public void setBackground(String background) {
        this.background = background;
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

        public int getDetailedImage() {
        return detailedImage;
        }

        public void setDetailedImage(int detailedImage) {
        this.detailedImage = detailedImage;
        }
        public String getType() {
        return type;
        }
        public void setType(String type) {
        this.type = type;
    }
}

