package Tasks;

public class Student {
    private String İsim;
    private String Soyİsim;
    private Integer OkulNo;
    private Integer Sınıf;
    private Integer not1;
    private Integer not2;
    private Integer not3;


    //constructor
    public Student(String İsim, String Soyİsim){
        this.İsim = İsim;
        this.Soyİsim=Soyİsim ;

    }


    //getters

    public String getIsim() {
        return İsim;
    }
    public String getSoyİsim() {
        return Soyİsim;
    }

    public Integer getOkulNo() {
        return OkulNo;
    }

    public Integer getSınıf() {
        return Sınıf;
    }

    public Integer getNot1() {
        return not1;
    }

    public Integer getNot2() {
        return not2;
    }

    public Integer getNot3() {
        return not3;
    }

    //setters


    public void setOkulNo(Integer b) {
        this.OkulNo = b;
    }

    public void setSınıf(Integer c) {
        this.Sınıf = c;
    }

    public void setNot1(Integer q) {
        this.not1 = q;
    }

    public void setNot2(Integer s) {
        this.not2 = s;
    }

    public void setNot3(Integer y) {
        this.not3 = y;
    }
}
