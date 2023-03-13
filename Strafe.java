import java.util.Scanner;

public class Strafe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie die Geschwindigkeit ein");
        int geschwindigkeit = scanner.nextInt();

        int ueberschreitung = geschwindigkeit - 50;

        System.out.println("Eingabe Alkoholpegel");
        double alkoholpegel = scanner.nextDouble();
        System.out.println("Eingabe Monat");
        String monat = scanner.next();
        double strafe = 0;



        if (ueberschreitung <=0){
            System.out.println("Es gibt keine Ueberschreitung");
        } else if (ueberschreitung <= 10){
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + "km/h- Verwarnung.");
        } else if (ueberschreitung <=20){
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + ", daher 30 Euro Strafe");
            strafe = strafe + 30;
        } else if (ueberschreitung <= 30){
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + ",daher 50 Euro Strafe");
            strafe = strafe + 50;
        } else if (ueberschreitung <= 50) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + ",daher 100 Euro Strafe");
            strafe = strafe + 100;
        } else if (ueberschreitung <= 100) {
            System.out.println("Die Ueberschreitung betraegt " + ueberschreitung + ",daher 500 Euro Strafe");
            strafe = strafe + 500;
        } else if (ueberschreitung > 100) {
            System.out.println( "Die Ueberschreitung betraegt " + ueberschreitung + ",daher 1500 Euro Strafe");
            strafe = strafe + 1500;
    }

        if (alkoholpegel <= 0.5){
            System.out.println( "Der Alkoholpegel betraegt " + alkoholpegel + " Promille -Alles in Ordnung");
        } else if (alkoholpegel <= 1.0) {
            System.out.println("Der Alkoholpegel betraegt " + alkoholpegel + " Promille, 50 Euro Strafe");
            strafe = strafe + 50;
        } else if (alkoholpegel <= 2.0) {
            System.out.println("Der Alkoholpegel betraegt " + alkoholpegel + " Promille, 100 Euro Strafe");
            strafe = strafe + 100;
        } else if (alkoholpegel > 2.0) {
            System.out.println("Der Alkoholpegel betraegt " + alkoholpegel + " Promille, 2500 Euro Strafe");
            strafe = strafe + 2500;
        }
        monat = monat.toLowerCase();
        switch (monat){
            case "januar":
            case "februar":
                System.out.println("Leider kein Rabatt möglich");
            break;
            case "maerz":
            case "april":
                System.out.println("Es gibt 10% Rabatt.");
                strafe = strafe * 0.9;
            break;
            case "mai":
            case "juni":
                System.out.println("Es gibt 15% Rabatt.");
                strafe = strafe * 0.85;
            break;
            case "juli":
            case "august":
                System.out.println("Es gibt 20% Rabatt.");
                strafe = strafe * 0.8;
            break;
            case "september":
            case "oktober" :
                System.out.println("Es gibt 25% Rabatt.");
                strafe = strafe * 0.75;
            break;
            case "november":
            case "dezember":
                System.out.println("Es gibt 30% Rabatt.");
                strafe = strafe * 0.7;
            //hier ist kein  break mehr notwendig
        }

        System.out.println("Die finale Strafe betraegt: " + strafe + " Euro.");        }
    }




