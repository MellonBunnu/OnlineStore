import java.util.ArrayList;

// Author: quinn
// Simple store that holds items, can list, add, sell and show creators.
public class Store {
    ArrayList<ItemForSale> items = new ArrayList<>();
    private float profit = 0.0f;

    // Pre: items may be empty.
    // Post: prints all item names in the store.
    public void ShowItems() {
        for (int i = 0; i < items.size(); i++)
            System.out.println(items.get(i).getName());
    }

    // Pre: newItem non-null.
    // Post: newItem added to items list.
    public void addItem(ItemForSale newItem) {
        items.add(newItem);
    }

    // Pre: item exists in items list.
    // Post: item removed and its price added to profit; prints profit.
    public void sellItem(ItemForSale item) {
        items.remove(item);
        float counter = Float.parseFloat(item.getPrice());
        profit = profit + counter;
        System.out.println("$" + profit);
    }

    // Pre: item non-null and has a creator.
    // Post: prints the creator's name.
    public void creator(ItemForSale item) {
        System.out.println(item.getCreator().getName());
    }

}