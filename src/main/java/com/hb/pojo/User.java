package com.hb.pojo;

/**
 * @author hb
 * @create 2020-06-19 18:23
 */
public class User {
    private String name;
    private String bir;


    public User(String name, String bir) {
        this.name = name;
        this.bir = bir;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBir() {
        return bir;
    }

    public void setBir(String bir) {
        this.bir = bir;
    }
}
