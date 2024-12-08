import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Si chiede all'utente di inserire quanti prodotti vuole aggiungere al carrello
        // e si chiede anche se possiede la tessera fedeltà
        System.out.println("Inserisci numericamente quanti prodotti vuoi aggiungere al carrello");
        int shopQuantity = Integer.parseInt(input.nextLine());
        System.out.println("Inserisci 'true' se possiedi la tessera fedeltà");
        boolean pDiscount = Boolean.parseBoolean(input.nextLine());

        // Creazione del carrello dove la lunghezza dell'Array dipende dal numero
        // inserito dall'utente quando gli viene chiesto quanti prodotti vuole
        // aggiungere al carrello
        Prodotto[] cart = new Prodotto[shopQuantity];
        int cartLenght = cart.length;

        // Creazione della variabile dove salverà la somma dei vari prezzi del carrello
        float sum = 0;

        for (int i = 0; i < cartLenght; i++) {

            // Si chiede all'utente quale prodotto vuole acquistare
            System.out.println(
                    "Inserisci 1 per aggiungere uno smartphone, inserisci 2 per aggiungere un televisore oppure inserisci 3 per aggiungere delle cuffie");
            int choiceUser = Integer.parseInt(input.nextLine());
            float sumTemponary = 0;

            // Se il numero per selezionare è valido si parte con la compilazione dei valori
            // altrimenti ricomincia il ciclo fino a quando non inserirà correttamente il
            // numero della selezione del prodotto
            if (choiceUser == 1 || choiceUser == 2 || choiceUser == 3) {
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
                    System.out.println("Inserisci la quantità di memoria in GB dello smartphone");
                    int sMemory = Integer.parseInt(input.nextLine());
                    Smartphone smartphone = new Smartphone(pName, pBrand, pPrice, pIva, sImei, sMemory, pDiscount);
                    sumTemponary = smartphone.getDiscountPrice();
                    sumTemponary = sumTemponary + (sumTemponary * smartphone.getIva());
                    sum += sumTemponary;
                    // if (pDiscount && sMemory <= 32) {
                    // sumTemponary = smartphone.getDiscountPrice();
                    // sumTemponary = sumTemponary + (sumTemponary * smartphone.getIva());
                    // sum += sumTemponary;
                    // } else if (pDiscount) {
                    // sumTemponary = smartphone.getDiscountPrice();
                    // sumTemponary = sumTemponary + (sumTemponary * smartphone.getIva());
                    // sum += sumTemponary;
                    // } else {
                    // sumTemponary = smartphone.getPriceIva();
                    // sumTemponary = sumTemponary + (sumTemponary * smartphone.getIva());
                    // sum += sumTemponary;
                    // }
                    cart[i] = smartphone;
                } else if (choiceUser == 2) {
                    System.out.println("Inserisci i pollici del televisore");
                    float tSize = Integer.parseInt(input.nextLine());
                    System.out.println("Se il televisore è smart inserisci 'true' altrimenti inserisci 'false'");
                    boolean tSmart = Boolean.parseBoolean(input.nextLine());
                    Televisore television = new Televisore(pName, pBrand, pPrice, pIva, tSize, tSmart, pDiscount);
                    sumTemponary = television.getDiscountPrice();
                    sumTemponary = sumTemponary + (sumTemponary * television.getIva());
                    sum += sumTemponary;
                    // if (pDiscount && !tSmart) {
                    // sumTemponary = television.getDiscountTelevision();
                    // sumTemponary = sumTemponary + (sumTemponary * television.getIva());
                    // System.out.println(sumTemponary);
                    // sum += sumTemponary;
                    // } else if (pDiscount) {
                    // sumTemponary = television.getDiscountPrice();
                    // sumTemponary = sumTemponary + (sumTemponary * television.getIva());
                    // sum += sumTemponary;
                    // } else {
                    // sumTemponary = television.getPriceIva();
                    // sumTemponary = sumTemponary + (sumTemponary * television.getIva());
                    // sum += sumTemponary;
                    // }
                    cart[i] = television;
                } else if (choiceUser == 3) {
                    System.out.println("Inserisci il colore delle cuffie");
                    String hColor = input.nextLine();
                    System.out.println("Se le cuffie sono wireless inserisci 'true' altrimenti inserisci 'false'");
                    boolean hWireless = Boolean.parseBoolean(input.nextLine());
                    Cuffie headphones = new Cuffie(pName, pBrand, pPrice, pIva, hColor, hWireless, pDiscount);
                    sumTemponary = headphones.getDiscountPrice();
                    sumTemponary = sumTemponary + (sumTemponary * headphones.getIva());
                    sum += sumTemponary;
                    // if (pDiscount && !hWireless) {
                    // sumTemponary = headphones.getDiscountHeadphones();
                    // sumTemponary = sumTemponary + (sumTemponary * headphones.getIva());
                    // sum += sumTemponary;
                    // } else if (pDiscount) {
                    // sumTemponary = headphones.getDiscountPrice();
                    // sumTemponary = sumTemponary + (sumTemponary * headphones.getIva());
                    // sum += sumTemponary;
                    // } else {
                    // sumTemponary = headphones.getPriceIva();
                    // sumTemponary = sumTemponary + (sumTemponary * headphones.getIva());
                    // sum += sumTemponary;
                    // }
                    cart[i] = headphones;
                }
            } else {
                System.out.println("Hai inserito in modo non corretto uno dei campi");
                i--;
            }
        }

        System.out.println("Prodotti nel carrello:");
        for (Prodotto prodotto : cart) {
            System.out.println("Il nome del prodotto comprato è " + prodotto.getName() + ", il suo costo senza iva è "
                    + prodotto.getBasicPrice() + "€ aggiungendo l'iva il prezzo del valore del proddotto comprato senza sconti è di " + prodotto.getPriceIva());
        }
        System.out.println("Il totale del carrelo è di " + sum + "€");

        input.close();

    }
}
