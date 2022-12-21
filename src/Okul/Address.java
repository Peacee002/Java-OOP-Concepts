package Okul;

public class Address {
    private String street;
    private String city;
    private String state;
    private Integer postalCode;
    private String country;
    public Integer ticket = 0;



    public Address(String state, String street, String city, String country, Integer postalCode) {
        this.state = state;
        this.street = street;
        this.city = city;
        this.country = country;
        this.postalCode = postalCode;
    }

    public String getCountry() {
        return this.country;
    }

    public Integer getPostalCode() {
        return this.postalCode;
    }

    public String getState() {
        return this.state;
    }

    public String getCity() {
        return this.city;
    }

    public String getStreet() {
        return this.street;
    }

    public boolean validate() {
        if(getStreet()!= null){
            return true;
        }
    return false;
    }

    public void outputAsLabel() {
        if (this.validate()) {
            System.out.println(ticket + " biletiniz vardır");
        } else {
            System.out.println("biletiniz yoktur");
        }
    }
}
