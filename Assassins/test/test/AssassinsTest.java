/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import models.Assassin;
import models.Node;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author chris
 */
public class AssassinsTest {
    
    Assassin player1, player2, player3, player4, player5, player6;
    Node node1, node2, node3, node4, node5;
    
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
        player1 = new Assassin("Chris", "Myung",'M',"CA", 37);
        player2 = new Assassin("Christian", "Dunne",'F',"SW", 31);
        player3 = new Assassin("John", "Wick",'M',"CA", 32);
        player4 = new Assassin("Agent", "Smith",'F',"SW", 33);
        player5 = new Assassin("Charles", "Bronson",'M',"TT", 31);
        
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void addPlayerTest(){
        player6 = new Assassin("Cancer", "Man", 'M', "CIA", 123);
        
    }
}
