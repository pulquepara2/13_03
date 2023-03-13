import java.util.Scanner;

public class WhileSchleife1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine ganze Zahl ein:");
        int zahl = scanner.nextInt();
        int zaehler = 1;
        int summe = 0;
        while (zaehler <= zahl){
            summe = summe + zaehler;
            zaehler++;
        }
        System.out.println("Die Summe der Zahlen beträgt " + summe);
    }
}
