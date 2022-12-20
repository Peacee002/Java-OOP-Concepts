package Okul;



public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Professor obj = new Professor("barış", "4353456", "barış@gmail", 150,
                new Address("sometin", "palmiye", "istanbul", "türkiye", 345554));
        Student obj2 = new Student("ahmet", "3245346", "ahmet@gmail", 200,
                new Address("sometin2", "özder", "rize", "türkiye", 34543));
        obj.setStudent(obj2);
        obj2.setProfessor(obj);
        Address address = obj.getAddress();
        System.out.println("isminiz: " + obj.getName() + " Nakitiniz : " + obj.getMoney());
        obj.purchaseParkingPass();
        address.validate();
        System.out.println(obj.getMoney() + " tl niz vardır");
        address.outputAsLabel();
        obj.professor();
        System.out.println("öğrenci derse katılabilir mi ?");
        System.out.println(obj2.isEligibleToEnroll("evet"));
        System.out.println("öğrencinin kaç semineri var");
        System.out.println(obj2.getSeminarsTaken()+" semineri vardır");
        System.out.println("trying something");
    }
}