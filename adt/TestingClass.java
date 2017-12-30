/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adt;
import ds.linkedlist.*;


/**
 *
 * @author daryl
 */
public class TestingClass {
    public static void main (String args[]){
    App linkedlist = new App();
    Node nodeA = new Node();
    Node nodeB = new Node();
    nodeA.data = 4;
    nodeB.data = 5;
    nodeA.next = nodeB;
    System.out.println(linkedlist.lengthOfList(nodeA));
    }
}
