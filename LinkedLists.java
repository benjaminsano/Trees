/* LinkedLists.java
 * written by csi/cen 213 students fall 2016
 * 
 * A class for learning about linked lists.
 */
public class LinkedLists {
  public static void main (String [] args) {
    List myList = new List();
    
    // tests for singly linked version
    // test isEmpty on empty list; should be true
    /*System.out.println(myList.isEmpty());
    myList.addData(5);
    // test addData; should print 5
    myList.head.print();
    // test isEmpty on non-empty list; should be false
    System.out.println(myList.isEmpty());
    myList.addData(7);
    myList.print();
    myList.addData(6);
    myList.print();
    myList.addData(8);
    myList.print();
    myList.addData(2);
    myList.print();
    myList.addData(1);
    myList.addData(-5);
    myList.addData(4);
    myList.addData(10);
    myList.addData(6);
    myList.print();
    myList.deleteNode(6);
    myList.print();
    System.out.println(myList.deleteNode(6));;
    myList.print();
    System.out.println(myList.deleteNode(6));
    myList.print();
    myList.deleteList();
    System.out.println(myList.head);
    myList.print();*/
    /*String str1 = "orange";
    String str2 = "apple";
    int result = str1.compareTo( str2 );
    System.out.println(result);
    if (newNode.data.compareTo(this.head.data) < 0) {....}*/

    // tests for doubly linked version:
    //System.out.print(myList.head);
    //System.out.println(myList.tail);
    myList.addData(10);
    myList.print();
    myList.addData(5);
    myList.addData(20);
    myList.addData(15);
    myList.addData(45);
    myList.print();
    myList.deleteNode(20);
    myList.print();
    myList.printReverse();
    myList.deleteList();
    myList.print();
    myList.printReverse();
  }
}