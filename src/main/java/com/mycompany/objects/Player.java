/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.objects;

/**
 *
 * @author anthe
 */
public class Player {
    
    private int number;
    private String name;
    private String country; 

    public Player(int number, String name, String country) {
        this.number = number;
        this.name = name;
        this.country = country;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public String getCountry() {
        return country;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    
    
}
