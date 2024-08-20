import java.util.Scanner;
//Karen Audrey Hoya Salinas
//Ejercicio Alcancia
//20-08-20224

class Alcancia {
    private int moneda20;
    private int moneda50;
    private int moneda100;
    private int moneda200;
    private int moneda500;

    public Alcancia() {
        moneda20 = 0;
        moneda50 = 0;
        moneda100 = 0;
        moneda200 = 0;
        moneda500 = 0;
    }

    public void agregarMoneda(int denominacion) {
        switch (denominacion) {
            case 20:
                moneda20++;
                break;
            case 50:
                moneda50++;
                break;
            case 100:
                moneda100++;
                break;
            case 200:
                moneda200++;
                break;
            case 500:
                moneda500++;
                break;
            default:
                System.out.println("Denominación no válida.");
        }
    }

    public void contarMonedas() {
        System.out.println("Monedas de $20: " + moneda20);
        System.out.println("Monedas de $50: " + moneda50);
        System.out.println("Monedas de $100: " + moneda100);
        System.out.println("Monedas de $200: " + moneda200);
        System.out.println("Monedas de $500: " + moneda500);
    }

    public void calcularTotal() {
        int total = (moneda20 * 20) + (moneda50 * 50) + (moneda100 * 100) + (moneda200 * 200) + (moneda500 * 500);
        System.out.println("Total ahorrado: $" + total);
    }

    public void romperAlcancia() {
        calcularTotal();
        moneda20 = 0;
        moneda50 = 0;
        moneda100 = 0;
        moneda200 = 0;
        moneda500 = 0;
        System.out.println("Alcancía rota. Contenido vaciado.");
    }

    public static void main(String[] args) {
        Alcancia alcancia = new Alcancia();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Agregar moneda");
            System.out.println("2. Contar monedas");
            System.out.println("3. Calcular total");
            System.out.println("4. Romper alcancía");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese la denominación de la moneda: ");
                    int denominacion = scanner.nextInt();
                    alcancia.agregarMoneda(denominacion);
                    break;
                case 2:
                    alcancia.contarMonedas();
                    break;
                case 3:
                    alcancia.calcularTotal();
                    break;
                case 4:
                    alcancia.romperAlcancia();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
         }
    }
}