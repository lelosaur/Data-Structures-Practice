/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;
import java.util.*;

/**
 *
 * @author daryl
 */
public class Counter {

    int counter=0;
    public Counter(String str){
        String name = str;
       
    }

    public void increment(int add){

        counter = counter + add;
        
    }
    
    public int getCurrentValue(){
        return counter;
    }
    public String ToString(){
        return Integer.toString(counter);
        
    }
    
    public void printOut(){
        System.out.println(getCurrentValue());
    }
    
    
}
