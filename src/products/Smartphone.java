package products;

import java.util.Random;

public class Smartphone extends Prodotto {
    private String imei;
    private int memory;

    // constructor
    public Smartphone(String name, String brand, double basePrice, double vat, String imei, int memory) {
        super(name, brand, basePrice, vat);
        // this.imei = getRandomNumber(15);
        this.imei = imei;
        this.memory = memory;
    }

    // method to generate random 15-digit number for IMEI code COMMENTED BECAUSE
    // REALIZED WE DO NOT NEED TO GENERATE IMEI
    // private static Random rnd = new Random();

    // public static String getRandomNumber(int digCount) {
    // StringBuilder sb = new StringBuilder(digCount);
    // for (int i = 0; i < digCount; i++)
    // sb.append((char) ('0' + rnd.nextInt(10)));
    // return sb.toString();
    // } //
    // https://stackoverflow.com/questions/3709521/how-do-i-generate-a-random-n-digit-integer-in-java-using-the-biginteger-class

    // getters and setters
    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return String.format("Product %d - %s by %s with %dgb of memory", getCode(), getName(), getBrand(),
                getMemory());
    }
}
