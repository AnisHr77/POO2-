import java.util.InputMismatchException;
import java.util.Scanner;

class Exo {
    static int[] T = {17, 12, 15, 38, 29, 157, 89, -22, 0, 5};

    static int div(int indice, int diviseur) {
        return T[indice] / diviseur;
    }

    public static void main(String[] args) {
        int x = 0, y = 0;
        boolean reussi = false;
        Scanner sc = new Scanner(System.in);

        while (!reussi) {
            try {
                System.out.print("Entrez l’indice de l’entier à diviser : ");
                x = sc.nextInt();

                System.out.print("Entrez le diviseur : ");
                y = sc.nextInt();

                int resultat = div(x, y);
                System.out.println("Le résultat de la division est : " + resultat);
                reussi = true; 
            }
            catch (InputMismatchException e) {
                System.out.println("Erreur : vous devez entrer un entier !");
                sc.nextLine();
            }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Erreur : l’indice est hors limites du tableau !");
            }
            catch (ArithmeticException e) {
                System.out.println("Erreur : division par zéro interdite !");
            }
        }

        sc.close();
    }
}
