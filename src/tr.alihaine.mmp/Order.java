package src.tr.alihaine.mmp;

import java.util.Scanner;

public class Order {
    boolean menu1 = false;
    boolean menu2 = false;
    boolean menu3 = false;

    public void runMenu() {
        while (!menu1 && !menu2 && !menu3) {
            this.displayAvailableMenu();
            Scanner sc = new Scanner(System.in);
            int nb = sc.nextInt();
            this.displaySelectedMenu(nb);
        }
    }

    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - Poulet");
        System.out.println("2 - Boeuf");
        System.out.println("3 - Végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    public void displayAvailableAccompagnement() {
        if (menu1) {
            System.out.println("Choix de l'accompagnement");
            System.out.println("1 - Des légumes frais");
            System.out.println("2 - Des frites");
            System.out.println("3 - Du riz");
            System.out.println("Que souhaitez-vous comme accompagnement ?");
            Scanner sc = new Scanner(System.in);
            int nb = sc.nextInt();
            this.displaySelectedAccompagnement(nb);
        }
    }

    public void displayAvailableDrink() {

        System.out.println("Choix de boisson");
        System.out.println("1 - Eau plate");
        System.out.println("2 - Eau gazeuse");
        System.out.println("3 - Sode");
        System.out.println("Que souhaitez-vous comme boisson ?");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
    }

    public void displaySelectedMenu(int nbMenu) {

        if (nbMenu == 1) {
            System.out.println("Vous avez choisi comme menu : poulet");
            menu1 = true;
            this.displayAvailableAccompagnement();
        }

        if (nbMenu == 2) {
            System.out.println("Vous avez choisi comme menu : boeuf");
            menu2 = true;
        }

        if (nbMenu == 3) {
            System.out.println("Vous avez choisi comme menu : végétarien");
            menu3 = true;
        }

        if (nbMenu <= 0) {
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
            menu3 = false;
        }

        if (nbMenu > 3) {
            System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
            menu3 = false;
        }
    }

    public void displaySelectedAccompagnement(int nbAcc) {
        if (nbAcc == 1) {
            System.out.println("Vous avez choisi comme accompagnement : des légumes frais");
            menu1 = true;
        }

        if (nbAcc == 2) {
            System.out.println("Vous avez choisi comme accompagnement : des frites");
            menu2 = true;
        }

        if (nbAcc == 3) {
            System.out.println("Vous avez choisi comme accompagnement : du riz");
            menu3 = true;
        }
    }

}