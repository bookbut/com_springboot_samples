package com.seatel.entity;

public class Loin {
    private long id;
    private String username;
    private String password;

    public Loin(){}
    public Loin(long id,String username,String password){
        this.id= id;
        this.username = username;
        this.password = password;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {

        return username;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "username:" + this.username + " password:" + this.password;
    }
}
