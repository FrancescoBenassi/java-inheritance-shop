import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci numericamente quanti prodotti vuoi aggiungere al carrello");
        int shopQuantity = Integer.parseInt(input.nextLine());

        Prodotto[] cart = new Prodotto[shopQuantity];
        int cartLenght = cart.length;

        for (int i = 0; i < cartLenght; i++) {
            System.out.println(
                    "Inserisci 1 per aggiungere uno smartphone, inserisci 2 per aggiungere un televisore oppure inserisci 3 per aggiungere delle cuffie");
            int choiceUser = Integer.parseInt(input.nextLine());

            System.out.println("Inserisci il nome del prodotto");
            String pName = input.nextLine();
            System.out.println("Inserisci il brand del prodotto");
            String pBrand = input.nextLine();
            System.out.println("Inserisci il prezzo del prodotto");
            float pPrice = Integer.parseInt(input.nextLine());
            System.out.println("Inserisci l'iva del prodotto");
            float pIva = Integer.parseInt(input.nextLine());

            if (choiceUser == 1) {
                System.out.println("Inserisci il codice IMEI dello smartphone");
                int sImei = Integer.parseInt(input.nextLine());
                System.out.println("Inserisci la quantità di memoria dello smartphone");
                int sMemory = Integer.parseInt(input.nextLine());
                cart[i] = new Smartphone(pName, pBrand, pPrice, pIva, sImei, sMemory);
            } else if (choiceUser == 2) {
                System.out.println("Inserisci la dimensione del televisore");
                float tSize = Integer.parseInt(input.nextLine());
                System.out.println("Se il televisore è smart inserisci 'true' altrimenti inserisci 'false'");
                boolean tSmart = Boolean.parseBoolean(input.nextLine());
                cart[i] = new Televisore(pName, pBrand, pPrice, pIva, tSize, tSmart);
            } else if (choiceUser == 3) {
                System.out.println("Inserisci il colore delle cuffie");
                String hColor = input.nextLine();
                System.out.println("Se le cuffie sono wireless inserisci 'true' altrimenti inserisci 'false'");
                boolean hWireless = Boolean.parseBoolean(input.nextLine());
                cart[i] = new Cuffie(pName, pBrand, pPrice, pIva, hColor, hWireless);
            } else {
                System.out.println("Hai inserito in modo non corretto uno dei campi");
                i--;
            }
        }

        System.out.println("Prodotti nel carrello:");
        for (Prodotto prodotto : cart) {
            System.out.println(prodotto.getName());
        }

        input.close();

    }
}
