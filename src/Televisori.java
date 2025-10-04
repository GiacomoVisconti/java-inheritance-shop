import java.math.BigDecimal;

public class Televisori extends Prodotto {
    protected int pollici;
    protected boolean isSmart;

    Televisori(String name, String description, BigDecimal price, BigDecimal iva, int pollici, boolean isSmart){
        super(name, description, price, iva);
        this.pollici = pollici;
        this.isSmart = isSmart;
    }

    public int getPollici(){
        return  pollici;
    }

    public String getIsSmart(){;

        if (isSmart) {
            String result = "La tv è Smart";
            return result;
        } else {
            String result = "La tv non è Smart";
            return result;
        }
    }

    public void setPollici(int pollici){
        this.pollici = pollici;
    }

    public void setIsSmart(boolean isSmart){
        this.isSmart = isSmart;
    }

    @Override
    public String extendedName(){
        
        return String.format("Hai inserito al carrello il televisore: %d-%s", getCode(), getName().replace(" ", "-"));
        }
}
