package com.ubb.cms;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * Created by Alexandra Muresan on 4/10/2017.
 */
@Entity(name="conference")
public class Conference implements Serializable{
    @Id
    @Column(name="id")
    private int id;
    @Column(name="name")
    private String name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Conference(int id, String name){
        this.id = id;
        this.name = name;

    }
}
