package Okul;

public class Professor extends Person {
    private Integer salary;
    protected Integer staffNumber;
    private Integer yearsOfService;
    public Integer numberOfClasses;

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
}
