package Okul;
import java.util.ArrayList;

public class Main {

    static public void printof(Person person){
        if(person instanceof Professor){
            System.out.println(person.getName());
            System.out.println(person.getEmailAddress());
            System.out.println(person.getPhoneNumber());
        }
        /*else if(person instanceof Student){
            System.out.println(person.getName());
            System.out.println(person.getEmailAddress());
            System.out.println(person.getPhoneNumber());
        }

         */

    }


    public static void main(String[] args) {

        //Kullanıcı girişi
        Professor Prof = new Professor("barış", "4353456", "barış@gmail", 150,
                new Address("sometin", "palmiye", "istanbul", "türkiye", 345554));


        Student stu2 = new Student("ahmet", "3245346", "ahmet@gmail", 200, 23242,
                new Address("sometin2", "özder", "rize", "türkiye", 34543));


        Student stu3 = new Student("Adem", "45623452", "adem@gmail", 200, 23242,
                new Address("sometin2", "özder", "rize", "türkiye", 34543));

        //Öğrenci ekleme
        ArrayList<Student> students = new ArrayList<>();
        students.add(stu2);
        students.add(stu3);

        //Öğretmen ve öğrenci atama
        Prof.setStudents(students);
        stu2.setProfessor(Prof);
        stu3.setProfessor(Prof);

        // adres atama
        Address address = Prof.getAddress();


        /*
        System.out.println("isminiz: " + Prof.getName() + " Nakitiniz : " + Prof.getMoney());
        obj.purchaseParkingPass();
        address.validate();
        System.out.println(Prof.getMoney() + " tl niz vardır");
        address.outputAsLabel();


        Prof.professor();
        stu2.Student();
        stu3.Student();

         */

        stu3.print();

        printof(stu2);

    }
}