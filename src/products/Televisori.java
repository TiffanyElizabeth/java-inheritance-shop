package products;

public class Televisori extends Prodotto {
    private int size;
    private boolean isSmart;

    // constructor
    public Televisori(String name, String brand, double basePrice, double vat, int size, boolean isSmart) {
        super(name, brand, basePrice, vat);
        this.size = size;
        this.isSmart = isSmart;
    }

    // getters and setters
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean getIsSmart() {
        return this.isSmart;
    }

    public void setIsSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }

    @Override
    public String toString() {
        return String.format("Product %d - %s (%d inches) by %s", getCode(), getName(), getSize(), getBrand());
    }
}
