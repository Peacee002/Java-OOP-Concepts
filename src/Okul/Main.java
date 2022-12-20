package Okul;

import java.io.PrintStream;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Professor obj = new Professor("barış", "4353456", "barış@gmail", 150,
                new Address("sometin", "palmiye", "istanbul", "türkiye", 345554));
        Address address = obj.getAddress();
        new Student("ahmet", "3245346", "ahmet@gmail", 200,
                new Address("sometin2", "özder", "rize", "türkiye", 34543));
        PrintStream var10000 = System.out;
        String var10001 = obj.getName();
        var10000.println("isminiz: " + var10001 + " Nakitiniz :" + obj.getMoney());
        obj.purchaseParkingPass();
        address.validate();
        System.out.println(obj.getMoney() + " tl niz vardır");
        address.outputAsLabel();
    }
}