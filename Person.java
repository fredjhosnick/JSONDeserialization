import java.util.Arrays;
import java.util.Objects;

public class Person {

    private String name;
    private String surname;
    private String[] phone;
    private String[] sites;
    private Address address;

    public Person(String name, String surname, String[] phone, String[] sites, Address address) {
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.sites = sites;
        this.address = address;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhone() {
        return phone;
    }

    public void setPhone(String[] phone) {
        this.phone = phone;
    }

    public String[] getSites() {
        return sites;
    }

    public void setSites(String[] sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone=" + Arrays.toString(phone) +
                ", sites=" + Arrays.toString(sites) +
                ", address=" + address +
                '}';
    }
}
