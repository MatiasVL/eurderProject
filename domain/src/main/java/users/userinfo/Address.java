package users.userinfo;

public class Address {
    private String street;
    private int housenumber;
    private int postalCode;
    private String city;


    public Address(String street, int housenumber, int postalCode, String city) {
        this.street = street;
        this.housenumber = housenumber;
        this.postalCode = postalCode;
        this.city = city;
    }
}
