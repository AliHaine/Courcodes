package src.tr.alihaine.mmp;

import java.util.Scanner;

public class Order {
    boolean menu = false;
    boolean drink = true;

    public void runMenu() {
        while (!menu) {
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

    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case 1:
                System.out.println("Vous avez choisi comme menu : poulet");
                this.displayAvailableAccompagnementA();
                menu = true;
                break;
            case 2:
                System.out.println("Vous avez choisi comme menu : boeuf");
                drink = false;
                this.displayAvailableAccompagnementA();
                menu = true;
                break;
            case 3:
                System.out.println("Vous avez choisi comme menu : végétarien");
                this.displayAvailableAccompagnementB();
                menu = true;
                break;
            default:
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }
    public void displayAvailableAccompagnementA() {
        System.out.println("Choix de l'accompagnement");
        System.out.println("1 - Des légumes frais");
        System.out.println("2 - Des frites");
        System.out.println("3 - Du riz");
        System.out.println("Que souhaitez-vous comme accompagnement ?");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedSide(nb, true);
    }

    public void displayAvailableAccompagnementB() {
        System.out.println("Choix de l'accompagnement");
        System.out.println("1 - Riz");
        System.out.println("2 - Sans riz");
        System.out.println("Que souhaitez-vous comme accompagnement ?");
        Scanner sc = new Scanner(System.in);
        int nb = sc.nextInt();
        this.displaySelectedSide(nb, false);
    }

    public void displaySelectedSide(int i, boolean b) {
        if (b) {
            switch (i) {
                case 1:
                    System.out.println("Vous avez choisi comme accompagnement : légumes frais");
                    this.displayAvailableDrink();
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : frites");
                    this.displayAvailableDrink();
                    break;
                case 3:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    this.displayAvailableDrink();
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }
        } else {
            switch (i) {
                case 1:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    this.displayAvailableDrink();
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : pas de riz");
                    this.displayAvailableDrink();
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;

            }
        }
    }

    public void displayAvailableDrink() {
        if (drink) {
            System.out.println("Choix de la boisson");
            System.out.println("1 - Eau plate");
            System.out.println("2 - Eau gazeuse");
            System.out.println("3 - Soda");
            System.out.println("Que souhaitez-vous comme boisson ?");
            Scanner sc = new Scanner(System.in);
            int nb = sc.nextInt();
            this.displaySelectedDrink (nb);
        }
    }

    public void displaySelectedDrink (int i) {
        switch (i) {
            case 1:
                System.out.println("Vous avez choisi comme accompagnement : eau plate");
                break;
            case 2:
                System.out.println("Vous avez choisi comme accompagnement : eau gazeuse");
                break;
            case 3:
                System.out.println("Vous avez choisi comme accompagnement : soda");
                break;
            default:
                System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                break;
        }
    }
}