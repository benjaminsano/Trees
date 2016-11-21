/* 
 * Node.java
 * written by csi/cen 213 students fall 2016
 * 
 * Implements node to be used in list class
 */
public class Node {
  // properties
  private String key;
  private Node parent;
  private Node left;
  private Node right;

  // Constructors
  Node(String key) { 
    this.key = key; 
    this.parent = null;
    this.left = null;
    this.right = null;
  }
  
  // getters & setters
  public String getKey(){
    return this.key;
  }
  
  public Node getParent(){
    return this.parent;
  }
  
  public Node getLeft() {
    return this.left;
  }
  
  public Node getRight() {
    return this.right;
  }
  
  public void setKey(String newKey) {
    this.key = newKey;
  }
  
  public void setParent(Node newParent) {
    this.parent = newParent;
  }
  
  public void setLeft(Node newLeft) {
    this.left = newLeft;
  }
  
  public void setRight(Node newRight) {
    this.right = newRight;
  }
  
  // Methods
  public void print() {
    System.out.print(key + " " );
  }
}