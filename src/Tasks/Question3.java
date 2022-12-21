package Tasks;

public class Question3 {

    static void Split(String Splitted,String Splitter){
        String[] Names = Splitted.split(Splitter);
        System.out.println(Names.length);
        for (int i = 0; i < Names.length;i++)
            System.out.println("Names " + i + ":" + Names[i]);
    }

    public static void main(String[] args) {
        String a =  "Jaide,John,Melisa,Joe,Tyler";
        Split(a,",");

    }
}
