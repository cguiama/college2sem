import java.util.Scanner;

public class Patricando_Aula1 {
    public static void main(String[] args) {
        double n1, n2;
        int op;
        Scanner entrada = new Scanner(System.in);
        while (true) {
            System.out.println("Escolha a operação desejada:");
            System.out.println("1-Soma\n2-Subtração\n3-Multiplicação\n4-Divisão\n5-Sair");
            op = entrada.nextInt();
            if (op == 5)
                break;
            if (op < 1 || op > 5) {
                System.out.println("Opção inválida!");
                continue;
            }
            System.out.println("Digite 2 números:");
            n1 = entrada.nextDouble();
            n2 = entrada.nextDouble();

            switch (op) {
                case 1:
                    System.out.println("Soma = " + (n1 + n2));
                    break;
                case 2:
                    System.out.println("Subtração = " + (n1 - n2));
                    break;
                case 3:
                    System.out.println("Multiplicação = " + (n1 * n2));
                    break;
                case 4:
                    if (n2 == 0) {
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                        continue;
                    } else {
                        System.out.println("Divisão = " + (n1 / n2));
                        break;
                    }
                case 5:
                    System.out.println("Obrigado!");
                    break;
            }

        }
    }
}
