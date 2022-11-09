/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author DELL
 */
public class Track {
    private String name;
    private int viewCount;

    public Track(String name, int viewCount) {
        this.name = name;
        this.viewCount = viewCount;
    }

    public String getName() {
        return name;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }

    @Override
    public String toString() {
        return "Name: "+this.name + ", View:"+this.viewCount;
    }
    
}
