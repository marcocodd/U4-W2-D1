package esercizio0;

public class Esercizio0 {

    public static boolean stringaPariDispari(String string) {
        if (string.length() % 2 == 0){
            return true;
        }
        else {
            return false;
        }
    }


    public static boolean annoBisestile(int anno) {
        if (anno % 4 == 0 && (anno % 100 != 0 || anno % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }


    public static void main(String[] args) {

        System.out.println(stringaPariDispari("cia"));
        System.out.println (annoBisestile(2024));
    }
}

