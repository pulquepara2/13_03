import java.util.Scanner;

public class Verzweigungen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine beliebige Zahl ein");
        int nummer = scanner.nextInt();

        if (nummer > 5){
            System.out.println("Nummer ist größer als 5");
        } else if (nummer < 5) {
            System.out.println("Nummer ist kleiner als 5");
        } else {
            System.out.println("Die Zahl ist wohl 5");
        }
    }
}
