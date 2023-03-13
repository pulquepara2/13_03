import java.util.Scanner;

public class VornameNachname {
    public static void main(String[] args) {
        boolean bool;

        Scanner scanner = new Scanner (System.in);
        System.out.println("Bitte geben Sie Ihren Vornamen ein");
        String vorname = scanner.nextLine();
        System.out.println("Bitte geben Sie Ihren Nachnamen ein");
        String nachname = scanner.nextLine();

        String name = vorname.concat(" " + nachname);


        System.out.println("Willkommen," + name.toUpperCase());

        System.out.println("Die Laenge ist " + name.length());
        bool = name.length() > 10;
        System.out.println("Die Laenge ist groesser 10: " + bool);



    }
}
