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
public class SinglyLinkedList {
    private Node first;
    
    public SinglyLinkedList(){
        
    }
    public boolean isEmpty(){
        return(first == null);
    }
    public void insertFirst(int data){
        Node newNode = new Node();
        newNode.data = data;
        newNode.next = first;
        first = newNode;       
    }
    public Node deleteNode(){
        Node temp = first;
        //change the pointer to point to the one after first, effectively losing the node
        first = first.next;
        //not sure why he wanted to return anything, but oh well.
        return temp;
    }
    public void displayList(){
        Node temp = first;
        System.out.println("first -> last");
        while(temp != null){
            temp.displayNode();
            temp = temp.next;
        }
    }
    public void insertLast(int data){
        Node temp = first;
        Node last = null;
        last.data = data;
        
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = last;
        
    }
}
