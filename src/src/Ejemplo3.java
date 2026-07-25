import java.util.Scanner;
public class Ejemplo3 {
    public static void main(String[] args){
        
        //En una estación meteorológica se registran temperaturas.
        // El programa solicitará temperaturas hasta que el usuario escriba 999, valor que indica finalizar el registro.

        Scanner sc = new Scanner(System.in);

        double temperatura;

        do {
            System.out.print("Ingrese una temperatura (999 para terminar): ");
            temperatura = sc.nextDouble();

            if (temperatura != 999) {
                System.out.println("Temperatura registrada.");
            }

        } while (temperatura != 999);

        System.out.println("Fin del registro.");
    }
}
