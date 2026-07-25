import java.util.Scanner;
public class Ejemplo4 {
    public static void main(String[] args){

        //Diseñe un menú para una aplicación donde el usuario pueda seleccionar diferentes opciones.
        // El menú deberá repetirse hasta que el usuario elija la opción 4 (Salir).

        Scanner sc = new Scanner(System.in);

        int opcion;

        do {

            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Ver perfil");
            System.out.println("2. Configuración");
            System.out.println("3. Ayuda");
            System.out.println("4. Salir");

            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    System.out.println("Mostrando perfil...");
                    break;

                case 2:
                    System.out.println("Abriendo configuración...");
                    break;

                case 3:
                    System.out.println("Mostrando ayuda...");
                    break;

                case 4:
                    System.out.println("Saliendo...");
                    break;

                default:
                    System.out.println("Opción inválida.");

            }

        } while (opcion != 4);

    }
}
