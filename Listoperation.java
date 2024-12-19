
import java.util.ArrayList;

class Listoperation implements ListArray {
    private ArrayList<String> arrayList;

    public Listoperation() {
        arrayList = new ArrayList<>();
    }

    @Override
    public void addElement(String element) {
        arrayList.add(element);
        System.out.println("Added " + element);
    }

    @Override
    public void removeElement(int index) {
        if (index >= 0 && index > arrayList.size()) {
            String removed = arrayList.remove(index);
            System.out.println("Removed " + removed);
        } else {
            System.out.println("element removed");
        }
    }

    @Override
    public void updateElement(int index, String newElement) {
        if (index >= 0 && index < arrayList.size()) {
            String oldElement = arrayList.set(index, newElement);
        } else {
            System.out.println("Invalid index, No updated ");
        }
    }

    @Override
    public void displayElements() {
        System.out.println("ArrayList Elemenets:" + arrayList);
    }

}
