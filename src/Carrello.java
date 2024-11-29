import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Inserisci numericamente quanti prodotti vuoi aggiungere al carrello");
        int shopQuantity = Integer.parseInt(input.nextLine());

        Prodotto[] cart = new Prodotto[shopQuantity];
        int cartLenght = cart.length;

        
        input.close();

    }
}
