/* 
 * Tree.java
 * written by csi/cen 213 students fall 2016
 * 
 * Tree class
 * goals:
 * 1. binary search tree
 * 2. 3 kinds of traversal
 * 2a. switch statement & use 3 kinds of traversals
 * 3. find median (alphabetically)
 * 3a.make tree balanced
 */
public class Tree {
  // properties
  Node root;

  // Constructors
  Tree() { 
    this.root = null;
  }
  
  // Methods
  // Adds node to the head of the list
  public void insert(String newKey) {
    Node newNode = new Node(newKey);
    // if tree is empty, 
    //add data to new root node
    if (this.isEmpty()) {
      this.root = newNode;
    } else {
      // compare nodes & insert in proper spot
      // local Node variable to keep track of 
      // where we are
      // start at the root of the tree
      Node current = this.root;
      // greater goes right
      while (current != null){
        if (newKey.compareTo(current.key) >  0) {
          // if right is null, add new node to right
          if (current.right == null)
            current.right = newNode;
          current = current.right;
          // less than goes left
        } else if (newKey.compareTo(current.key) < 0) {
          // if left is null, add new node to left
          if (current.left == null)
            current.left = newNode;
          current = current.left;
          // equal increments counter
        } else {
          current.count++;
        }
      }
    }
  }
  
  public boolean isEmpty() {
    // tests if the list is empty
    return this.root == null;
  }
  
  public boolean deleteNode(String key) {
    // TODO: rewrite
    
    /*Node current = this.root;
    while(current != null) {
      if (current.getNext() != null && current.getNext().getData() == key) {
        current.setNext(current.getNext().getNext());
        current.getNext().setPrev(current);
        return(true);
      }
      current = current.getNext();
    }*/
    return(false);
  }
  
  // deletes entire tree
  public void deleteTree() {
    this.root = null;
  }
  
  public void print() {
    // TODO: replace this with different kinds of traversals
    
    /*
    // local Node variable to keep track of where we are
    // start at the head of the list
    Node current = this.head;
    // loop through until we get to end of list
    while(current != null) {
      current.print(); // print current node
      // move current to the next node
      current = current.getNext();
    }
    System.out.println("");*/
  }
  
}