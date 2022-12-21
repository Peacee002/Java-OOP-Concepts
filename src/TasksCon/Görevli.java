package TasksCon;

public class Görevli extends Person {

    private String Görevler;

    public Görevli(String name, String surname, Integer age, Integer id) {
        super(name, surname, age, id);
    }


    public String getGörevler() {
        return Görevler;
    }

    public void setGörevler(String Görevler) {
        this.Görevler = Görevler;
    }

    @Override
    public void print() {
        System.out.println("ismi :" +getName()+" "+"Soyismi :" +getSurname()+" "+"yaşı :" +getAge()+" "+"tc :" +getId()+" "+"Çalıştığı yer :" +getGörevler());
    }
}
