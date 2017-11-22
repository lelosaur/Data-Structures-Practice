/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.queue;

/**
 *
 * @author daryl
 */
public class queue {
    private int maxSize; // the size
    private long[] queArray; // the array
    private int front; // the front
    private int rear; // the end
    private int nItem; //index|place in queue
    
    public queue(int size){
        this.maxSize = size;
        this.queArray = new long[size];
        this.front = 0; //first of the list
        this.rear = -1; //last of the list
        this.nItem = 0; // amount of items in list
    }
    public void insert(long j){
        rear++;
        nItem++;
        queArray[rear] = j;
    }
    public void peek(){
        System.out.println("the top is "+queArray[front]);
    }
    public long remove(){
       long temp = queArray[front];
       front++;
       if(front == maxSize){
           front = 0; //if the front is at the max size, the queue is empty. bottom to top arrangement.          
       }
       
       
       nItem --;
       return temp;
    }
    public long peekFront(){
        return queArray[front];
    }
    public void view(){
        System.out.print("[");
        for(int i=0; i < nItem; i++){
            System.out.print(queArray[i]);
        }
        System.out.print("]");
    }
    public long retrieve(){
        return queArray[front];
    }
    public boolean max(){
        return(nItem == maxSize -1);
    }
    public boolean isFull(){
        return (nItem == maxSize);
    }
    public int size(){
        return nItem;
    }
    
}
