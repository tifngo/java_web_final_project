package com.example.java_web_final_project;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class Cat {

    @Id
    @GeneratedValue
    private Integer id;
    private String name; // the name of the cat such as Leo
    private String breed;

    public Cat() { // need this for Spring JPA

    }

    public Cat(String name, String breed) {
        this.name = name;
        this.breed = breed;
    }

    public Cat(Integer id, String name, String breed) {
        this.id = id;
        this.name = name;
        this.breed = breed;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBreed() {
        return breed;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", breed='" + breed + '\'' +
                '}';
    }
}