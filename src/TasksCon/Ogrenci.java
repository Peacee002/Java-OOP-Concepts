package TasksCon;

public class Ogrenci extends Person {

    private String ortalama;

    public Ogrenci(String name, String surname, Integer age, Integer id) {
        super(name, surname, age, id);
    }


    public String getOrtalama() {
        return ortalama;
    }

    public void setOrtalama(String ortalama) {
        this.ortalama = ortalama;
    }



    @Override
    public void print() {
        System.out.println("ismi :" +getName()+" "+"Soyismi :" +getSurname()+" "+"yaşı :" +getAge()+" "+"tc :" +getId()+" "+"Yıl Sonu Ortalaması :" +getOrtalama());
    }
}
