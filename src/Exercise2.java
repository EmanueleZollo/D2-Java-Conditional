import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci un numero tra 0 e 3");
        int chooseNum = Integer.parseInt(input.nextLine());
        System.out.println(writeNumberIntoLetters(chooseNum));
        if (writeNumberIntoLetters(chooseNum).length() > 5) {
                System.out.println("Inserisci di nuovo un numero tra 0 e 3");
                chooseNum = Integer.parseInt(input.nextLine());
                System.out.println(writeNumberIntoLetters(chooseNum));
        } else {
        input.close();
    }

}
    public static String writeNumberIntoLetters (int num1){
        return switch (num1) {
            case 0 -> "null";
            case 1 -> "one";
            case 2 -> "two";
            case 3 -> "three";
            default -> "errore - devi scegliere un numero tra 0 e 3. Riprova:";

        };
    }

        }
