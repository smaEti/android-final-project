package com.example.buddymovies;

public class DataClass {
    private String dataTitle;
    private String dataDesc;
    private int dataImage;
    public String getDataTitle() {
        return dataTitle;
    }
    public String getDataDesc() {
        return dataDesc;
    }
    public int getDataImage() {
        return dataImage;
    }
    public DataClass(String dataTitle, String dataDesc, int dataImage) {
        this.dataTitle = dataTitle;
        this.dataDesc = dataDesc;
        this.dataImage = dataImage;
    }
}