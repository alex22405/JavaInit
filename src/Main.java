import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Output
        System.out.println("Hello world");
        System.out.println(25 + "Hello");
        System.out.println("Hello Developer");
        System.out.println(200 + "Developer" + 100);
        System.out.println(200*200);
        // Commentaires
        // Variables et typage
        // String
        String name = "Alexandre";
        //Int
        int ageLaurent = 30;
        int ageHugo = 28;
        //Float
        float taille = 1.70f;
        //char
        char groupeSanguin = 'A';
        // boolean
        boolean bool = true;
        // double c'est 15 digit
        double vitesse = 1254215;

        int porte = 10;
        int fenetre = 15;
        int maison = porte + fenetre;
        System.out.println("La maison contient" + maison + "porte et fenetre");


        int result = (int) (ageHugo -  vitesse);
        System.out.println("Resultat" + result);

        // Math
        int max = Math.max(porte,fenetre);
        System.out.println(max);

        int min = Math.min(porte,fenetre);
        System.out.println(min);

        // Conditions
        // if else
        if (fenetre > porte){
            System.out.println("Il y a plus de fenetre que de porte");
        } else {
            System.out.println("Il n'y a pas assez de fenetre");
        }

        // if else if else
        if (ageLaurent == ageHugo) {
            System.out.println("Laurent et Hugo ont le même âge");
        } else if (ageLaurent > ageHugo) {
            System.out.println("Laurent est plus agé que Hugo");
        } else {
            System.out.println("Laurent est plus jeune que Hugo");
        }

        // Conditions ternaires
        String resulatTernaire = (ageLaurent == ageHugo) ? "Laurent et Hugo ont le même âge" : "Laurent et Hugo n'ont pas le même âge";
        System.out.println(resulatTernaire);
        System.out.println("===================");


        // Switch Case
        switch (ageLaurent) {
            case 25:
                System.out.println("Laurent a 25 ans");
                break;
            case 30:
                System.out.println("Laurent a 30 ans");
                break;
            case 35:
                System.out.println("Laurent a 35 ans");
                break;
        }

        // while loop
        while (ageLaurent > ageHugo) {
            System.out.println("Laurent est le grand frère");
            ageLaurent--;
        }
        // DO WHILE
        do {
            System.out.println("Hugo est le petit frère");
        } while (ageLaurent > ageHugo);

        while (fenetre > porte) {
            System.out.println("il y a plus de fenetre que porte");
            porte++;
        }
        System.out.println("----------");
        do {
            System.out.println("il y a moins de porte");
        } while (porte < fenetre);

        System.out.println("----------");
        int compteBancaire = 2000;
        int limiteRetrait = 0;
        int retrait = 20;
        while (compteBancaire > limiteRetrait) {
            System.out.println("compte bancaire" + compteBancaire);
            compteBancaire -= retrait;
        }

        System.out.println("----------");
        // for loop
        for (compteBancaire = 0; compteBancaire < 100; compteBancaire++) {
            System.out.println(compteBancaire);
        }

        System.out.println("----------");
        // foreach loop
        String[] voiture = {"mercedes", "BMW", "Audi", "Renault"};
        for (String contenuTab : voiture) {
            System.out.println(contenuTab);
        }

        System.out.println("----------");
        // random
        int minimum = 10;
        int maximum = 20;
        Random random = new Random(); // instanciation objet random
        int randomNumber = random.nextInt(minimum, maximum);
        System.out.println(randomNumber);

        // déclaration du nombre de vie
        //scanner input
        // while => tant que le joueur à un nombre de vie > 0 il continue
        Scanner scanner = new Scanner(System.in);
        System.out.println("veuillez entrer un nombre");
        int userInput = scanner.nextInt();
        // afficher l'input de l'utilisateur
        System.out.println("Vous avez entrer:" + userInput);
        System.out.println("L'ordinateur a généré:" + randomNumber);
        // comparer la variable randomNumber et scanner
        if (randomNumber == userInput) {
            // afficher si l'utilisateur à trouver le bon nombre
            System.out.println("Vous avez gagné");
        } else {
            System.out.println("Vous avez perdu");
        }

        // 5 chances
    }
}
