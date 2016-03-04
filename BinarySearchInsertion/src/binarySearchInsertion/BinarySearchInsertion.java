/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarySearchInsertion;

/**
 *
 * @author chris
 */
public class BinarySearchInsertion {

    public int binarySearch(Comparable[] objArray, Comparable searchObj) {
        int low = 0;
        int high = objArray.length - 1;
        int mid = 0;

        int insertPosition = 0; // WHERE THE INSERTION WILL TAKE PLACE. 

        while (low <= high) {
            mid = (low + high) / 2;

            if (objArray[mid].compareTo(searchObj) < 0) {

                low = mid + 1;
                insertPosition = low;

            } else if (objArray[mid].compareTo(searchObj) > 0) {

                high = mid - 1;
                if (high < low) {
                    insertPosition = mid;
                } else {
                    insertPosition = high;
                }

            } else {
                high = high - 1;
                insertPosition = mid;
            }

        }

        return insertPosition;
    }
}
