import java.util.Scanner;

public class Main {

    private static String segue = "";

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        calc();

        segue = getContinue(scanner);

        do {
            calc();
            getContinue(scanner);
        } while ("S".equalsIgnoreCase(segue));

        scanner.close();
    }

    private static String getContinue(Scanner scanner) {
        System.out.println("Deseja continuar? 'S' para Sim ou qualquer tecla para Não");
        segue = scanner.nextLine();
        return segue;
    }

    public static void calc() {

        Scanner scanner = new Scanner(System.in);
        char operacao;
        int resultado;
        System.out.println("********* MENU CALCULADORA **************");

        System.out.println("Digite a opção: + para Adição");
        System.out.println("Digite a opção: - para Subtração");
        System.out.println("Digite a opção: * para Multiplicação");
        System.out.print("Escolha a operação: ");
        operacao = scanner.next().charAt(0);
        switch (operacao) {
            case '+' -> {
                System.out.println("****** Operação Escolhida: Adição *******");
                resultado = calcular('+', scanner);
                System.out.println("O resultado da soma é: " + resultado);
            }
            case '-' -> {
                System.out.println("****** Operação Escolhida: Subtração *******");
                resultado = calcular('-', scanner);
                System.out.println("O resultado da subtração é: " + resultado);
            }
            case '*' -> {
                System.out.println("****** Operação Escolhida: Multiplicação *******");
                resultado = calcular('*', scanner);
                System.out.println("O resultado da multiplicação é: " + resultado);
            }
            default -> System.out.println("Operação inválida.");
        }
    }

    public static int calcular(char operacao, Scanner scanner) {
        int resultado = 0;
        boolean primeiraEntrada = true;
        while (true) {
            System.out.print("Digite o número ou = para ver o resultado: ");
            String entrada = scanner.next();
            if (entrada.equals("=")) {
                break;
            }
            int numero = Integer.parseInt(entrada);
            if (primeiraEntrada) {
                resultado = numero;
                primeiraEntrada = false;
            } else {
                if (operacao == '+') {
                    resultado += numero;
                } else if (operacao == '-') {
                    resultado -= numero;
                } else if (operacao == '*') {
                    resultado *= numero;
                }
            }
        }
        return resultado;
    }
}





