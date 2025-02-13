package objects;

import java.util.ArrayList;
import java.util.List;

public class Windowsill {
    private List<Item> items;
    public Windowsill() {
        items = new ArrayList<Item>();
    }
    public void addItem(Item item) {
        items.add(item);
    }
    public void getItems() {
        System.out.print("На подоконнике: ");
        for (Item item : items) {
            System.out.print(item+" ");
        }
        System.out.println();
    }
}
