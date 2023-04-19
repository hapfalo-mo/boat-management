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
public class Sailor {
    private int sid;
    private String sname;
    private String password;
    private int rating;
    private int age;

    public Sailor() {
    }

    public Sailor(int sid, String sname, String password, int rating, int age) {
        this.sid = sid;
        this.sname = sname;
        this.password = password;
        this.rating = rating;
        this.age = age;
    }

    public Sailor(String sname, String password, int rating, int age) {
        this.sname = sname;
        this.password = password;
        this.rating = rating;
        this.age = age;
    }
    

    public int getSid() {
        return sid;
    }

    public String getSname() {
        return sname;
    }

    public String getPassword() {
        return password;
    }

    public int getRating() {
        return rating;
    }

    public int getAge() {
        return age;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    
}
