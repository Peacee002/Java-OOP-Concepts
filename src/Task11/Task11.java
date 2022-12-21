package Task11;
public class Task11 {
        static void validate (int ask) throws NotValidException {
            if(ask<0){
                throw new NotValidException("girilen sayı negatif");
            }
            else {
                System.out.println(ask);
            }
    }
    public static void main(String[] args) {

            try{
                validate(-1);
            }
            catch (NotValidException exception)
            {
                System.out.println("hata bulundu");
                System.out.println("hata :"+ exception);
            }
            finally {
                System.out.println("işlem tamamlandı");
            }
    }

}
