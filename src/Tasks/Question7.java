package Tasks;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args){

        String test = "test";
        //Input alma
        Scanner Number = new Scanner(System.in);
        String UserInput = Number.nextLine();

        char[] Reverse = UserInput.toCharArray();

        for (int i = Reverse.length -1; i >= 0 ; i--){
            System.out.print(Reverse[i]);
        }
    }
}
