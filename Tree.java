/* 
 * Tree.java
 * written by csi/cen 213 students fall 2016
 * 
 * Tree class
 * goals:
 * 1. x binary search tree
 * 2. x delete node
 * 3. x 3 kinds of traversal
 * 3a. x switch statement & use 3 kinds of traversals
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
    // basecase 0: newNode = null; do nothing
    if (newNode == null) {
    }
    // basecase 1: empty tree
    else if (this.root == null) {
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
      else 
      {
        System.out.println("left " + newNode.key);
        this.insert(subTree.left, newNode);
      }
    }
    // if newNode > subTree, go right
    else {
      // if there's no right node, insert it here
      if (subTree.right == null) {
        System.out.println("right " + newNode.key);
        subTree.right = newNode;
        newNode.parent = subTree;
      }
      else {
        System.out.println("right " + newNode.key);
        // if there is a right node, 
        //insert recursively into right subtree
        this.insert(subTree.right, newNode);
      }
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
      this.insert(subTree.left, subTree.right);
      if (subTree == this.root) {
        this.root = subTree.left;
        // to keep root from pointing to deleted node
        this.root.parent = null;
      }
      else if (subTree.left != null) {
        subTree.left.parent = subTree.parent;
        subTree.parent.left = subTree.left;
      } // node is at bottom of tree (no children)
      else if (subTree.parent.left != null && subTree.parent.left.key.compareTo(key) == 0){
        subTree.parent.left = null;
      } else if (subTree.parent.right != null && subTree.parent.right.key.compareTo(key) == 0) {
        subTree.parent.right = null;
      }
      return(true);
    }
    else if (key.compareTo(subTree.key) > 0) {
      if (subTree.right == null) return(false);
      this.deleteNode(subTree.right, key);
    }
    else {
      if (subTree.left == null) return(false);
      this.deleteNode(subTree.left, key);
    }
    return(false);
  }
  
  // deletes entire tree
  public void deleteTree() {
    this.root = null;
  }
  
  public void print(int traverseType) {
    switch (traverseType) {
      case 1:
        this.printInOrder(this.root);
        break;
      case 2:
        this.printPreOrder(this.root);
        break;
      case 3:
        this.printPostOrder(this.root);
        break;
      default :
        this.printInOrder(this.root);
        break;
       
    }
    System.out.println("");
  }
  
  public void printPreOrder(Node subTree) {
    if (subTree != null){
      // print root
      subTree.print();
      // print left subtree
      this.printPreOrder(subTree.left);
      // print right subtree
      this.printPreOrder(subTree.right);    
    }
  }
  
  public void printInOrder(Node subTree) {
    if (subTree != null){
      // print left subtree
      this.printInOrder(subTree.left);
      // print root
      subTree.print();
      // print right subtree
      this.printInOrder(subTree.right);    
    }
  }
  
  public void printPostOrder(Node subTree) {
    if (subTree != null){
      // print left subtree
      this.printPostOrder(subTree.left);
      // print right subtree
      this.printPostOrder(subTree.right); 
      // print root
      subTree.print();
    }
  }
  
    public int getSize(Node subTree) {
    int size = 0;
    if (subTree != null){
      // size of left subtree
      size = this.getSize(subTree.left);
      // add current node to size
      size ++;
      // size of right subtree
      size = size + this.getSize(subTree.right);    
    }
    return(size);
  }
  
    public Node findMiddle(int index) {
      for (int i = 0; i <= index; i++) {
        /// traverse until we get to ith node
        // or something else?
      }
    }
    
    
  public void balance(Node subTree) {
    // find middle of subtree
    int size = getSize(subTree);
    // find middle index, accounting for truncation
    int middle = (int)(size/2+0.5);
    
    // make middle root
    // balance left
    // balance right
    
  }
}