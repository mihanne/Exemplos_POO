package questao1;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ContaPoupanca extends Conta{
    public void imprimeExtrato(){
        System.out.println("### Extrato da Conta ###");

        SimpleDateFormat sdf = new SimpleDateFormat
                ("dd/MM/YYYY HH:mm:ss");
        Date date = new Date();

        System.out.println("Saldo: " +this.getSaldo());
        System.out.println("Data: " +sdf.format(date));

    }
}
