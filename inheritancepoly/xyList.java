package inheritancepoly;
import java.util.*;

class xyList<T> implements theList<T> {
    private T[] arr;
    private int size;

    @SuppressWarnings("unchecked") 
    public xyList(int size) {
        this.size = size;
        arr = (T[]) new Object[size];
    }

    public boolean add(int index, T value) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index or not enough space!");
            return false;
        }
        arr[index] = value;
        return true;
    }

    @SuppressWarnings("unchecked")
    public T[] displayArray() {
        return arr;
    }

    public T delete(T value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] != null && arr[i].equals(value)) {
                T deletedValue = arr[i];
                for (int j = i; j < size - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                arr[size - 1] = null;
                return deletedValue;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        theList<Integer> xy = new xyList<Integer>(4);
        xy.add(0, 10);
        xy.add(2, 22);
        System.out.println(Arrays.toString(xy.displayArray()));
      
    }
}