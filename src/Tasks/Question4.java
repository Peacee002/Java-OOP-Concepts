package Tasks;
import java.util.Random;
import java.util.Scanner;
public class Question4 {
    public static void main(String[] args) {
        /*
        //loop başlangıç
        for (int i = 2; i>-1 ;i--) {
        //User'a soru sorma
        System.out.println("Guess a number between 1-10");
        //Input alma
        Scanner Number = new Scanner(System.in);
        Integer UserGuess = Number.nextInt();
        System.out.println("Your Guess is: " + UserGuess);
        //Random sayı üretme
        Random rand = new Random();
        int rand_int = rand.nextInt(10);
        System.out.println("Random Integer: " + rand_int);
        //if else kısmı
        if (rand_int == UserGuess) {
            System.out.println("you won!!");
            break;
        }
        else {
            System.out.println("Number of tries left: " + i);
        }
    }
         */
        /*
    int i = 2;
        do {
            //User'a soru sorma
            System.out.println("Guess a number between 1-10");
            //Input alma
            Scanner Number = new Scanner(System.in);
            Integer UserGuess = Number.nextInt();
            System.out.println("Your Guess is: " + UserGuess);
            //Random sayı üretme
            Random rand = new Random();
            int rand_int = rand.nextInt(10);
            System.out.println("Random Integer: " + rand_int);
            //if else kısmı
            if (rand_int == UserGuess) {
                System.out.println("you won!!");
                break;
            }
            else {
                System.out.println("Number of tries left: " + i);
            }
            i--;
        }
        while (i>-1);

         */

        //Random sayı üretme
        Random rand = new Random();
        int rand_int = rand.nextInt(10);

        int i = 2;
        while (i>-1) {
            //User'a soru sorma
            System.out.println("Guess a number between 1-10");
            //Input alma
            Scanner Number = new Scanner(System.in);
            Integer UserGuess = Number.nextInt();
            System.out.println("Your Guess is: " + UserGuess);
            //if else kısmı
            if (rand_int == UserGuess) {
                System.out.println("you won!!");
                break;
            }
            else {
                System.out.println("Number of tries left: " + i);
            }
            i--;
        }
    }
}
