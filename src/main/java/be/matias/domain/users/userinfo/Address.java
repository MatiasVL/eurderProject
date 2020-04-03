package be.matias.domain.users.userinfo;

public class Address {
    private String street;
    private String housenumber;
    private String postalCode;
    private String city;


    public Address(String street, String housenumber, String postalCode, String city) {
        this.street = street;
        this.housenumber = housenumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public String getHousenumber() {
        return housenumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getCity() {
        return city;
    }
}
