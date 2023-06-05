import java.util.ArrayList;
import java.util.List;

public class Order {
    private int id;
    private Customer customer;
    private ArrayList<Product> items;
    private double total;
    public static int ordercount = 20000001;

    public Order(Customer customer) {
        this.customer = customer;
        items = new ArrayList<>();
        this.id = ordercount;
        ordercount++;
    }

    public int getId() {
        return id;
    }

    public Customer getCustomer() {
        return customer;
    }

    public double getTotal() {
        total = 0;
        for (Product item : items) {
            total = total + (item.getPrice()) * item.getQuantity();
        }
        return total;
    }

    public List<Product> getItems() {
        return items;
    }

    public void additem(Product item, int Quantity) {
        item.setQuantity(item.getQuantity() - Quantity);
        Product a = new Product(item);
        a.setQuantity(Quantity);
        items.add(a);
    }

    public void removeitem(Product item, int Quantity) {
        for (Product product : items) {
            if (item.getName().equals(product.getName())) {
                item.setQuantity(item.getQuantity() + Quantity);
                product.setQuantity(product.getQuantity()-Quantity);
                return;
            }
        }
    }
}