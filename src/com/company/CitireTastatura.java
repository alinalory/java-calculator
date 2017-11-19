package com.company;
import java.util.InputMismatchException;
import  java.util.Scanner;

public class CitireTastatura {
        public  int citireNumar(){
            boolean repeat = true;
            int fromUser = 0;
            do {
                try {
                    Scanner scan = new Scanner(System.in);
                    fromUser = scan.nextInt();
                    repeat = false;
                } catch (InputMismatchException exception) {
                    System.out.println(Constante.EROARE_INPUT);
                }
            }
            while (repeat);
            return fromUser;
        }
        public String citireText() {
        Scanner scan = new Scanner(System.in);
        return scan.next();
    }
}
