import java.util.Arrays;
import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Boolean isTrue = true;

            do {
                System.out.println("Inserisci una parola o una frase, il programma dividerà quello che scrivi in caratteri");
                String randSentence = input.nextLine();
                switch (randSentence) {
                    case ":q":
                        isTrue = false;
                        System.out.println("Hai digitato il codice segreto. Il loop è terminato");
                        input.close();
                        break;
                    default:
                        isTrue = true;
                        System.out.println(Arrays.toString(splitIntoCharacters(randSentence)));
                }
            }
            while (isTrue); {
            }



    }
        public static String[] splitIntoCharacters(String str) {
            String[] newChars;
            newChars = new String[str.length()];
            System.out.println("Presto vedrai la tua parola scomposta");
                int i = 0;
                while (i < str.length()) {
                    newChars[i] = String.valueOf(str.charAt(i));
                    i++;
                }
            return newChars;
            }
}

