public class Televisore extends Prodotto {
    private float size;
    private boolean smart;
    private Schermo display;

    public Televisore(String name, String brand, float price, float iva, float size, boolean smart, boolean discount) {
        super(name, brand, price, iva, discount);
        this.size = size;
        this.smart = smart;
    }

    public float getSize() {
        return this.size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public boolean getSmart() {
        return this.smart;
    }

    public void setSmart(boolean smart) {
        this.smart = smart;
    }

    @Override
    public float getDiscountPrice() {
        if (super.getDiscount() && !this.smart) {
            return super.getPrice() - (super.getPrice() * 10 / 100);
        } else if (super.getDiscount()) {
            return super.getDiscountPrice();
        } else {
            return super.getBasicPrice();
        }
    }
}
