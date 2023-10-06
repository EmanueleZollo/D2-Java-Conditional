import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Exercise1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Scrivi una parola e scopri se il numero di caratteri che ha è pari o dispari:");
        String str1 = input.nextLine();
        System.out.println(stringaPariDispari(str1));
        System.out.println("Scrivi il tuo anno di nascita e scopri se era bisestile:");
        int randYear = Integer.parseInt(input.nextLine());
        System.out.println(annoBisestile(randYear));
    }
    public static boolean stringaPariDispari(String str) {
            System.out.println(str + " ha " + str.length() + " caratteri" );
        if (str.length() % 2 == 0) {
            System.out.println("La parola che hai scritto è composta un numero di lettere pari");
            return true;
        }
        else {
            System.out.println("La parola che hai scritto è composta un numero di lettere dispari");
            return false;
        }
    }

    public static boolean annoBisestile (int year) {
        if (year % 400 == 0) {
            System.out.println("Il " + year + " è stato un anno secolare bisestile");
            return true;
        } else if (year % 100 != 0 && year % 4 == 0) {
            System.out.println("Il " + year + " è stato un anno bisestile");
            return true;
        }
         else {
            System.out.println("Il " + year + " non è stato un anno bisestile");
            return false;
        }
        }
    }


