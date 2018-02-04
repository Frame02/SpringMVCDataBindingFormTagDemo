package com.srikar.springmvc.book.domain;

import java.io.Serializable;

/**
 * Created by vedantas on 2/4/2018.
 */
public class Category implements Serializable {
    private static final long serialVersionUID = 56745345L;

    private long id;
    private String name;

    public Category() {
    }

    public Category(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
