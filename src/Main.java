import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int tulos1 = 0;
        int tulos2 = 0;
        int tulos3 = 0;
        String jatketaanko = "";
        String raha = "";

        System.out.println("Kuinka paljon haluat syöttää rahaa koneeseen?");
        raha = in.nextLine();
        int i = Integer.parseInt(raha) ;

        do {
            tulos1 = r.nextInt(10) + 1;
            System.out.println(tulos1);
            tulos2 = r.nextInt(10) + 1;
            System.out.println(tulos2);
            tulos3 = r.nextInt(10) + 1;
            System.out.println(tulos3);


            if(tulos1 == 7 && tulos2 == 7 && tulos3 == 7) {
                System.out.println("Voitit 10€");
                i += 10;
            } else if (tulos1 == 7 && tulos2 == 7 || tulos3 == 7 && tulos2 == 7 || tulos1 == 7 && tulos3 == 7) {
                System.out.println("Voitit 5€");
                i += 5;
            } else if (tulos1 == 7 || tulos2 == 7 || tulos3 == 7) {
                System.out.println("Voitit 3€");
                i += 3;
            }
                i--;

            if(i == 0) {
                break;
            }
                System.out.println("Sinulla on " + i + "€, Haluatko jatkaa pelaamista?");
                jatketaanko = in.nextLine();


        } while(i > 0 && jatketaanko.equalsIgnoreCase("y"));

        if(i == 0) {
            System.out.println("Sinulla ei ole enää rahaa jäljellä, hävisit.");
        } else {
            System.out.println("Voitit " + i);
        }

    }
}