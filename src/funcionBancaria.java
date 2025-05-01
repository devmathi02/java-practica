import java.sql.SQLOutput;
import java.util.Scanner;

public class funcionBancaria {
    public static void main(String[] args) {
        //variables definidas
        String nombreCliente = "Allison Chavez";
        String tipoDeCuenta = "Debito";
        double saldoDisponible = 5300.59;
        String menu = """
                *** Digite el número de operación deseada ***
                1 - Consultar Saldo.
                2 - Retirar monto.
                3 - Depositar monto.
                4 - Salir.
                """;
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        //información inicial del cliente
        System.out.println("========================================");
        System.out.println("\nCliente: " + nombreCliente);
        System.out.println("Tipo de Cuenta: " + tipoDeCuenta);
        System.out.println("Saldo disponible: S/." + saldoDisponible);
        System.out.println("\n========================================\n");

        //logica de la funcion
        while (opcion != 4){
            System.out.println(menu);
            opcion = teclado.nextInt();

            switch (opcion){
                case 1 :
                    System.out.println("El saldo actual es de: S/." + saldoDisponible);
                    break;

                case 2 :
                    System.out.println("Cuanto es el monto que desea retirar?");
                    double montoRetirado = teclado.nextDouble();
                    if (montoRetirado > saldoDisponible){
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldoDisponible = saldoDisponible - montoRetirado;
                        System.out.println("El saldo actualizado es: S/." + saldoDisponible);
                    }
                    break;

                case 3 :
                    System.out.println("Cuanto es el monto que desea depositar?");
                    double montoDespositado = teclado.nextDouble();
                    saldoDisponible += montoDespositado;
                    System.out.println("El saldo actualizado es: S/." + saldoDisponible);
                    break;

                case 4 :
                    System.out.println("Gracias " + nombreCliente +" por usar nuestro software,vuelva pronto...");
                    break;

                default:
                    System.out.println("Opcion no valida");
            }
        }
    }
}
