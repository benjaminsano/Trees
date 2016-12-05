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
        System.out.println("left " + newNode.key);
        subTree.left = newNode;
        newNode.parent = subTree;
      }
      else this.insert(subTree.left, newNode);
    }
    // if newNode > subTree, go right
    else {
      if (subTree.right == null) {
        System.out.println("right " + newNode.key);
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
    return(this.deleteNode(this.root, key));
  }
  
  public boolean deleteNode(Node subTree, String key) {
    System.out.println("deleteNode: " + key);
    System.out.print("subTree: " + subTree.key);
    System.out.print(" key: " + key);
    System.out.println(" compareTo: " + key.compareTo(subTree.key));
    // basecase 1: empty tree
    if (this.root == null) {
      System.out.println("root == null");
      return(false);
    }
    // case 2: if the key the subTree
    else if (key.compareTo(subTree.key) == 0) {
      // copy right subtree into left subtree
      this.insert(subTree.right, subTree.left);
      subTree.right.print();
      subTree.right.left.print();
      if (subTree == this.root) {
        this.root = subTree.left;
        // to keep root from pointing to deleted node
        this.root.parent = null;
      }
      else {
        subTree.left.parent = subTree.parent;
        subTree.parent.left = subTree.left;
      }
      /*subTree.right.parent = subTree.parent;
      if (subTree.parent == null || subTree == subTree.parent.left) 
        subTree.parent.left = subTree.right;
      else
        subTree.parent.right = subTree.right;*/
      return(true);
    }
    else if (key.compareTo(subTree.key) > 0) {
      this.deleteNode(subTree.right, key);
    }
    else {
      this.deleteNode(subTree.left, key);
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