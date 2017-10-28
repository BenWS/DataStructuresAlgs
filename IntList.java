public class IntList {
  public int first;
  public IntList rest;

  public IntList(int f, IntList r) {
    first = f;
    rest = r;
  }

  public static void main(String[] args) {
    IntList L = new IntList(15, null);
    L = new IntList(10, L);
    L = new IntList(5, L);

    IntList L_new = L.get(3);
    System.out.println(L_new.first);
  }

  public int size() {
    if (this.rest == null) {
      return 1;
    } else {
      return 1 + this.rest.size();
    }
  }

  public int iterativeSize() {
    //While intList.rest is not null
      // count + 1
      //set intList.rest to new value

      IntList currentList = this;
      int size = 0;

      do {
        size += 1;
        currentList = currentList.rest;
      } while (currentList != null);

      return size;
  }

  public int iterativeSizeWhile() {
    //While intList.rest is not null
      // count + 1
      //set intList.rest to new value

      IntList currentList = this;
      int size = 0;

      while (currentList != null) {
        size += 1;
        currentList = currentList.rest;
      };

      return size;
  }

  public IntList get(int index) {
    int current_index = this.size();
    IntList rest = this.rest;
    IntList new_rest = rest;
    //index = 3
    //current_index = 3

    //current_index >= index ---> FALSE
    //return current rest


    while (new_rest != null) {
      new_rest = new_rest.rest;
      current_index = current_index - 1;
    }

    return rest;
    //return IntList object
  }
}

  //method for getting size of IntList
