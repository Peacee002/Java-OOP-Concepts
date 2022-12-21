package Tasks;
import jdk.dynalink.beans.StaticClass;
import java.util.Scanner;
public class ClassExercises {

        static void SpeedTest(int Speed){
            if(Speed<60){
                System.out.println("Not over speed limit");
            }
            else{
                System.out.println("Over speed limit");
            }



        }
    public static void main(String[] args) {
            SpeedTest(91);
    }
}
