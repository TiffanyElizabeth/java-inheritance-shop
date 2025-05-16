package products;

public class Main {
    public static void main(String[] args) {
        Prodotto blueJacket = new Prodotto("blue jacket", "patagonia", 229.2, 0.24);

        System.out.println(blueJacket);

        System.out.println(blueJacket.getBasePrice());
        System.out.println(blueJacket.getFinalPrice());
        System.out.println(blueJacket.getCode());
        System.out.println(blueJacket.getCodeName());

        System.out.println(blueJacket.isAvailable());
        blueJacket.markAsAvailable();
        System.out.println(blueJacket.isAvailable());

        Prodotto blackJeans = new Prodotto(900042, "black jeans", "j brand", 200, 0.22);

        System.out.println(blackJeans.getBrand());
        System.out.println(blackJeans.getCode());
        System.out.println(blackJeans.getCodeName());

        // auto‑generated product code:
        Prodotto p1 = new Prodotto("X200", "Acme", 49.99, 0.22);
        System.out.println(p1);

        // shop‑defined product code
        Prodotto p2 = new Prodotto(42, "X200", "Acme", 49.99, 0.22);
        System.out.println(p2);

        // cuffie
        Cuffie c = new Cuffie("QuietComfort 35", "Bose", 299.00, 0.22, "Black", true);
        System.out.println(c);

        // smartphone
        Smartphone talk = new Smartphone("Phone Example", "Samsung", 400, 0.22, 365);
        System.out.println(talk);
    }
}
