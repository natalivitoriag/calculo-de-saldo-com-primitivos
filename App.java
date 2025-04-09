import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double saldoInicial = scanner.nextDouble();
        double primeiraEntrada = scanner.nextDouble();
        double segundaEntrada = scanner.nextDouble();
        double terceiraEntrada = scanner.nextDouble();

        double saldoFinal = saldoInicial + primeiraEntrada + segundaEntrada + terceiraEntrada;

        System.out.printf("%.2f\n", saldoFinal);

        scanner.close();
    }
}
