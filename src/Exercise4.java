import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Inserisci un numero e preparati al countdown!");
            int randNum = Integer.parseInt(input.nextLine());
            for (int i = 0; i <= randNum; i++) {
                System.out.println(randNum - i);
            }
        } while (true);
    }
}


