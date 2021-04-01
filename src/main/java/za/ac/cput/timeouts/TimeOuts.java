/*
 * Melisa Bhixa,217131085
 * ADP 3 Assignment 1
 * Due Date: 01 April 2021
 */

package za.ac.cput.timeouts;


public class TimeOuts {

    private int totItems;
    public TimeOuts(int totItems) {
        this.totItems = totItems;
    }

    public int loop(){
        int x;
        for(x = 0; x < totItems; x++){
            System.out.println(x);
        }
        return x;
    }
}
