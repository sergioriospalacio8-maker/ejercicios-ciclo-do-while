import java.util.Scanner;
public class Ejemplo1 {
    public static void main(String[] args){

        //En un sistema de inicio de sesión, el usuario debe ingresar la contraseña correcta. El programa seguirá solicitándola hasta que escriba 1234.

        Scanner sc = new Scanner(System.in);

        int contraseña;

        do {
            System.out.print("Ingrese la contraseña: ");
            contraseña = sc.nextInt();

            if (contraseña != 1234) {
                System.out.println("Contraseña incorrecta.");
            }

        } while (contraseña != 1234);

        System.out.println("Acceso concedido.");

    }
}
