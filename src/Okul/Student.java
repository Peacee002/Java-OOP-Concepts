package Okul;

public class Student extends Person {
    public Integer studentNumber = 3425346;
    private Integer averageMark;
    Integer seminars = 0;
    public Professor professor;

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student(String name, String phoneNumber, String emailAddress, Integer money, Address address) {
        super(name, phoneNumber, emailAddress, money, address);
    }

    public Integer getAverageMark() {
        return this.averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }

    public boolean isEligibleToEnroll(String ask){
    if(ask.startsWith("e"));
    return true;
    }
    public Integer getSeminarsTaken(){
        if(getAverageMark()>50)
            seminars = seminars +3;
        return seminars;
    }
}
