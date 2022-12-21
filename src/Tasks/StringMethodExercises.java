package Tasks;
import java.util.Scanner;
public class StringMethodExercises {
    public static void main(String[] args) {
        /*
        String name = "Peace";
        String surname = "Pe";

        System.out.println(name.length());
        System.out.println(name.charAt(1));
        System.out.println(name.toLowerCase());
        System.out.println(name.contains("Peace"));
        System.out.println(name.indexOf("a"));
        System.out.println(name.substring(2, 5));
        System.out.println(surname.concat(name));
        System.out.println(name.equals(surname));
        System.out.println(name.compareTo(surname));
        System.out.println(name.endsWith("ce"));
        System.out.println(name.startsWith("Pe"));
        System.out.println(name.replace("e", "l"));

         */
        //Input alma
        Scanner Number = new Scanner(System.in);
        String UserGuess = Number.nextLine();
        String UserGuess2 = Number.nextLine();

        for (int i = 0; i < UserGuess2.length(); i++) {
            if
            (UserGuess.contains(String.valueOf(UserGuess2.charAt(i)))) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }

        }
    }
}
