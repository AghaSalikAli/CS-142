import java.util.ArrayList;

public class Store {
    private ArrayList<Product> products;

    public Store () {
        this.products = new ArrayList<>();
    }
    public void viewproducts() {
        for (Product product : products) {
            System.out.println("Name: " + product.getName() + ", " + "Current Qty: " + product.getQuantity());
        }
    }

    public void addProduct(Product product) {
        for (Product listproduct : products) {
            if (listproduct.getName().equals(product.getName())) {
                product.setQuantity(product.getQuantity() + 1);
                return;
            }
        }
        products.add(product);
    }

    public void removeProduct(Product product) {
        for (Product listproduct : products) {
            if (listproduct.getName().equals(product.getName())) {
                products.remove(listproduct);
                return;
            }
        }
    }
}