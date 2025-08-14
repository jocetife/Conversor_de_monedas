import java.util.Scanner;

public class Conversor {
    public int opcion;
    public Scanner scanner = new Scanner(System.in);

    public void menu(){
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
        double monedaDeCambio;
        switch (opcion) {
            case 1:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = leerCantidad();
                System.out.printf("%.2f dolares son %.2f pesos argentinos\n\n\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(usd.ars()));
                break;
            case 2:
                Moneda ars = new ConsultaMoneda().buscaMoneda("ARS");
                System.out.println("Ingrese la cantidad de pesos argentinos a convertir: ");
                monedaDeCambio = leerCantidad();
                System.out.printf("%.2f pesos argentinos son %.2f dolares\n\n\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(ars.usd()));
                break;
            case 3:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = leerCantidad();
                System.out.printf("%.2f dolares son %.2f reales brasileños\n\n\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(usd.brl()));
                break;
            case 4:
                Moneda brl = new ConsultaMoneda().buscaMoneda("BRL");
                System.out.println("Ingrese la cantidad de reales brasileños a convertir: ");
                monedaDeCambio = leerCantidad();
                System.out.printf("%.2f reales brasileños son %.2f dolares\n\n\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(brl.usd()));
                break;
            case 5:
                System.out.println("Ingrese la cantidad de dolares a convertir: ");
                monedaDeCambio = leerCantidad();
                System.out.printf("%.2f dolares son %.2f pesos colombianos\n\n\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(usd.cop()));
                break;
            case 6:
                Moneda cop = new ConsultaMoneda().buscaMoneda("COP");
                System.out.println("Ingrese la cantidad de pesos colombianos a convertir: ");
                monedaDeCambio = leerCantidad();
                System.out.printf("%.2f pesos colombianos son %.2f dolares\n\n\n", monedaDeCambio, monedaDeCambio * Double.parseDouble(cop.usd()));
                break;
            case 7:
                System.out.println("Saliendo del conversor...");
                break;
            default:
                System.out.println("Opcion no valida.");
        }
    }

    public double leerCantidad() {
        while (true) {
            if (scanner.hasNextDouble()) {
                return scanner.nextDouble();
            } else {
                System.out.print("Debe ingresar un número válido. Intente de nuevo: ");
                scanner.next();
            }
        }
    }
}
