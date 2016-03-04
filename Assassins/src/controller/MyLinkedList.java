/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Assassin;
import models.Node;

/**
 *
 * @author chris
 */
/*
Create a cyclic linked list. 
*/
public class MyLinkedList {
    
    Node head;
    Node tail;
    int listSize;
    
    MyLinkedList() {
        head = null;
        tail = null;
        listSize = 0;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public int getListSize() {
        return listSize;
    }
    //add node
    
    
    public void addPlayer(Node node) {
        //scenario 1: empty linked list
        if(isEmpty()){
            head = node;
            tail = node;
        }
        else{
            tail.setTarget(node);
            tail = node;
            node.setTarget(head);
        }
        
        //scenario 2: non-empty linked list
        //add to the end of the list. 
        //tail.getTarget()
    }
    //delete node
    
    //Find node
    
}
