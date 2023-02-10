package TreciCas;

import java.util.Scanner;

public class ZadatakParniBroj {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite ceo broj: ");
        int broj = s.nextInt();
        if (broj % 2 == 0) {
            System.out.println("Uneti broj " + broj + " je paran!");
        } else {
            System.out.println("Uneti broj " + broj + " je neparan!");
        }
    }
}