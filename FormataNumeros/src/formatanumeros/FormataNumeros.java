package formatanumeros;
import java.text.NumberFormat;
public class FormataNumeros {

    public static void main(String[] args) {
        System.out.println(NumberFormat.getCurrencyInstance().format(12345678.90));
        double n[]={523.34, 54344.23 ,95845.223 ,1084.895};

        NumberFormat z = NumberFormat.getCurrencyInstance();

       for (int a = 0; a < n.length; a++) {

           if(a != 0)

                System.out.print(", ");

                System.out.print(z.format(n[a]));
            }
            System.out.println();
    }
    
}
