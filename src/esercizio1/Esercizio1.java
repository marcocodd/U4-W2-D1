package esercizio1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Esercizio1 {
    public static void main(String[] args) {

        int[] arrayNumbers = new int[5];
        Random randomNumber = new Random();
        for (int i = 0; i < arrayNumbers.length; i++) {
            arrayNumbers[i] = randomNumber.nextInt(1, 10);
        }

        System.out.println("array random numbers di origine:" + Arrays.toString(arrayNumbers));

        Scanner input = new Scanner(System.in);

        int numberInput;
        int positionNumber;
        do {
            System.out.println("Quale numero vuoi inserire? (inserisci 0 per uscire)");
            numberInput = input.nextInt();
            if (numberInput == 0) {
                System.out.println("Chiusura programma");
                break;
            }
            System.out.println("In quale posizione vuoi inserirlo?");
            positionNumber = input.nextInt();
            if (positionNumber > arrayNumbers.length) {
                System.err.println("La posizione deve essere tra 1 e 5");
            } else {
                arrayNumbers[positionNumber - 1] = numberInput;
            }
            System.out.println("Il nuovo array è" + Arrays.toString(arrayNumbers));

        } while (numberInput != 0);

    }
}
