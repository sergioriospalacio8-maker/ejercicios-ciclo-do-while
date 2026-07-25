import java.util.Scanner;
public class Ejemplo5 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        double nota;
        double suma = 0;
        int cantidad = 0;

        do {

            System.out.print("Ingrese una nota (-1 para terminar): ");
            nota = sc.nextDouble();

            if (nota != -1) {
                suma += nota;
                cantidad++;
            }

        } while (nota != -1);

        if (cantidad > 0) {
            System.out.println("Promedio: " + (suma / cantidad));
        } else {
            System.out.println("No se ingresaron notas.");
        }

    }
}
