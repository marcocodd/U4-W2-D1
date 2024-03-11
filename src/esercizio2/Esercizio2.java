package esercizio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Esercizio2 {
    public static void main(String[] args) {

        int km;
        int litri;

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Inserisci i km percorsi");
            km = input.nextInt();
            System.out.println("Inserisci i litri consumati");
            litri = input.nextInt();
            System.out.println("I km/litro sono: " + (km / litri));

        } catch (ArithmeticException ex) {
            System.err.println("i litri non possono essere 0");
        } catch (InputMismatchException ex) {
            System.err.println("Inserisci un numero");
        } finally {
            input.close();
        }
    }
}
