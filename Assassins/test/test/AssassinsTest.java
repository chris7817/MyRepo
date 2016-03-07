/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import controller.MyLinkedList;
import models.Assassin;
import models.Node;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author Christopher Myung <Chris.Myung@gmail.com>
 */
public class AssassinsTest {

    Assassin player1, player2, player3, player4, player5, player6;
    Node node1, node2, node3, node4, node5;

    MyLinkedList myLinkedList;

    public AssassinsTest() {
    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        player1 = new Assassin("Chris", "Myung", 'M', "CA", 37);
        player2 = new Assassin("Christian", "Dunne", 'F', "SW", 31);
        player3 = new Assassin("John", "Wick", 'M', "CA", 32);
        player4 = new Assassin("Agent", "Smith", 'F', "SW", 33);
        player5 = new Assassin("Charles", "Bronson", 'M', "TT", 31);

        node1 = new Node(player1);
        node2 = new Node(player2);
        node3 = new Node(player3);
        node4 = new Node(player4);
        node5 = new Node(player5);

        myLinkedList = new MyLinkedList();

    }

    @After
    public void tearDown() {
    }


    @Test
    public void addPlayerTest() {
        player6 = new Assassin("Cancer", "Man", 'M', "CIA", 123);
        Node node6 = new Node(player6);
        
        Assert.assertTrue(myLinkedList.isEmpty());

        myLinkedList.addPlayer(node6);

        Assert.assertFalse(myLinkedList.isEmpty());

    }
    @Test
    public void tailTest(){
        myLinkedList.addPlayer(node3);
        myLinkedList.addPlayer(node2);
        myLinkedList.addPlayer(node4);
        myLinkedList.addPlayer(node5);
        
        String expectedLastName = node5.getNode().getLastName();
        Assert.assertEquals(expectedLastName, myLinkedList.getTail().getPlayer().getLastName());
        
    }
    
    @Test
    public void findNodeByIdTest() throws Exception {
        
        myLinkedList.addPlayer(node3);
        myLinkedList.addPlayer(node2);
        myLinkedList.addPlayer(node4);
        myLinkedList.addPlayer(node5);
        
        String expectedLastName = node3.getNode().getLastName();
        
        try{
        Assert.assertEquals(expectedLastName, myLinkedList.findNode(1).getNode().getLastName());
        }
        catch (Exception e){
            Assert.assertEquals(e.getMessage(), null);
        }
    }
    
    @Test
    public void findFirstNodeByIdTest() throws Exception {
        
        myLinkedList.addPlayer(node3);
        myLinkedList.addPlayer(node2);
        myLinkedList.addPlayer(node4);
        myLinkedList.addPlayer(node5);
        
        String expectedLastName = node3.getNode().getLastName();
        
        try{
        Assert.assertEquals(expectedLastName, myLinkedList.findNode(3).getNode().getLastName());
        }
        catch (Exception e){
            Assert.assertEquals(e.getMessage(), null);
        }
    }
    
    @Test
    public void findLastNodeByIdTest() throws Exception {
        
        myLinkedList.addPlayer(node3);
        myLinkedList.addPlayer(node2);
        myLinkedList.addPlayer(node4);
        myLinkedList.addPlayer(node5);
        
        String expectedLastName = node5.getNode().getLastName();
        
        try{
        Assert.assertEquals(expectedLastName, myLinkedList.findNode(5).getNode().getLastName());
        }
        catch (Exception e){
            Assert.assertEquals(e.getMessage(), null);
        }
    }

}
