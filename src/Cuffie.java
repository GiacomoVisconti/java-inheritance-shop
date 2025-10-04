import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    protected String colore;
    protected boolean IsWireless;

    Cuffie(String name, String description, BigDecimal price, BigDecimal iva, String colore, boolean IsWireless){
        super(name, description, price, iva);
        this.colore = colore;
        this.IsWireless = IsWireless;
    }

    public String getColore(){
        return this.colore;
    }

    public String getIsWireless(){

        if (IsWireless) {
            return "Le cuffie sono Wireless";
        } else {
            return "Le cuffie non sono Wireless";
        }
    }

    public void setColore(String colore){
        this.colore = colore;
    }

    public void setIsWireless(boolean IsWireless){
        this.IsWireless = IsWireless;
    }

    @Override
    public String extendedName(){
        
        return String.format("Hai inserito al carrello le cuffie: %d-%s", getCode(), getName().replace(" ", "-"));
    }
}
