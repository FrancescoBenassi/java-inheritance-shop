import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private float price;
    private float iva;
    private boolean discount;
    private Materiali[] materials;

    public Prodotto(String name, String brand, float price, float iva, boolean discount) {
        Random rand = new Random();
        this.code = rand.nextInt(999999);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;
        this.discount = discount;
    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public float getPrice() {
        return this.price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public float getIva() {
        return this.iva / 100;
    }

    public void setIva(float iva) {
        this.iva = iva;
    }

    public float getBasicPrice() {
        return this.price;
    }

    public boolean getDiscount() {
        return this.discount;
    }

    public void setDiscount(boolean discount) {
        this.discount = discount;
    }

    public float getPriceIva() {
        return this.price = this.price + (this.price / 100 * this.iva);
    }

    public float getDiscountPrice() {
        if (discount) {
            return this.price - (this.price * 2 / 100);
        } else {
            return this.price;
        }
    }

}
