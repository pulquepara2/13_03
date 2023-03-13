import java.util.Scanner;

public class Uebung2A {
    public static void main(String[] args) {
        //wenn void steht, brauchen wir keinen return wert, bei int usw schon
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie den Monat ein:");
        String monat = scanner.next();
       // monat = monat.toLowerCase();
        //kann man auch im Switch angeben!

        switch (monat.toLowerCase()) {
            case "januar":
            case "maerz":
            case "mai":
            case "juli":
            case "august":
            case "oktober":
            case "dezember":
                System.out.println("Der Monat " + monat + " hat 31 Tage");
                break;
            case "februar":
                System.out.println("Der Monat " + monat + " hat 28 Tage");
                break;
            case "april":
            case "juni":
            case "september":
            case "november":
                System.out.println("Der Monat " + monat + " hat 30 Tage");

        }
    }
}
