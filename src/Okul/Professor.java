package Okul;
import java.util.Scanner;

public class Professor extends Person {
    private Integer salary;
    protected Integer staffNumber;
    private Integer yearsOfService;
    public Integer numberOfClasses;
    public Student student;

    public void setStudent(Student student) {
        this.student = student;
    }

    public Professor(String name, String phoneNumber, String emailAddress, Integer money, Address address) {
        super(name, phoneNumber, emailAddress, money, address);
    }

    public void professor(){
        Scanner sc=new Scanner(System.in);
        System.out.println(student.getName()+" öğrencisinin ortalama notunu giriniz ;");
        Integer UserInput = sc.nextInt();
        this.student.setAverageMark(UserInput);

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
}
