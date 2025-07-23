import java.util.Scanner;

public class Conversor {
    public int opcion;

    public void menu(){
        System.out.println("**********************************");
        System.out.println("Bienvenido al conversor de moneda :)\n");
        System.out.println("-------------------CAMBIOS-------------------");
        System.out.printf("1) Dolar             --->    Peso Argentino\n");
        System.out.printf("2) Peso Argentino    --->    Dolar\n");
        System.out.printf("3) Dolar             --->    Real Brasileño\n");
        System.out.printf("4) Real Brasileño    --->    Dolar\n");
        System.out.printf("5) Dolar             --->    Peso Colombiano\n");
        System.out.printf("6) Peso Colombiano   --->    Dolar\n");
        System.out.println("7) Salir\n");
        System.out.print("Elija una opcion: ");
    }
    public void conversion (int opcion){
        Moneda usd = new ConsultaMoneda().buscaMoneda("USD");
        System.out.println(usd.ars());
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
                System.out.printf("%.2f pesos argentinos son %.2f dolares\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(ars.usd()));
                break;
            case 3:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = scanner.nextDouble();
                System.out.printf("%.2f dolares son %.2f reales brasileños\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(usd.brl()));
                break;
            case 4:
                System.out.println("Ingrese la cantidad de reales brasileños a convertir: ");
                monedaDeCambio = scanner.nextDouble();
                System.out.printf("%.2f reales brasileños son %.2f dolares\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(brl.usd()));
                break;
            case 5:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = scanner.nextDouble();
                System.out.printf("%.2f dolares son %.2f pesos colombianos\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(usd.cop()));
                break;
            case 6:
                System.out.println("Ingrese la cantidad de pesos colombianos a convertir: ");
                monedaDeCambio = scanner.nextDouble();
                System.out.printf("%.2f pesos colombianos son %.2f dolares\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(cop.usd()));
                break;
            case 7:
                System.out.println("Saliendo del conversor...");
                scanner.close();
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }
}
