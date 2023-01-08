package com.example.tablayoutinfregment;

public class ChatModelClass {
    private String Name;
    private int img;
    private String colors;

    public ChatModelClass(String name, int img, String colors) {
        Name = name;
        this.img = img;
        this.colors = colors;
    }

    public String getName() {
        return Name;
    }

    public int getImg() {
        return img;
    }

    public String getColors() {
        return colors;
    }
}
