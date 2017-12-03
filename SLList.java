/**An SLList is a list of integers, which hides the terrible truth
of the nakedness within**/
public class SLList {

  private static class IntNode {
    public int item;
    public IntNode next;

    public IntNode(int i, IntNode n) {
      item = i;
      next = n;
    }
  }

 /*The first item (if it exists) is at sentinel.next*/
  private IntNode sentinel;
  private int size;

  public SLList() {
    sentinel = new IntNode(63, null);
    size = 0;
  }

  public SLList(int x) {
    sentinel = new IntNode(63, null);
    sentinel.next = new IntNode(x, null);
    size = 1;
  }

  /**Adds x to the front of the list*/
  public void addFirst(int x) {
    sentinel.next = new IntNode(x, sentinel.next);
    size = size + 1;
  }


  //**Returns the first item in the list*/
  public int getFirst(int x) {
    return sentinel.next.item;
  }

  /**Adds x to the end of the list*/
  public void addLast(int x) {
    /*Get the first node in the current SLList object*/
    IntNode node = sentinel;
    size = size + 1;

      /*Move through the list until we reach the last node*/
      while (node.next != null) {
        node = node.next;
      }
      /*Assign the last node a new IntNode object*/
      node.next = new IntNode(x, null);
    }

  /*Get the size of the SLList*/
  public int size() {
    return size;
  }

  public static void main (String[] args) {
    SLList L = new SLList();
    // L.addFirst(10);
    // L.addFirst(15);
    // L.addFirst(5);
    L.addLast(6);
    System.out.print("Size is: ");
    System.out.println(L.size());
  }
}
