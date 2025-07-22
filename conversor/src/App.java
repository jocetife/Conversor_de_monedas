public class App {
    public static void pretty(String parte1, String parte2) {
        System.out.printf("%s                       %s\n", parte1, parte2);
    }
    public static void main(String[] args) throws Exception {
        System.out.println("**********************************");
        System.out.println("Bienvenido al conversor de moneda :)\n");
        System.out.println("-------------------CAMBIOS-------------------");
        pretty("1) Dolar","Peso Argentino");
        pretty("2) Peso Argentino","Dolar");
        pretty("3) Dolar","Real Brasileño");
        pretty("4) Real Brasileño","Dolar");
        pretty("5) Dolar","Peso Colombiano");
        pretty("6) Peso Colombiano","Dolar");
        System.out.println("7) Salir");

    }
}
