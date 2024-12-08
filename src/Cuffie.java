public class Cuffie extends Prodotto {
    private String color;
    private boolean wireless;

    public Cuffie(String name, String brand, float price, float iva, String color, boolean wireless, boolean discount){
       super(name, brand, price, iva, discount);
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

    @Override
    public float getDiscountPrice() {
        if (super.getDiscount() && !this.wireless) {
            return super.getPrice() - (super.getPrice() * 7 / 100);
        } else if (super.getDiscount()) {
            return super.getDiscountPrice();
        } else {
            return super.getBasicPrice();
        }
    }
}
