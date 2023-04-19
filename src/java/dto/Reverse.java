/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dto;


public class Reverse {
    private int sid; 
    private int bid;
    private String date;

    public Reverse() {
    }

    public Reverse(int sid, int bid, String date) {
        this.sid = sid;
        this.bid = bid;
        this.date = date;
    }

    public int getSid() {
        return sid;
    }

    public int getBid() {
        return bid;
    }

    public String getDate() {
        return date;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    
    }
