package products;

import java.util.Scanner;

public class Carrello {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("How many products would you like to add to your cart?");
        int numberOfProducts = in.nextInt();
        in.nextLine();

        Prodotto[] productsInCart = new Prodotto[numberOfProducts];

        for (int i = 0; i < productsInCart.length; i++) {

            System.out.println("Product name: ");
            String name = in.nextLine();

            System.out.println("Brand: ");
            String brand = in.nextLine();

            System.out.println("Base price: ");
            double basePrice = in.nextDouble();

            System.out.println("VAT: ");
            double vat = in.nextDouble();
            in.nextLine();

            System.out.println("Which category does the product belong to: cuffie, smartphone, televisori?");
            String productCategory = in.nextLine().toLowerCase();

            switch (productCategory) {
                case "cuffie":
                    System.out.println("Color: ");
                    String color = in.nextLine();

                    System.out.println("Are they wireless? Write TRUE if yes or FALSE if no.");
                    boolean isWireless = Boolean.parseBoolean(in.nextLine());

                    Cuffie headphones = new Cuffie(name, brand, basePrice, vat, color, isWireless);

                    productsInCart[i] = headphones;

                    break;

                case "smartphone":
                    System.out.println("IMEI: ");
                    String imei = in.nextLine();

                    System.out.println("Memory (in GB): ");
                    int memory = Integer.parseInt(in.nextLine());

                    Smartphone phone = new Smartphone(name, brand, basePrice, vat, imei, memory);

                    productsInCart[i] = phone;

                    break;

                case "televisori":

                    System.out.println("Size (in inches): ");
                    int size = Integer.parseInt(in.nextLine());

                    System.out.println("Is it a smart TV? Write TRUE if yes or FALSE if no.");
                    boolean isSmart = Boolean.parseBoolean(in.nextLine());

                    Televisori tv = new Televisori(name, brand, basePrice, vat, size, isSmart);

                    productsInCart[i] = tv;

                    break;

                default:
                    System.out.println("Invalid product category");
                    break;
            }

        }
        System.out.println("Your cart:");

        for (int i = 0; i < productsInCart.length; i++) {
            if (productsInCart[i] != null) {
                System.out.println(productsInCart[i]);
            }
        }

        in.close();
    }
}