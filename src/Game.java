import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main (String[] args) {
        // random
        int minimum = 10;
        int maximum = 20;
        Random random = new Random(); // instanciation objet random
        int randomNumber = random.nextInt(minimum, maximum);
        System.out.println(randomNumber);

        // déclaration du nombre de vie
        int vie;
        int gameOver = 0;
        // initialisation du nombre de vie
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre de vie");
        vie = scanner.nextInt();
        // scanner input
        // while => tant que le joueur à un nombre de vie > 0 il continue
        while (vie > gameOver) {
            System.out.println("veuillez entrer un nombre");
            int userInput = scanner.nextInt();
            // afficher l'input de l'utilisateur
            System.out.println("Vous avez entrer: " + userInput);
            System.out.println("L'ordinateur a généré: " + randomNumber);
            // comparer la variable randomNumber et scanner
            if (randomNumber == userInput) {
                // afficher si l'utilisateur à trouver le bon nombre
                System.out.println("Vous avez gagné");
            } else {
                System.out.println("Vous avez perdu");
                vie--;
                System.out.println("il vous reste " + vie + " vie");
            }
        }
    }
}
