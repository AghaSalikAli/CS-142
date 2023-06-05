public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Salik", "Clifton, Bath Island, 95/B");
        System.out.println(customer);
        Customer customer2 = new Customer("Alina", "IBA City Campus");
        System.out.println(customer2);
        Product p1 = new Product("Head and Shoulders", "Anti-Dandruff Shampoo", 20.0, 4);
        Product p2 = new Product("Green Slanty", "Saltish Chips", 10.0, 10);
        Product p3 = new Product("Slice", "Mango Juice", 15, 30);
        Store s1 = new Store();
        s1.addProduct(p1);
        s1.addProduct(p2);
        s1.addProduct(p3);
        s1.viewproducts();
        Order o1 = new Order(customer);
        o1.additem(p1, 3);
        o1.additem(p2,4);
        o1.additem(p3,4);
        s1.viewproducts();  //updated qty in the store
        System.out.println(o1.getItems()); //correct qty in order shown
        System.out.println(o1.getTotal());
        o1.removeitem(p1,1);
        System.out.println(o1.getItems());
        System.out.println(o1.getTotal());
        s1.viewproducts();   //updated qty in the store
    }
}