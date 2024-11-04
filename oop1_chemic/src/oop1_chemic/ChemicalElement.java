package oop1_chemic;

/**
 *
 * @author Deniss
 */
public class ChemicalElement {
    private String element;
    private int number;
    private String symbol;
    private String weight;
    private String boil;
    private String melt;
    private String density;
    private String vapour;
    private String fusion;
    
    
    public ChemicalElement(String element, int number, String symbol, String weight, String boil, String melt,String density, String vapour, String fusion) {
        this.element = element;
        this.number = number;
        this.symbol = symbol;
        this.weight = weight;
        this.boil = boil;
        this.melt = melt;
        this.density = density;
        this.vapour = vapour;
        this.fusion = fusion;
    }
    
    
    public ChemicalElement(String element, int number, String symbol, String weight, String boil, String melt,String density, String vapour) {
        this.element = element;
        this.number = number;
        this.symbol = symbol;
        this.weight = weight;
        this.boil = boil;
        this.melt = melt;
        this.density = density;
        this.vapour = vapour;}    
    
    public ChemicalElement(String element, int number, String symbol, String weight) {
        this.element = element;
        this.number = number;
        this.symbol = symbol;
        this.weight = weight;
    }
    @Override
    public String toString() {
        return "ChemicalElement{" + "element=" + element + ", number=" + number + ", symbol=" + symbol + ", weight=" + weight + ", boil=" + boil + ", melt=" + melt + ", density=" + density + ", vapour=" + vapour + ", fusion=" + fusion + '}';
    }

    public String getElement() {
        return element;
    }

    public void setElement(String element) {
        this.element = element;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        if (number>0)
        this.number = number;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        
        this.weight = weight;
    }

    public String getBoil() {
        return boil;
    }

    public void setBoil(String boil) {
        
        this.boil = boil;
    }

    public String getMelt() {
        return melt;
    }

    public void setMelt(String melt) {
       
        this.melt = melt;
    }

    public String getDensity() {
        return density;
    }

    public void setDensity(String densityVapour) {
       
        this.density = densityVapour;
    }

    public String getVapour() {
        return vapour;
    }

    public void setVapour(String densityVapour) {
     
        this.vapour = densityVapour;
    }    
    
    public String getFusion() {
        return fusion;
    }

    public void setFusion(String fusion) {
      
        this.fusion = fusion;
    }
    
}
