/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;

/**
 *
 * @author daryl
 */


public class stack {
    private int top;
    private int maxSize;
    private char[] stackArray;
   
    public stack(int size){
    //initialize variables privately above, then implement below    
    this.maxSize = size;
    this.stackArray = new char[maxSize];
    this.top = -1;
}
    public char pop(){
        if(isEmpty()){
            System.out.println("The stack is empty!");
            return '0';
        }
        else{          
        int old_top = top;
        top--;
        return stackArray[old_top];
        //return last, because it stops the method;
        }
    }
    public void push(char l){
        if(isFull()){
            System.out.println(" The stack is full! Cannot push "+l);
        
        }
        else{
        top++; //increment stack array +1
        stackArray[top] = l;
        }
    }
    public boolean isEmpty(){
        return top == -1;
    } 
    public long peak(){
        return stackArray[top];
    }
    public boolean isFull(){
    return(top == maxSize -1);
    }
    public long index(){
        return top;
    }
}

