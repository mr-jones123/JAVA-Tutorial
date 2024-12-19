
/**
 *
 * @author johnpaultaguinod
 */
public class ArrayListTest {
    public static void main(String[] args) {
        Listoperation tech = new Listoperation();

        tech.addElement("Paul");
        tech.addElement("Drei");
        tech.addElement("Xy");

        tech.displayElements();

        tech.updateElement(1, "JP");
        tech.displayElements();

        tech.updateElement(2, "Drei");
        tech.displayElements();

        tech.updateElement(3, "Xy");
        tech.displayElements();

        tech.removeElement(0);
        tech.displayElements();
    }
}
