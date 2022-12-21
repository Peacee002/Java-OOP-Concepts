package Tasks;

public class Question9 {
    public static void main(String[] args)
        {


            Student myObj = new Student("barış","Köseoğlu");
            myObj.setNot1(100);
            myObj.setSınıf(7);
            myObj.setOkulNo(144);

            System.out.println("isim :" +myObj.getIsim());
            System.out.println("soyisim :"+myObj.getSoyİsim());
            System.out.println("Sınıf :"  + myObj.getSınıf());
            System.out.println("OkulNo :" + myObj.getOkulNo());
            System.out.println("Not :" + myObj.getNot1());


        }
}




