import java.util.Scanner;

public class Etudiant {
    public static void main (String[] args) {
        // Déclaration des variables
        int etudiants = 0; // initialisation
        String[] noms = new String[100];
        String[] prenoms = new String[100];
        int[] ages = new int[100];
        String[] matricules = new String[100];
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // 1- Interface de bienvenue multichoix
            System.out.println("Bonjour et bienvenue sur votre interface");
            System.out.println("Taper: \n" +
                    "1- Ajouter un étudiant \n" +
                    "2- Supprimer un étudiant \n" +
                    "3- Afficher la liste des étudiants \n" +
                    "4- Rechercher un étudiant \n" +
                    "5- Rechercher un étudiant avec son nom");

            int userInputChoice = scanner.nextInt();

            switch (userInputChoice) {
                case 1:
                    System.out.println("1- Ajouter un étudiant");
                    System.out.println("Quel est le nom de l'étudiant ?");
                    String userInputName = scanner.next();
                    System.out.println("Quel est le prénom de l'étudiant ?");
                    String userInputLastName = scanner.next();
                    System.out.println("Quel est l'âge 'de l'étudiant ?");
                    int userInputAge = scanner.nextInt();
                    System.out.println("Quel est le matricule de l'étudiant ?");
                    String userInputMatricule = scanner.next();
                    noms[etudiants] = userInputName;
                    prenoms[etudiants] = userInputLastName;
                    ages[etudiants] = userInputAge;
                    matricules[etudiants] = userInputMatricule;
                    etudiants++;
                    break;
                case 2:
                    System.out.println("Vous avez choisi 2");
                    break;
                case 3:
                    System.out.println("Liste des étudiants");
                    for (int i = 0; i < etudiants ; i++) {
                        System.out.println("nom " + noms[i]);
                        System.out.println("prenom " + prenoms[i]);
                        System.out.println("age " + ages[i]);
                        System.out.println("matricule " + matricules[i]);
                        }
                    break;
                case 4:
                    System.out.println("Rechercher un étudiant");
                }
            }
        }
    }
