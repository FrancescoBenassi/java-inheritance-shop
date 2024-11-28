public class Cuffie extends Prodotto {
    private String color;
    private boolean wireless;

    public Cuffie(String name, String brand, float price, float iva, String color, boolean wireless){
       super(name, brand, price, iva);
        this.color = color;
        this.wireless = wireless;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public boolean getWireless(){
        return this.wireless;
    }

    public void setWireless(boolean wireless){
        this.wireless = wireless;
    }

    public float getDiscountHeadphones(){
        return super.getPrice() - (super.getPrice() * 7 / 100);
    }
}
