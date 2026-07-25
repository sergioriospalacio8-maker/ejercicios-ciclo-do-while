import java.util.Scanner;
public class Ejemplo2 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int saldo = 500000;
        int retiro;

        do {
            System.out.println("\nSaldo disponible: $" + saldo);
            System.out.print("Ingrese el valor a retirar (0 para salir): ");
            retiro = sc.nextInt();

            if (retiro > 0 && retiro <= saldo) {
                saldo -= retiro;
                System.out.println("Retiro realizado.");
            } else if (retiro > saldo) {
                System.out.println("Saldo insuficiente.");
            }

        } while (retiro != 0);

        System.out.println("Gracias por usar el cajero.");
    }

}
