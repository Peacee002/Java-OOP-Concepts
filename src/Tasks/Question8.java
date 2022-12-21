package Tasks;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Collections;
public class Question8 {
    public static void main(String[] args) {
        HashMap<String, Double> Students = new HashMap<String, Double>();
        for(int i = 0; i<=4;i++) {
            //input alma
            Scanner in = new Scanner(System.in);

            System.out.println("Öğrenci İsim: ");
        String no = in.nextLine();
            System.out.println("Öğrenci not: ");
        Double not = in.nextDouble();
            Students.put(no,not);
        }
        System.out.println(Students);
        Double min = Collections.min(Students.values());
        Double max = Collections.max(Students.values());
        System.out.println("en az alan: " + min);
        System.out.println("en çok alan: " + max);

        System.out.println(Students);
        System.out.println("Hangi öğrenciyi silmek istersiniz :"   );

        //input alma
        Scanner Number = new Scanner(System.in);
        String UserInput = Number.nextLine();
        Students.remove(UserInput);
        System.out.println(Students);



    }
}
