/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;

/**
 *
 * @author daryl
 */
public class Counting {
    public static void main(String args[]){
       
        Counter count = new Counter("counting");
        System.out.println(count.getCurrentValue());
        count.increment(3);
        System.out.println(count.getCurrentValue());
        count.increment(20);
        count.printOut();
    }
}
