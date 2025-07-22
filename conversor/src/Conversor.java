import java.util.Scanner;

public class Conversor {
    public int opcion;

    public void conversion (int opcion){
        Moneda usd = new ConsultaMoneda().buscaMoneda("USD");
        Moneda ars = new ConsultaMoneda().buscaMoneda("ARS");
        Moneda brl = new ConsultaMoneda().buscaMoneda("BRL");
        Moneda cop = new ConsultaMoneda().buscaMoneda("COP");
        double monedaDeCambio;

        Scanner scanner = new Scanner(System.in);
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = scanner.nextDouble();
                System.out.printf("%.2f dolares son %.2f pesos argentinos\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(usd.ars()));
                break;
            case 2:
                System.out.println("Ingrese la cantidad de pesos argentinos a convertir: ");
                monedaDeCambio = scanner.nextDouble();
                System.out.printf("%.2f pesos argentinos son %.2f dolares\n", monedaDeCambio, monedaDeCambio / Double.parseDouble(ars.usd()));
                break;
            case 3:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = scanner.nextDouble();

            case 7:
                System.out.println("Saliendo del conversor...");
                scanner.close();
                break;
            default:
                System.out.println("Opción no válida.");
        }
    }
}
