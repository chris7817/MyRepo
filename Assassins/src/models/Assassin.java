/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author chris
 */
public class Assassin {
    
    private String firstName;
    private String lastName;
    private Character gender;
    private String cluster;
    private Integer age;
    
    public Assassin(String firstName, String lastName, Character gender, String cluster, Integer age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cluster = cluster;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    
}


