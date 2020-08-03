/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singlyllist;

import java.util.Iterator;

/**
 *
 * @author chris_000
 */
public class SinglyLList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SinglyLinkedList<String> sList = new SinglyLinkedList<>();
       
        sList.addFirst("hello");
        sList.addLast("high");
        
        Iterator<String> n = sList.iterator();
        while(n.hasNext()){
            System.out.println(n.next());
        }
    }
}
