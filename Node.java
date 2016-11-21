/* 
 * Node.java
 * written by csi/cen 213 students fall 2016
 * 
 * Implements node to be used in list class
 */
public class Node {
  // properties
  private int data;
  private Node prev;
  private Node next;

  // Constructors
  Node(int d) { 
    this.data = d; 
    this.next = null;
    this.prev = null;
  }
  
  // Maybe we'll need this later?
  //public Node(Node previous, Node next, int value)
  
  // getters & setters
  public int getData(){
    return this.data;
  }
  
  public Node getPrev(){
    return this.prev;
  }
  
  public Node getNext() {
    return this.next;
  }
  
  public void setData(int newData) {
    this.data = newData;
  }
  
  public void setPrev(Node newPrev) {
    this.prev = newPrev;
  }
  
  public void setNext(Node newNext) {
    this.next = newNext;
  }
  
  // Methods
  public void print() {
    System.out.print(data + " " );
  }
}