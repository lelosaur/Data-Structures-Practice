/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.linkedlist;

/**
 *
 * @author daryl
 */
public class App {
    public static void main(String args[]){
    Node nodeA = new Node();
    nodeA.data = 4;
    
    Node nodeB = new Node();
    nodeB.data = 3;

    
    Node nodeC = new Node();
    nodeC.data = 7;
    
    
    Node nodeD = new Node();
    nodeD.data = 8;



    nodeA.next = nodeB;
    nodeB.next = nodeC;
    nodeC.next = nodeD;
    
    System.out.println(listLength(nodeB));
    System.out.println(lengthOfList(nodeA));
    }
    //you can call non static classes, but ONLY through an object in OOP
    public static int listLength(Node aNode){
        return aNode.data;
    }
    public static int lengthOfList(Node aNode){
        int i = 1;
        Node head;
        while(aNode.next != null){
            i++;
            head = aNode.next;
            aNode = head;
        }
        return i;
    }
    public static void insert(int index, Node nNode, Node oNode){
        int i = 0;
        Node head;
        Node temp = nNode;
        while(i != index){
            i++;
            head = temp.next;
            temp = head;
        }
        nNode.next = oNode.next;
        
    }
}
