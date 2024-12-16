import java.time.LocalDateTime;
import java.util.Scanner;

public class principal {
    private static final Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        LocalDateTime ahora = LocalDateTime.now();
        System.out.println("Fecha y hora actual: " + ahora);

        do {

            opcion = modulos.menu();

            modulos.opciones(opcion);

        }while(opcion != 9);

        lectura.close();
    }
}
