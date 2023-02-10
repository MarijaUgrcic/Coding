package DrugiCas;

import java.io.Console;

public class Konzola {

    public static void main(String[] args) {
        Console c = System.console();
        if (c != null) {
            c.writer().println("Console exists");
        } else {
            System.out.println("Don't works");
        }
    }
}