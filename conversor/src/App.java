import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Conversor conversor = new Conversor();
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        while (opcion != 7){
            conversor.menu();
            opcion = scanner.nextInt();
            conversor.conversion(opcion);
        }
        scanner.close();
    }
}
