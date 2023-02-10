package DrugiCas;
import java.util.Scanner;
public class Skener {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Unesite ime: ");
        String ime = scanner.next();

        System.out.println("Unesite prezime: ");
        String prezime = scanner.next();

        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);

    }

}
