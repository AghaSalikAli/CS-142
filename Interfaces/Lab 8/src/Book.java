import java.util.Arrays;

public class Book {
    private String name;
    private Author[] authors;
   // private Author author;
    private double price;
    private int qty;

    public Book (String name, Author[] authors, double price, int qty) {
        this.name = name;
        this.authors = authors;
        this.price = price;
        this.qty = qty;
    }

    /*public Book (String name, Author author, double price, int qty) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }*/

    public Book (String name, Author[] authors, double price) {
        this.name = name;
        this.authors = authors;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public String getAuthornames() {
        String a = null;
        for (int i =0; i<authors.length; i++)
            a = a + authors[i].getName() + " ";
    return a;
    }

    public Author[] getAuthors() {
        return authors;
    }

    public double getPrice() {
        return price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + getName() + '\'' +
                ", authors=" + Arrays.toString(getAuthors()) +
                ", price=" + getPrice() +
                ", qty=" + getQty() +
                '}';
    }
}

