package Tasks;
import java.util.ArrayList;
import java.util.Collections;

public class ListMethodExercises {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        //methods
        cars.get(0);
        cars.set(0,"aaa");
        cars.remove(1);
        //cars.remove()
        Collections.sort(cars);

        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.isEmpty());
        System.out.println(cars.contains("volvo"));
        System.out.println(cars.indexOf("vol"));
        System.out.println(cars.indexOf("Mazda")); //Kelimeyi harfi harfine yazman lazım Sadece harf aramıyor


    }
}
