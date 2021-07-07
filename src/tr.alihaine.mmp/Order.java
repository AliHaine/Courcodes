package src.tr.alihaine.mmp;

import java.util.Scanner;

public class Order {
    boolean menu = false;

    public void run() {
        this.displayNumbersMenus();
        Scanner sc = new Scanner(System.in);
        int nbMenus = sc.nextInt();
        if (nbMenus > 0) {
            for (int i = nbMenus; i > 0; i--) {
                this.runMenus();
                nbMenus--;
            }
        } else {
            this.runMenu();
        }
    }

    public void runMenus() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nbMenu = sc.nextInt();
        switch (nbMenu) {
            case 1:
                displayAvailableSide(true);
                int nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                displayAvailableDrink();
                int nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
            case 2:
                displayAvailableSide(true);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, true);
                break;
            case 3:
                displayAvailableSide(false);
                nbSide = sc.nextInt();
                displaySelectedSide(nbSide, false);
                displayAvailableDrink();
                nbDrink = sc.nextInt();
                displaySelectedDrink(nbDrink);
                break;
        }
    }

    public void runMenu() {
        while (!menu) {
            this.displayAvailableMenu();
            Scanner sc = new Scanner(System.in);
            int nbMenu = sc.nextInt();
            this.displaySelectedMenu(nbMenu);
            switch (nbMenu) {
                case 1:
                    displayAvailableSide(true);
                    int nbSide = sc.nextInt();
                    displaySelectedSide(nbSide, true);
                    displayAvailableDrink();
                    int nbDrink = sc.nextInt();
                    displaySelectedDrink(nbDrink);
                    break;
                case 2:
                    displayAvailableSide(true);
                    nbSide = sc.nextInt();
                    displaySelectedSide(nbSide, true);
                    break;
                case 3:
                    displayAvailableSide(false);
                    nbSide = sc.nextInt();
                    displaySelectedSide(nbSide, false);
                    displayAvailableDrink();
                    nbDrink = sc.nextInt();
                    displaySelectedDrink(nbDrink);
                    break;
            }
        }
    }

    public void displayNumbersMenus() {
        System.out.println("Combien de menu souhaitez-vous ?");
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
                menu = true;
                break;
            case 2:
                System.out.println("Vous avez choisi comme menu : boeuf");
                menu = true;
                break;
            case 3:
                System.out.println("Vous avez choisi comme menu : végétarien");
                menu = true;
                break;
            default:
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }
    public void displayAvailableSide(boolean allSideEnable) {
        if (allSideEnable) {
            System.out.println("Choix de l'accompagnement");
            System.out.println("1 - Des légumes frais");
            System.out.println("2 - Des frites");
            System.out.println("3 - Du riz");
            System.out.println("Que souhaitez-vous comme accompagnement ?");
        } else {
            System.out.println("Choix de l'accompagnement");
            System.out.println("1 - Riz");
            System.out.println("2 - Sans riz");
            System.out.println("Que souhaitez-vous comme accompagnement ?");
        }
    }

    public void displaySelectedSide(int i, boolean b) {
        if (b) {
            switch (i) {
                case 1:
                    System.out.println("Vous avez choisi comme accompagnement : légumes frais");
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : frites");
                    break;
                case 3:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }
        } else {
            switch (i) {
                case 1:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : pas de riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;

            }
        }
    }

    public void displayAvailableDrink() {
            System.out.println("Choix de la boisson");
            System.out.println("1 - Eau plate");
            System.out.println("2 - Eau gazeuse");
            System.out.println("3 - Soda");
            System.out.println("Que souhaitez-vous comme boisson ?");
    }

    public void displaySelectedDrink (int i) {
        switch (i) {
            case 1:
                System.out.println("Vous avez choisi comme boisson : eau plate");
                break;
            case 2:
                System.out.println("Vous avez choisi comme boisson : eau gazeuse");
                break;
            case 3:
                System.out.println("Vous avez choisi comme boisson : soda");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de boisson parmi les choix proposés");
                break;
        }
    }
}