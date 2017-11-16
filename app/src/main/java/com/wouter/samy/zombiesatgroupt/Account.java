package com.wouter.samy.zombiesatgroupt;

/**
 * Created by wouter heerwegh on 16/11/2017.
 */

public class Account {
    int id;
    String name;
    String pass;
    public Account(String name, String pass){
        this.name = name;
        this.pass = pass;
    }

    public Account(int id, String name, String pass){
        this.id = id;
        this.name = name;
        this.pass = pass;
    }

    public int getId(){
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPass() {
        return pass;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}
