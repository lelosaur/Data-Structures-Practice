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
public class App {
    public static void main(String[] args){
        int size = 6;
        queue queue = new queue(size);
        long i = 0;
        while(queue.size() != size){
            queue.insert(i);
            i++;
            
        }
        queue.peek();
        queue.view();
    }
    
}
