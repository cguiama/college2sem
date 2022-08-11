import java.util.Scanner;

public class Aplicando_Aula1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int op;
        double n1, n2;
        op = entrada.nextInt();

        while(true) {
            if (op == 5) {
                break;
            }
            if (op < 1 || op >= 6 ) {
                System.out.println("OPÇÃO INVÁLIDA");
                op = entrada.nextInt();
                break;
            }
            switch (op) {
                case 1:
                    n1 = entrada.nextDouble();
                    n2 = entrada.nextDouble();
                    System.out.println((n1 + n2) / 2);
                    op = entrada.nextInt();
                    continue;
                case 2:
                    n1 = entrada.nextDouble();
                    n2 = entrada.nextDouble();
                    if (n1 > n2) {
                        System.out.println(n1 - n2);
                        op = entrada.nextInt();
                        continue;
                    } else {
                        System.out.println(n2 - n1);
                        op = entrada.nextInt();
                        continue;
                    }
                case 3:
                    n1 = entrada.nextDouble();
                    n2 = entrada.nextDouble();
                    System.out.println(n1 * n2);
                    op = entrada.nextInt();
                    continue;
                case 4:
                    n1 = entrada.nextDouble();
                    n2 = entrada.nextDouble();
                    if (n2 == 0) {
                        System.out.println("NÃO FOI POSSÍVEL REALIZAR A OPERAÇÃO");
                        op = entrada.nextInt();
                        continue;
                    } else {
                        System.out.println(n1 / n2);
                        op = entrada.nextInt();
                        continue;
                    }
            }
        }
    }
}
