public class IntList {
  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }

  public static void main(String[] args) {
    L = new IntList(15, null);
    L = new IntList(10, L);
    L = new IntList(5, L);

    System.out.println(L.length());
  }

  public static int length() {
    public static int getLength(int count) {
      count = count + 1;
      if (this.rest == null) {
        return count;
      } else {
        this.getLength();
      }
    return getLength(0);
    }
  }
}

  //method for getting size of IntList
