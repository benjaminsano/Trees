/* 
 * Tree.java
 * written by csi/cen 213 students fall 2016
 * 
 * Tree class
 * goals:
 * 1. binary search tree
 * 2. delete node
 * 3. 3 kinds of traversal
 * 3a. switch statement & use 3 kinds of traversals
 * 4. find median (alphabetically)
 * 4a.make tree balanced
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
    // recursively insert in a subtree
    this.insert(this.root, newNode); 
  }
  
  public void insert(Node subTree, Node newNode) {
    // basecase 1: empty tree
    if (this.root == null) {
      this.root = newNode;
    }
    // basecase 2: if the key is in the tree already
    else if (newNode.key.compareTo(subTree.key) == 0) {
      subTree.count++;  // increment counter
    }
    // if newNode < subTree, go left
    else if (newNode.key.compareTo(subTree.key)<0) {
      if (subTree.left == null) {
        subTree.left = newNode;
        newNode.parent = subTree;
      }
      else this.insert(subTree.left, newNode);
    }
    // if newNode > subTree, go right
    else {
      if (subTree.right == null) {
        subTree.right = newNode;
        newNode.parent = subTree;
      }
      else this.insert(subTree.right, newNode);
    }
  }
  
  public boolean isEmpty() {
    // tests if the list is empty
    return this.root == null;
  }
  
  public boolean deleteNode(String key) {
    // basecase 1: empty tree
    if (this.root == null) {
      return(false);
    }
    // basecase 2: if the key the subTree
    else if (newNode.key.compareTo(subTree.key) == 0) {
      
      
    }
    
    
    
    // if newNode < subTree, go left
    else if (newNode.key.compareTo(subTree.key)<0) {
      if (subTree.left == null) {
        subTree.left = newNode;
        newNode.parent = subTree;
      }
      else this.insert(subTree.left, newNode);
    }
    // if newNode > subTree, go right
    else {
      if (subTree.right == null) {
        subTree.right = newNode;
        newNode.parent = subTree;
      }
      else this.insert(subTree.right, newNode);
    }
    return(false);
  }
  
  // deletes entire tree
  public void deleteTree() {
    this.root = null;
  }
  
  public void print() {
    this.printInOrder(this.root);
    System.out.println("");
  }
  
  public void printInOrder(Node subTree) {
    if (subTree != null){
      this.printInOrder(subTree.left); 
      subTree.print();
      this.printInOrder(subTree.right);    
    }
  }
}