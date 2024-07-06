package com.example.demo.model;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
public class User implements Serializable{
    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable =  false)
    private String name;

    public User(Long id,String name)
    {
        this.name=name;
    }
    public User()
    {

    }

    public User(String name)
    {
        this.name=name;
    }

    public void setUser(String name)
    {
        this.name=name;
    }

    public String getUser() {
		return this.name;
	}
}