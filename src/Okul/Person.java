package Okul;

import java.util.Scanner;

class Person {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private Address Address;
    private Integer money;
    Scanner Number;

    public String getEmailAddress() {
        return this.emailAddress;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public Person(String name, String phoneNumber, String emailAddress, Integer money, Address address) {
        this.Number = new Scanner(System.in);
        this.money = money;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.emailAddress = emailAddress;
        this.Address = address;
    }

    public Integer getMoney() {
        return this.money;
    }

    public Address getAddress() {
        return this.Address;
    }

    public void purchaseParkingPass() {
        System.out.println("Bilet almak ister misiniz (bir bilet 50 tl) ?");
        String UserInput = this.Number.nextLine();
        if (UserInput.startsWith("e")) {
            Address var2 = this.Address;
            var2.ticket = var2.ticket + this.Address.ticket + 1;
        }

        this.money = this.money - 50;
    }
}