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
                    Smartphone smartphone = new Smartphone(pName, pBrand, pPrice, pIva, sImei, sMemory);
                    if (pDiscount && sMemory <= 32) {
                        sum += smartphone.getDiscountSmartphone();
                        sum = smartphone.getPriceIva();
                    } else if (pDiscount) {
                        sum += smartphone.getDiscountPrice();
                        sum = smartphone.getPriceIva();
                    } else {
                        sum += smartphone.getPrice();
                        sum = smartphone.getPriceIva();
                    }
                    cart[i] = smartphone;
                } else if (choiceUser == 2) {
                    System.out.println("Inserisci i pollici del televisore");
                    float tSize = Integer.parseInt(input.nextLine());
                    System.out.println("Se il televisore è smart inserisci 'true' altrimenti inserisci 'false'");
                    boolean tSmart = Boolean.parseBoolean(input.nextLine());
                    Televisore television = new Televisore(pName, pBrand, pPrice, pIva, tSize, tSmart);
                    if (pDiscount && !tSmart) {
                        sum += television.getDiscountTelevision();
                        sum += television.getPriceIva();
                    } else if (pDiscount) {
                        sum += television.getDiscountPrice();
                        sum += television.getPriceIva();
                    } else {
                        sum += television.getPrice();
                        sum = television.getPriceIva();
                    }
                    cart[i] = television;
                } else if (choiceUser == 3) {
                    System.out.println("Inserisci il colore delle cuffie");
                    String hColor = input.nextLine();
                    System.out.println("Se le cuffie sono wireless inserisci 'true' altrimenti inserisci 'false'");
                    boolean hWireless = Boolean.parseBoolean(input.nextLine());
                    Cuffie headphones = new Cuffie(pName, pBrand, pPrice, pIva, hColor, hWireless);
                    if (pDiscount && !hWireless) {
                        sum += headphones.getDiscountHeadphones();
                        sum += headphones.getPriceIva();
                    } else if (pDiscount) {
                        sum += headphones.getDiscountPrice();
                        sum += headphones.getPriceIva();
                    } else {
                        sum += headphones.getPrice();
                        sum = headphones.getPriceIva();
                    }
                    cart[i] = headphones;
                }
            } else {
                System.out.println("Hai inserito in modo non corretto uno dei campi");
                i--;
            }
        }

        System.out.println("Prodotti nel carrello:");
        for (Prodotto prodotto : cart) {
            System.out.println(prodotto.getName());
        }

        System.out.println("Il totale del carrelo è di " + sum + "€");

        input.close();

    }
}
