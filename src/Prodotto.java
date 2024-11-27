public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private float price;
    private float iva;

    public Prodotto(int code, String name, String brand, float price, float iva){
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

    public float getPrice(){
        return this.price;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public float getIva(){
        return this.iva;
    }

    public void setIva(float iva){
        this.iva = iva;
    }

    public String getPriceIva(){
        return "Il prezzo inclusa l'iva è di " + (this.price + (this.price / 100 * this.iva)) + "€";
    }
    
    public String getBasicPrice(){
        return "Il prezzo base esclusa l'iva è di " + this.price + "€";
    }

}
