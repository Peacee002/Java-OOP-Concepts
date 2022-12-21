package okul;

public class Student extends Person {
    public Integer studentNumber;
    private Integer averageMark;
    public Professor professor;

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Student(String name, String phoneNumber, String emailAddress, Integer money,Integer studentNumber, Address address) {
        super(name, phoneNumber, emailAddress, money, address);
    }

    public Integer getAverageMark() {
        return this.averageMark;
    }

    public void setAverageMark(Integer averageMark) {
        this.averageMark = averageMark;
    }


    public boolean isEligibleToEnroll(String ask){
    if(ask.startsWith("e")){
        return true;
    }return false;

    }
    public Integer getSeminarsTaken(){
        if(getAverageMark()>50){
            return 3;
        }
        else{
            return 0;
        }
    }

    public void Student(){
        System.out.println(getName()+" öğrencisinin "+getSeminarsTaken() + " seminer hakkı vardır");
    }
}
