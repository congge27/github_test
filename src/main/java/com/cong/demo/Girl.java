package com.cong.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler"})
public class Girl {
    @Id
    @GeneratedValue
    private Integer id;

    private int Age;

    private String Name;

    private String Cupsize;

    public Girl() {

    }

    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getCupsize() {
        return Cupsize;
    }

    public void setCupsize(String cupsize) {
        Cupsize = cupsize;
    }
}
