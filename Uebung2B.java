import java.util.Scanner;

public class Uebung2B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Monat ein:");
        String monat = scanner.next();
        monat = monat.toLowerCase();

        if (monat.equals("januar") || monat.equals("maerz") || monat.equals("mai") || monat.equals("juli") || monat.equals("august") || monat.equals("oktober") || monat.equals("dezember")) {
            System.out.println("Dieser Monat hat 31 Tage.");
        } else if (monat.equals("februar")) {
            System.out.println("Dieser Monat hat 28 Tage.");
        } else {
            System.out.println("Dieser Monat hat 30 Tage");
        }
    }
}

