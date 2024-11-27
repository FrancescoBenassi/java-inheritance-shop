public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private double price;
    private double iva;

    public Prodotto(int code, String name, String brand, double price, double iva){
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
    }

    public int getCode(){
        return this.code;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getBrand(){
        return this.brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getIva(){
        return this.iva;
    }

    public void setIva(double iva){
        this.iva = iva;
    }

}
