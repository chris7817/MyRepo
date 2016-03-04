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
public class Node {
    
    private Assassin player;
    private Node target;
    
    public Node(Assassin player) {
        this.player = player;
        
        
    }
    
    public Assassin getNode() {
        return this.player;
    }
    
    public Node getTarget() {
        return this.target;
    }
    
    public void setTarget(Node node) {
        this.target = node;
        
    }
    
//    public String toString() {
//        String name = player.getLastName();
//        return name;
//    }
//
//    public Assassins getPlayer() {
//        return player;
//    }
//
//    public void setPlayer(Assassins player) {
//        this.player = player;
//    }
//
//    public Node getTarget() {
//        return target;
//    }
//
//    public void setTarget(Node target) {
//        this.target = target;
//    }
    
    
    
}
