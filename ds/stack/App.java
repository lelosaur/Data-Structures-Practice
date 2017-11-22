/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ds.stack;
import java.util.*;

/**
 *
 * @author daryl
 */
public class App {
    public static void main(String[] args){
       int n = 20; 
       stack ourStack = new stack(n); 
//       int i = 1;
//       while(!ourStack.isFull()){
//          
//           
//           ourStack.push(i);
//           i++;
//       }
//       ourStack.push(999);
//       while(ourStack.index()!=-1){
//           System.out.println(ourStack.pop());
//           
//       }
//       ourStack.pop();
        System.out.println(reverseString("wow so cool mang"));
        String string = "asdf";
        System.out.println(string.charAt(3));
       
    }
    
    public static String reverseString(String str){
        
        int stackSize = str.length();
        stack newStack = new stack(stackSize);
        for(int j = 0; j < str.length(); j++){
            char ch = str.charAt(j);
            newStack.push(ch); //inserts ch into newStack
        }
        String result = "";
        while(!newStack.isEmpty()){//while the stack isn't empty, pop
            //System.out.println(newStack.pop()); remove lines below in while for individual chars
          char ch = newStack.pop();
          result = result + ch;
        }
        return result;
    }

    
}
