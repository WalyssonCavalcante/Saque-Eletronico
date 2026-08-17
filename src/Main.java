import java.util.Scanner;

public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Qual valor voce deseja receber?");

            int valorSaque = scanner.nextInt();

            if (valorSaque == 0) {
                System.out.println("Obrigado por utilizar o nosso caixa eletrônico. Até logo!");
                break;
            }

            if (valorSaque < 0) {
                System.out.println("Operação inválida. Digite um valor maior que zero.");
                continue;
            }

            int valorRestante = valorSaque;

            int[] notasDisponiveis = {100, 50, 20, 10, 5};

            String resultadoNotas = "";

            for (int nota : notasDisponiveis) {
                int qtdNotas = valorRestante / nota;

                valorRestante = valorRestante % nota;

                if (qtdNotas > 0) {
                    resultadoNotas += qtdNotas + " nota(s) de R$ " + nota + "\n";
                }

            }

            if (valorRestante == 0) {
                System.out.println("Notas a serem entregues:");
                System.out.println(resultadoNotas);
            } else {
                System.out.println("Não é possível realizar o saque.");
                break;
            }

        }
        scanner.close();
    }
}
