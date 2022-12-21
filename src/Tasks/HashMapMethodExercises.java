package Tasks;
import java.util.HashMap;
public class HashMapMethodExercises {
    public static void main(String[] args) {


        // Create a HashMap object called capitalCities
        HashMap<String, String> capitalCities = new HashMap<String, String>();
        HashMap<String, String> capitalCities1 = new HashMap<String, String>();

        // Add keys and values (Country, City)
        capitalCities.put("England", "London");
        capitalCities1.put("Germany", "Berlin");
        capitalCities1.put("Norway", "Oslo");
        capitalCities.put("USA", "Washington DC");

        System.out.println(capitalCities);
        System.out.println(capitalCities.get("England"));
        System.out.println(capitalCities.size());

        System.out.println(capitalCities.get(0));
        System.out.println(capitalCities.values());
        System.out.println(capitalCities.clone());
        capitalCities1.putAll(capitalCities);
        System.out.println(capitalCities1);
        capitalCities.putIfAbsent("Engladdnd","Lddondon");
        capitalCities.remove("");

        System.out.println(capitalCities);



    }
}
