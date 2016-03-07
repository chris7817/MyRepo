/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import models.Node;

/**
 *
 * @author Christopher Myung <Chris.Myung@gmail.com>
 */
/*
Create a cyclic linked list. 
 */
public class MyLinkedList {

    Node head;
    Node tail;
    int listSize;

    public boolean isEmpty() {
        return head == null;
    }

    public int getListSize() {
        return listSize;
    }
    //add node

    public void addPlayer(Node node) {
        //scenario 1: empty linked list
        if (isEmpty()) {
            head = node;
            tail = node;
        } else {
            tail.setTarget(node);
            tail = node;
            node.setTarget(head);

        }

        //scenario 2: non-empty linked list
        //add to the end of the list. 
        //tail.getTarget()
        listSize++;
    }
    //delete node

    public Node getTail() {
        return this.tail;
    }

    // will need to better handle if method returns null
    public Node findNode(int id) throws Exception {

        Node returnNode = null;

        if (head == null) {
            returnNode = null;
        }
        if (head.getPlayer().getId() == id) {
            returnNode = head;
        }

        Node node = head;

        while (node.getTarget() != head) {
            node = node.getTarget();
            if (node.getPlayer().getId() == id) {
                returnNode = node;
            }
        }
        
        return returnNode;

    }

    public void logError(Exception e) {
        System.out.println(e.getMessage());
    }
    
    public void removeNode(int id) throws Exception {
        Node node = findNode(id);
        if(node != null) {
            if(tail == node){
                
            }
        }
        
        
        
    }
}
