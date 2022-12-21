package Tasks;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.SortedSet;

public class Question6 {
    public static void main(String[] args) {
        ArrayList<Integer> List1 = new ArrayList<>();
        ArrayList<Integer> List2 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            Random rand = new Random();
            int rand_int = rand.nextInt(9);
            int rand_int2 = rand.nextInt(9);
            List1.add(rand_int);
            List2.add(rand_int2);
        }
        System.out.println(List1);
        System.out.println(List2);
        System.out.println("1. List1'i ikiden çıkar");
        System.out.println("2. List2'i birden çıkar");
        System.out.println("3. ikisini birleştir");
        //Input alma
        Scanner Number = new Scanner(System.in);
        String UserInput = Number.nextLine();
        if(UserInput.startsWith("1")) {
            List1.removeAll(List2);
            System.out.println("list 2 de eksik olanlar " + List1);
        }
            else if (UserInput.startsWith("2")) {
            List2.removeAll(List1);
            System.out.println("list 1 de eksik olanlar " + List2);
        }
            else if (UserInput.startsWith("3")) {
            List1.retainAll(List2);
            System.out.println("ikisinde de olanlar1" + List1);
        }

    }
}
