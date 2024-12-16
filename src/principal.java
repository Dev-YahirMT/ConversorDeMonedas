import java.util.Scanner;

public class principal {
    private static final Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {
        int opcion;

        do {

            opcion = modulos.menu();

            modulos.opciones(opcion);

        }while(opcion != 9);

        lectura.close();
    }
}
