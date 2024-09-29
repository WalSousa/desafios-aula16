package main;

import java.util.Scanner;

public class TesteDio2 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        scanner.nextLine();
        int consMB = scanner.nextInt();

        int convertMB = input * 1024;

        if (convertMB > consMB) {
            int result = convertMB - consMB;
            System.out.println("Voce ainda possui " + result + " MB disponiveis.");
        } else {
            System.out.println("Limite de dados excedido. Compre ou renove seu pacote.");
        }
        scanner.close();
    }
}
