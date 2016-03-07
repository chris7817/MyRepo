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
public class Node {
    
    private Assassin player;
    private Node target;
    
    public Node(Assassin player) {
        this(player, null);
    }
    
    public Node(Assassin player, Node target){
        this.player = player;
        this.target = target;
    }
    
    public Assassin getPlayer(){
        return player;
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

    
    
    
}
