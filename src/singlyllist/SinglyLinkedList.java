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
 * @param <E>
 */
public class SinglyLinkedList<E> implements Iterable<E>{

   private int size;
   
   private class Node{
       private E data;
       private Node next;
       
       private Node(E data,Node n){
           this.data = data;
           this.next = n;
       }
       private E getData(){
           return this.data;
       }
       private Node getNext(){
           return this.next;
       }
       private void setNext(Node n){
           this.next = n;
       }
   }
   
   private Node head;
   private Node tail;
   
   public SinglyLinkedList (){
       this.head = null;
       this.tail = null;
   }
   
   private class Linkediterator implements Iterator<E>{
       private Node current = head;
       @Override
       public boolean hasNext(){
            return (current!=null);
       }

       @Override
       public E next(){
           E result = current.getData();
           current=current.getNext();
           return result;
       }
       
   }
   @Override
   public Iterator<E> iterator() {
       return new Linkediterator();
   }
   
   public int size(){
       return size;
   }
   
   public boolean isEmpty(){
       return size==0;
   }
   
   public E first(){
       if(!isEmpty()){
           return head.getData();
       }
       return null;
   }
   
   public E last(){
       if(isEmpty()){ 
           return null;
       }
       return tail.getData();
   }
   
   public void addFirst(E data){
       head = new Node(data, head);
       if(isEmpty()){
           tail = head;
       }
       size++;
   }
   
   public void addLast(E data){
       Node newNode = new Node(data,null);
       if(isEmpty()){
           head=newNode;
       }
       else{
           tail.setNext(newNode);
       }
       tail= newNode;
   }
   
   public E removeFirst(){
       if(isEmpty()){
           return null;
       }
       E answer = head.getData();
       head = head.getNext();
       size--;
       if(size==0){
           tail = null;
       }
       return answer;
   }
}
