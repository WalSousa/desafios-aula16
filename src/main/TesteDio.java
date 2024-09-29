package main;

import java.util.Scanner;

public class TesteDio {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int total = 0;
        int media;
        int maior = 0;
        int indice = 0;

        String input = scanner.nextLine();
        String[] qtd = input.split(",");

        for (int i =0; i < qtd.length; i++) {
            total += Integer.parseInt(qtd[i]);
            if (maior < Integer.parseInt(qtd[i])){
                maior = Integer.parseInt(qtd[i]);
                indice = i + 1;
            }
        }

        media = total/qtd.length;

        System.out.println("Total mensal: "+ total + " MB");
        System.out.println("Media semanal: "+ media + " MB");
        System.out.println("Maior consumo: Semana "+ indice);
        scanner.close();
    }
}
