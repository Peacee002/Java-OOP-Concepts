package Tasks;
import java.util.Scanner;

public class Question5 {
    public static void main(String[] args) {
        /*
            //loop
            for(int i = 1; i>0;i++) {
            //input alma
            Scanner Number = new Scanner(System.in);
            Integer UserInput = Number.nextInt();
            //günleri sayılarla eşleştirme
                if(UserInput==1)
                    System.out.println("This is Sunday");
                else if(UserInput==2)
                    System.out.println("This is Monday");
                else if(UserInput==3)
                    System.out.println("This is Tuesday");
                else if(UserInput==4)
                    System.out.println("This is Wednesday");
                else if(UserInput==5)
                    System.out.println("This is Thursday");
                else if(UserInput==6)
                    System.out.println("This is Friday");
                else if(UserInput==7)
                    System.out.println("This is Saturday");
                else
                    System.out.println("Please choose a number between 1-7");

         */

        String[] Weeks = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        //input alma
        Scanner Number = new Scanner(System.in);
        Integer UserInput = Number.nextInt();
        //Loop
          System.out.println(Weeks[UserInput-1]);

         /*
        for (int i = 0; i <= Weeks.length; i++) {
            switch (i){
                case 1:
                    System.out.println(Weeks[0]);
            }

          */
        }
        }


