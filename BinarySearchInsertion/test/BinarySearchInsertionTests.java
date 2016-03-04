/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import binarySearchInsertion.BinarySearchInsertion;
import models.DataObj;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author chris
 */
public class BinarySearchInsertionTests {

    BinarySearchInsertion bSearch;

    DataObj obj1, obj2, obj3, obj4, obj5, obj6, obj7, searchObj;
    DataObj[] evenDataArray, oddDataArray, emptyArray;

    public BinarySearchInsertionTests() {

    }

    @BeforeClass
    public static void setUpClass() {

    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
        //Creation of Objects to be inserted into Array
        obj1 = new DataObj('a');
        obj2 = new DataObj('c');
        obj3 = new DataObj('d');
        obj4 = new DataObj('e');
        obj5 = new DataObj('g');
        obj6 = new DataObj('h');
        obj7 = new DataObj('o');

        //Creation of Even numbered Array
        evenDataArray = new DataObj[6];
        //INSERTION OF OBJECTS INTO ARRAY
        evenDataArray[0] = obj1;
        evenDataArray[1] = obj2;
        evenDataArray[2] = obj3;
        evenDataArray[3] = obj4;
        evenDataArray[4] = obj5;
        evenDataArray[5] = obj6;

        //Creation of Odd numbered Array
        oddDataArray = new DataObj[7];
        //Copying even numbered array into odd array
        System.arraycopy(evenDataArray, 0, oddDataArray, 0, evenDataArray.length);
        //Insertion of missing array item
        oddDataArray[6] = obj7;

        emptyArray = new DataObj[0];

        bSearch = new BinarySearchInsertion();

    }

    @After
    public void tearDown() {
    }

    /* Runs test #1 with following conditions:
    - Even number of items
    - Item Does Exist
    - searchObj inserted at lower boundary of array
     */
    @Test
    public void evenExistLowerBoundTest() {

        searchObj = new DataObj('a');

        int insertPosition = bSearch.binarySearch(evenDataArray, searchObj);
        int expectedPosition = 0;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #2 with following conditions:
    - Even number of items
    - Item Does Exist
    - searchObj inserted at between the upper and lower boundary of array
     */
    @Test
    public void evenExistBetweenBoundTest() {

        searchObj = new DataObj('e');

        int insertPosition = bSearch.binarySearch(evenDataArray, searchObj);
        int expectedPosition = 3;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #3 with following conditions:
    - Even number of items
    - Item Does Exist
    - searchObj inserted at upper boundary of array
     */
    @Test
    public void evenExistUpperBoundTest() {

        searchObj = new DataObj('h');

        int insertPosition = bSearch.binarySearch(evenDataArray, searchObj);
        int expectedPosition = 5;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #4 with following conditions:
    - Even number of items
    - Item Does Not Exist
    - searchObj inserted at lower boundary of array
     */
    @Test
    public void evenNotExistLowerBoundTest() {

        searchObj = new DataObj('Z');

        int insertPosition = bSearch.binarySearch(evenDataArray, searchObj);
        int expectedPosition = 0;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #5 with following conditions:
    - Even number of items
    - Item Does Not Exist
    - searchObj inserted at between the upper and lower boundary of array
     */
    @Test
    public void evenNotExistBetweenBoundTest() {

        searchObj = new DataObj('f');

        int insertPosition = bSearch.binarySearch(evenDataArray, searchObj);
        int expectedPosition = 4;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #6 with following conditions:
    - Even number of items
    - Item Does Not Exist
    - searchObj inserted at upper boundary of array
     */
    @Test
    public void evenNotExistUpperBoundTest() {

        searchObj = new DataObj('h');

        int insertPosition = bSearch.binarySearch(evenDataArray, searchObj);
        int expectedPosition = 5;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #7 with following conditions:
    - Even number of items
    - Item Does Exist
    - searchObj inserted at lower boundary of array
     */
    @Test
    public void oddExistLowerBoundTest() {

        searchObj = new DataObj('a');

        int insertPosition = bSearch.binarySearch(oddDataArray, searchObj);
        int expectedPosition = 0;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #8 with following conditions:
    - Even number of items
    - Item Does Exist
    - searchObj inserted at between the upper and lower boundary of array
     */
    @Test
    public void oddExistBetweenBoundTest() {

        searchObj = new DataObj('g');

        int insertPosition = bSearch.binarySearch(oddDataArray, searchObj);
        int expectedPosition = 4;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #9 with following conditions:
    - Odd number of items
    - Item Does Exist
    - searchObj inserted at upper boundary of array
     */
    @Test
    public void oddExistUpperBoundTest() {

        searchObj = new DataObj('o');

        int insertPosition = bSearch.binarySearch(oddDataArray, searchObj);
        int expectedPosition = 6;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #10 with following conditions:
    - Odd number of items
    - Item Does Not Exist
    - searchObj inserted at lower boundary of array
     */
    @Test
    public void oddNotExistLowerBoundTest() {

        searchObj = new DataObj('Z');

        int insertPosition = bSearch.binarySearch(oddDataArray, searchObj);
        int expectedPosition = 0;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #11 with following conditions:
    - Odd number of items
    - Item Does Not Exist
    - searchObj inserted at between the upper and lower boundary of array
     */
    @Test
    public void oddNotExistBetweenBoundTest() {

        searchObj = new DataObj('f');

        int insertPosition = bSearch.binarySearch(oddDataArray, searchObj);
        int expectedPosition = 4;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    /* Runs test #12 with following conditions:
    - Odd number of items
    - Item Does Not Exist
    - searchObj inserted at upper boundary of array
     */
    @Test
    public void oddNotExistUpperBoundTest() {

        searchObj = new DataObj('p');

        int insertPosition = bSearch.binarySearch(oddDataArray, searchObj);
        int expectedPosition = 7;

        Assert.assertEquals(expectedPosition, insertPosition);
    }

    @Test
    public void emptyArrayTest() {

        searchObj = new DataObj(42.231);

        int insertPosition = bSearch.binarySearch(emptyArray, searchObj);
        int expectedPosition = 0;

        Assert.assertEquals(expectedPosition, insertPosition);

    }
}
