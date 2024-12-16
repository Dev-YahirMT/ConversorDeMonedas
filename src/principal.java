import java.util.Scanner;

public class principal {
    private static final Scanner lectura = new Scanner(System.in);

    public static void main(String[] args) {

        int opcion = 0;

        do {

            System.out.println("**************-----**************");
            System.out.println("Sea bienvenido/a al conversor de monedas");
            System.out.println("1) Dolar(USD) => Peso Argentino(ARS)");
            System.out.println("2) Peso Argentino(ARS) => Dolar(USD)");
            System.out.println("3) Dolar(USD) => Real Brasileño(BRL)");
            System.out.println("4) Real Brasileno(BRL) => Dolar(USD)");
            System.out.println("5) Dolar(USD) => Peso Colombiano(CLP)");
            System.out.println("6) Peso Colombiano(CLP) => Dolar(USD)");
            System.out.println("7) Peso Méxicano(MXN) => Dolar(USD)");
            System.out.println("8) Dolar(USD) => Peso Méxicano(MXN)");
            System.out.println("9) Salir");
            System.out.println("Elija una opcion valida:");
            opcion = lectura.nextInt();

            switch (opcion){
                case 1:
                    realizarConversion("USD", "ARS");
                    break;
                case 2:
                    realizarConversion("ARS", "USD");
                    break;
                case 3:
                    realizarConversion("USD", "BRL");
                    break;
                case 4:
                    realizarConversion("BRL", "USD");
                    break;
                case 5:
                    realizarConversion("USD", "COP");
                    break;
                case 6:
                    realizarConversion("COP", "USD");
                    break;
                case 7:
                    realizarConversion("MXN", "USD");
                    break;
                case 8:
                    realizarConversion("USD", "MXN");
                    break;
                case 9:
                    System.out.println("Gracias por utilizar el conversor de monedas.");
                    break;
                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
            }
        }while(opcion != 9);
        lectura.close();
    }

    public static void realizarConversion(String modenaOrigen, String monedaDestino){
        consultaApi consulta = new consultaApi();

        try{

            System.out.println("Ingrese la cantidad a convertir:");
            double cantidad = lectura.nextDouble();
            lectura.nextLine();

            datosConsulta conversionResApi = consulta.conversion(modenaOrigen,monedaDestino,cantidad);

            conversion resultado = new conversion(conversionResApi);
            resultado.setMount(cantidad);

            System.out.println(resultado);
            System.out.println("Presione Enter para continuar:");
            lectura.nextLine();

        }catch (Exception e){
            System.out.println("Error al realizar la conversión: " + e.getMessage());
        }

    }
}
