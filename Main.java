/* Main.java
 * written by csi/cen 213 students fall 2016
 * 
 * A class for learning about trees.
 */
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Main {
  public static void main (String [] args) {
    Tree myTree = new Tree();
    File file = new File("test.txt");  
    int wordcount = 0;
    try {

        Scanner sc = new Scanner(file);

        while (sc.hasNext()) {
          myTree.insert(sc.next());
          
          wordcount++;// count words in file
        }
        sc.close();
        System.out.println(myTree.root.key);
        System.out.println(myTree.root.count);
        System.out.println(myTree.root.left.key);
        System.out.println(myTree.root.left.left.key);
        System.out.println(myTree.root.left.left.right.key);
        System.out.println(myTree.root.left.left.right.left.key);
        System.out.println(myTree.root.left.left.right.right.key);
        System.out.println(myTree.root.left.left.right.right.left.key);
        System.out.println(myTree.root.left.left.right.right.right.key);
    } 
    catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    
  }
}