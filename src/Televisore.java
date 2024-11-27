public class Televisore extends Prodotto {
    private int size;
    private String smart;

    public Televisore(int code, String name, String brand, float price, float iva, int size, String smart){
        super(code, name, brand, price, iva);
        this.size = size;
        this.smart = smart;
    }

    public int getSize(){
        return this.size;
    }

    public void setSize(int size){
        this.size = size;
    }

    public String getSmart(){
        return this.smart;
    }

    public void setSmart(String smart){
        this.smart = smart;
    }
}
