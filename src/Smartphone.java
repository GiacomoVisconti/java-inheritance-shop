import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    protected long codiceIMEI;
    protected int memory;

    Smartphone(String name, String description, BigDecimal price, BigDecimal iva, long codiceIMEI, int memory){
        super(name, description, price, iva);
        this.codiceIMEI = codiceIMEI;
        this.memory = memory;
    }

    public long getIMEI(){
        return this.codiceIMEI;
    }

    public int getMemory(){
        return this.memory;
    }

    public void setIMEI(long code){
        this.codiceIMEI =  code;
    }

    public void setMemory(int memory){
        this.memory = memory;
    }

    @Override
    public String extendedName(){
        
        return String.format("Hai inserito al carrello lo smartphone: %d-%s", getCode(),getName().replace(" ", "-"));
    }
}
