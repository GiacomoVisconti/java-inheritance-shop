import java.math.BigDecimal;

public class App {
    public static void main(String[] args) throws Exception {
        
        Smartphone Samsung = new Smartphone("Samsung S 21", 
        "Telefono costoso e basta", 
        new BigDecimal(1200) , 
        new BigDecimal(0.22), 
        123456789456123123L, 
        128);

        Televisori SamsungTV = new Televisori("Samsung S 21", 
        "Telefono costoso e basta", 
        new BigDecimal(1200) , 
        new BigDecimal(0.22), 
        55, 
        false);

        Cuffie LogitechGpro = new Cuffie("Logithec", 
        "Cuffie cuffiose", 
        new BigDecimal(120) , 
        new BigDecimal(0.22), 
        "nero", 
        false);

        System.out.println(Samsung.getCode());
        System.out.println(Samsung.getIMEI());
        System.out.println(Samsung.getDescription());
        System.out.println(Samsung.extendedName());
        System.out.println(Samsung.totalPrice());

        System.out.println(SamsungTV.getCode());
        System.out.println(SamsungTV.getPollici());
        System.out.println(SamsungTV.getIsSmart());
        System.out.println(SamsungTV.getDescription());
        System.out.println(SamsungTV.extendedName());
        System.out.println(SamsungTV.totalPrice());

        System.out.println(LogitechGpro.getCode());
        System.out.println(LogitechGpro.getColore());
        System.out.println(LogitechGpro.getIsWireless());
        System.out.println(LogitechGpro.getDescription());
        System.out.println(LogitechGpro.extendedName());
        System.out.println(LogitechGpro.totalPrice());
        



    }
}
