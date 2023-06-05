public class City {
    private String name;
    private String latitude;
    private String longitude;
    private String country;
    private String iso2;
    private String admin_name;

    public City(String name, String latitude, String longitude, String country, String iso2, String admin_name) {
        this.name = name;
        this.latitude = latitude;
        this.longitude = longitude;
        this.country = country;
        this.iso2 = iso2;
        this.admin_name = admin_name;
    }

    public String getName() {
        return name;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public String getCountry() {
        return country;
    }

    public String getIso2() {
        return iso2;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setIso2(String iso2) {
        this.iso2 = iso2;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "{" +
                "name='" + name + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", country='" + country + '\'' +
                ", iso2='" + iso2 + '\'' +
                ", admin_name='" + admin_name + '\'' +
                '}';
    }
}
