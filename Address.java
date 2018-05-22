import java.util.Objects;

public class Address {


    private String contry;
    private String city;
    private String street;

    public Address(String contry, String city, String street) {
        this.contry = contry;
        this.city = city;
        this.street = street;
    }

    public Address() {
    }

    public String getContry() {
        return contry;
    }

    public void setContry(String contry) {
        this.contry = contry;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "Address{" +
                "contry='" + contry + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
