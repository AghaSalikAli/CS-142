public class Address {
    private String name;
    private String street;
    private String city;
    private String state;
    private String code;

    public Address(String name, String street, String city, String state, String code) {
        this.name = name;
        this.street = street;
        this.city = city;
        this.state = state;
        this.code = code;

    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCode() {
        return code;
    }

    public String getState() {
        return state;
    }

    public String getStreet() {
        return street;
    }


    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
