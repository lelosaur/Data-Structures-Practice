/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.singlylinkedlist;

/**
 *
 * @author daryl
 */
public class App {
    public static void main (String args[]){
    SinglyLinkedList SLL = new SinglyLinkedList();
    Node node = null;
    node.next = null;
    SinglyLinkedList SLL2 = null;
   
    SLL.insertFirst(1);
    SLL.insertFirst(2);
    SLL.insertFirst(3);
    SLL.insertFirst(4);
    SLL.displayList();
    
}
}
