public class Smartphone extends Prodotto {
    private int codeImei;
    private int memory;
    private Processore processor;
    private Schermo display;

    public Smartphone(String name, String brand, float price, float iva, int codeImei, int memory) {
        super(name, brand, price, iva);
        this.codeImei = codeImei;
        this.memory = memory;
    }

    public int getCodeImei() {
        return this.codeImei;
    }

    public void setCodeImei(int codeImei) {
        this.codeImei = codeImei;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public float getDiscountSmartphone() {
        return super.getPrice() - (super.getPrice() * 5 / 100);
    }
}
