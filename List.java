/* 
 * List.java
 * written by csi/cen 213 students fall 2016
 * 
 * List class
 */
public class List {
  // properties
  Node head;
  Node tail;

  // Constructors
  List() { 
    this.head = null;
    this.tail = null;
  }
  // getters & setters
  public Node getHead() {
    return this.head;
  }
  public Node getTail() {
    return this.tail;
  }
  public void setHead(Node newHead) {
    if (this.head == this.tail)
      this.tail = newHead;
    this.head = newHead;
  }
  public void setTail(Node newTail) {
    if (this.head == this.tail)
      this.head = newTail;
    this.tail = newTail;
  }
  
  
  // Methods
  // Adds node to the head of the list
  public void addData(int newInt) {
    Node newNode = new Node(newInt);
    
    // if list is empty, 
    //add data to new head node
    if (this.isEmpty()) {
      this.head = newNode;
      this.tail = newNode;
    }
    else 
    // compare nodes & put new node in
    // numeric order
    {
      // local Node variable to keep track of where we are
      // start at the head of the list
      Node current = this.head;
      //System.out.println(current);
      while(current != null) {
        //System.out.println("current != null " + current);
        // the new node is < the current node, add in front
        if (current != null && newNode.getData() < current.getData() ) {
          //System.out.println("<");
          // make new node point to the head
          newNode.setNext(this.head);
          // make head point to the new node
          this.head = newNode;
          current.setPrev(newNode);
          break;
        }
        else if ( newNode.getData() < current.getNext().getData()) {
          newNode.setNext(current.getNext());
          // point current's next to the new Node
          current.getNext().setPrev(newNode);
          current.setNext(newNode);
          newNode.setPrev(current);
          
          break;
        }
        // if we get to the end of the list, add the new node
        else if (current.getNext() == null) {
          current.setNext(newNode);
          newNode.setPrev(current);
          this.tail = newNode;
          break;
        }
        current = current.getNext();

        // move current to the next node
        //current = current.next;
      }
    }
  }
  
  public boolean isEmpty() {
    // tests if the list is empty
    return this.head == null;
  }
  
  public boolean deleteNode(int data) {
    Node current = this.head;
    while(current != null) {
      if (current.getNext() != null && current.getNext().getData() == data) {
        current.setNext(current.getNext().getNext());
        current.getNext().setPrev(current);
        return(true);
      }
      current = current.getNext();
    }
    return(false);
  }
  
  // deletes entire list
  public void deleteList() {
    this.head = null;
    this.tail = null;
  }
  
  /*public void addNode(Node n){
  }*/
  
  public void print() {
    // local Node variable to keep track of where we are
    // start at the head of the list
    Node current = this.head;
    // loop through until we get to end of list
    while(current != null) {
      current.print(); // print current node
      // move current to the next node
      current = current.getNext();
    }
    System.out.println("");
  }
  
  public void printReverse() {
    // traverses and prints from tail
    // local Node variable to keep track of where we are
    // start at the tail of the list
    Node current = this.tail;
    // loop through until we get to end of list
    while(current != null) {
      current.print(); // print current node
      // move current to the next node
      current = current.getPrev();
    }
    System.out.println("");
  }
  
  
}