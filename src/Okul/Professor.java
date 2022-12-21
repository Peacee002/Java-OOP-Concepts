package Okul;
import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Person {
    private Integer salary;
    protected Integer staffNumber;
    private Integer yearsOfService;
    public Integer numberOfClasses;



    public ArrayList<Student> students = new ArrayList<>();

    public void setStudents(ArrayList<Student> students) {
        this.students = students;
    }

    public Professor(String name, String phoneNumber, String emailAddress, Integer money, Address address) {
        super(name, phoneNumber, emailAddress, money, address);
    }




    public Integer getYearsOfService() {
        return this.yearsOfService;
    }

    public void setYearsOfService(Integer yearsOfService) {
        this.yearsOfService = yearsOfService;
    }

    public Integer getSalary() {
        return this.salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    public void professor(){

        //System.out.println(Professor.);

        for(Student s : students) {
            System.out.println(s.getName() + " öğrencisinin ortalama notunu giriniz ;");
            Scanner sc=new Scanner(System.in);
            Scanner sc1=new Scanner(System.in);
            Integer UserInput = sc.nextInt();
            s.setAverageMark(UserInput);


            System.out.println(s.getName() + " öğrenci derse katılabilir mi ?");
            String UserInput2 = sc1.nextLine();
            System.out.println(s.isEligibleToEnroll(UserInput2));
        }
    }

    @Override
    public void print() {
        System.out.println(getName());
        System.out.println(getEmailAddress());
        System.out.println(getPhoneNumber());
    }
}
