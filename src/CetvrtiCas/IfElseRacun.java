package CetvrtiCas;

import java.util.Scanner;

public class IfElseRacun {
    public static void main(String[] args) {

        double balance = 1000;
        Scanner s = new Scanner(System.in);
        System.out.print("Unesite sumu novca koju zelite da podignete u dinarima: ");
        double charge = s.nextDouble();

        if (balance >= charge) {
            balance = balance - charge;
            System.out.println("Vase novo stanje na racunu je: " + balance + " din");
        } else {
            System.out.println("Ne mozete podici novac, vase stanje na racunu je " + balance + " din!");
        }
    }
}
