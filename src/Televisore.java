public class Televisore extends Prodotto {
    private float size;
    private boolean smart;
    private Schermo display;

    public Televisore(String name, String brand, float price, float iva, float size, boolean smart){
        super(name, brand, price, iva);
        this.size = size;
        this.smart = smart;
    }

    public float getSize(){
        return this.size;
    }

    public void setSize(float size){
        this.size = size;
    }

    public boolean getSmart(){
        return this.smart;
    }

    public void setSmart(boolean smart){
        this.smart = smart;
    }

    public float getDiscountTelevision(){
        return super.getPrice() - (super.getPrice() * 10 / 100);
    }
}
