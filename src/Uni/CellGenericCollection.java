package Uni;

public class CellGenericCollection {
    T[] cells;
    int index = 0;

    public CellGenericCollection(int size) {
        cells = (T[]) new Object[size]; // new T[size] gives error
    }//end constructor

    public void add(T c) {
        cells[index] = c;
        index++;
    }//end method add

    public T get(int i) {
        return cells[i];
    }//end method get
    //other methods such as insert, delete, sort
}
