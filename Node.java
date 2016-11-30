/* 
 * Node.java
 * written by csi/cen 213 students fall 2016
 * 
 * Implements node to be used in list class
 */
public class Node {
  // properties
  public String key;
  public int count;
  public Node parent;
  public Node left;
  public Node right;

  // Constructors
  Node(String key) { 
    this.key = key; 
    this.count = 1;
    this.parent = null;
    this.left = null;
    this.right = null;
  }
  
  // Methods
  public void print() {
    System.out.println(key + " count: " + this.count);
  }
}