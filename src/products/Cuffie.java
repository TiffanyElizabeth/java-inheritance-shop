package products;

public class Cuffie extends Prodotto {
    private String color;
    private boolean isWireless;

    // constructor
    public Cuffie(String name, String brand, double basePrice, double vat, String color, boolean isWireless) {
        super(name, brand, basePrice, vat);
        this.color = color;
        this.isWireless = isWireless;
    }

    // getters and setters
    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getIsWireless() {
        return this.isWireless;
    }

    public void setIsWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public String toString() {
        return String.format("Product %d - %s in %s by %s", getCode(), getName(), color, getBrand());
    }

}
