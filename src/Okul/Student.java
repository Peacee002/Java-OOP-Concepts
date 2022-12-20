package Okul;

public class Student extends Person {
    public Integer studentNumber = 3425346;
    private Integer averageMark;

    public Student(String name, String phoneNumber, String emailAddress, Integer money, Address address) {
        super(name, phoneNumber, emailAddress, money, address);
    }

    public Integer getAverageMark() {
        return this.averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }
}
