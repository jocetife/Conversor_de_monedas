

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("**********************************");
        System.out.println("Bienvenido al conversor de moneda :)\n");
        Conversor conversor = new Conversor();
        
        int opcion = 0;
        while (opcion != 7){
            conversor.menu();
            opcion = conversor.scanner.nextInt();
            conversor.conversion(opcion);
        }
        conversor.scanner.close();
    }
    
}
