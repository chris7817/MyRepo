/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author Christopher Myung <Chris.Myung@gmail.com>
 */
public class Assassin {
    
    static int objCounter = 0;
    
    private String firstName;
    private String lastName;
    private Character gender;
    private String cluster;
    private Integer age;
    private int id = 0;
    
    public Assassin(String firstName, String lastName, Character gender, String cluster, Integer age) {
        
        objCounter++;
        
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cluster = cluster;
        this.age = age;
        this.id = objCounter;
        
    }
    
    public Assassin(){
        
    }
    
    public Assassin(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    
    public int getId(){
        return id;
    }
    
}


