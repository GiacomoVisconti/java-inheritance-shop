import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Smartphone Samsung = new Smartphone("Samsung S 21", 
        "Telefono costoso e basta", 
        new BigDecimal(1200) , 
        new BigDecimal(0.22), 
        123456789456123123L, 
        128);

        System.out.println(Samsung.getCode());
        System.out.println(Samsung.getIMEI());
        System.out.println(Samsung.getDescription());
        System.out.println(Samsung.extendedName());
        System.out.println(Samsung.totalPrice());

    }
}
