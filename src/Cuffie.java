public class Cuffie extends Prodotto {
    private String color;
    private String wireless;

    public Cuffie(int code, String name, String brand, float price, float iva, String color, String wireless){
       super(code, name, brand, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public String getWireless(){
        return this.wireless;
    }

    public void setWireless(String wireless){
        this.wireless = wireless;
    }
}
