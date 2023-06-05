public class Customer {
    private String name;
    private int id;
    public static int customercount = 10000001;
    private String address;

    public Customer (String name, String address) {
        this.name = name;
        this.address = address;
        this.id = customercount;
        customercount++;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", address='" + address + '\'' +
                '}';
    }


}
