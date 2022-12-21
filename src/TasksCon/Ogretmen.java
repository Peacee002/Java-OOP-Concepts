package TasksCon;

public class Ogretmen extends Person {


    private String DersIsimleri;

    private String Bolumu;

    public Ogretmen(String name, String surname, Integer age, Integer id) {
        super(name, surname, age, id);
    }


    public String getBolumu() {
        return Bolumu;
    }

    public void setBolumu(String bolumu) {
        Bolumu = bolumu;
    }

    public String getDersIsimleri() {
        return DersIsimleri;
    }

    public void setDersIsimleri(String dersIsimleri) {
        DersIsimleri = dersIsimleri;
    }


    @Override
    public void print() {
        System.out.println("ismi :" +getName()+" "+"Soyismi :" +getSurname()+" "+"yaşı :" +getAge()+" "+"tc :" +getId()+" "+"Verdiği dersler :" +getDersIsimleri()+" "+"Bölümü :" +getBolumu());
    }

}
