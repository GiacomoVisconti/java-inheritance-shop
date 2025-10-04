import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Che tipo di Prodotto stai inserendo? Smartphone, Cuffie o Televisori?");

        String tipoProdotto = input.nextLine().toLowerCase().trim();

        if (tipoProdotto.equals("cuffie")) {
            Cuffie LogitechGpro = new Cuffie(
                "Logithec", 
                "Cuffie cuffiose", 
                new BigDecimal(120) , 
                new BigDecimal(0.22), 
                "nero", 
                false
            );
            System.out.println(LogitechGpro.extendedName());
            
            
        } else if (tipoProdotto.equals("smartphone")) {
            Smartphone Samsung = new Smartphone(
                "Samsung S 21", 
                "Telefono costoso e basta", 
                new BigDecimal(1200) , 
                new BigDecimal(0.22), 
                123456789456123123L, 
                128
            );
            System.out.println(Samsung.extendedName());

        } else if (tipoProdotto.equals("televisori")) {
                Televisori SamsungTV = new Televisori(
                    "Samsung S 21", 
                    "Telefono costoso e basta", 
                    new BigDecimal(890) , 
                    new BigDecimal(0.22), 
                    55, 
                    false
                );
                System.out.println(SamsungTV.extendedName());

        } else {
            System.out.println("tipo prodotto insesistente!");
        }
        
        input.close();
    }
}
