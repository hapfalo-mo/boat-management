/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;

/**
 *
 * @author Admin
 */
public class Boat{
    private int bid;
    private String bname;
    private String color;

    public Boat() {
    }

    
    public Boat(int bid, String bname, String color) {
        this.bid = bid;
        this.bname = bname;
        this.color = color;
    }

    public int getBid() {
        return bid;
    }

    public String getBname() {
        return bname;
    }

    public String getColor() {
        return color;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    
}
