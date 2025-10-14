import java.util.ArrayList;

public class Store {
    ArrayList<ItemForSale> items = new ArrayList<>();
    private float profit = 0.0f;

    public void ShowItems() {
        for (int i = 0; i < items.size(); i++)
            System.out.println(items.get(i).getName());
    }

    public void addItem(ItemForSale newItem) {
        items.add(newItem);
    }

    public void sellItem(ItemForSale item) {
        items.remove(item);
        float counter = Float.parseFloat(item.getPrice());
        profit = profit + counter;
        System.out.println("$" + profit);
    }

    public void creator(ItemForSale item) {
        System.out.println(item.getCreator().getName());
    }

}