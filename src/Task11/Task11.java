import java.security.cert.CertificateNotYetValidException;

public class Task11 {

        public void validate (Integer x) {
            if(x<0){
                throw new ArithmeticException("girilen sayı negatiftir");
            }
            else {
                System.out.println(x);
            }

    }

}
