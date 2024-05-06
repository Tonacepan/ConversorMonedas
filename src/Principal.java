import java.io.Console;
import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);
        ConsultaMoneda conversion = new ConsultaMoneda();
        int op = 0;
        float monto;
        String base = "", target = "";

        while (op != 7) {
            System.out.println("Basado en el siguiente menú escoge una opción:" +
                    "\n1. Peso Méxicano a Dolar." +
                    "\n2. Dolar a Peso a Peso Mexicano." +
                    "\n3. Peso argentino a Peso Méxicano." +
                    "\n4. Peso Mexicano a Peso argentino." +
                    "\n5. Peso Argentino a Peso Colombiano." +
                    "\n6. Peso Colombiano a Peso Argentino." +
                    "\n7. Salir.");

            op = t.nextInt();
            switch (op) {
                case 1:{
                    base = "MXN";
                    target = "USD";
                }break;
                case 2:{
                    base = "USD";
                    target = "MXN";
                }break;
                case 3:{
                    base = "ARS";
                    target = "MXN";
                }break;
                case 4:{
                    base = "MXN";
                    target = "ARS";
                }break;
                case 5:{
                    base = "ARS";
                    target = "COP";
                }break;
                case 6:{
                    base = "COP";
                    target = "ARS";
                }
                break;

                case 7:
                    System.out.println("Gracias por convertir monedas.");
                    System.exit(1);
                    break;
            }
            System.out.println("Ingrese el monto a convertir: ");
            monto = t.nextFloat();
            try {
                Moneda moneda = conversion.buscarmoneda(base, target, monto);
                System.out.println(moneda.imprimir() + "\n\n");
                Generador generador = new Generador();
                generador.generararchivo(moneda);

            } catch (RuntimeException e) {
                System.out.println("Opción no valida");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("El programa ha terminado.");

    }
}
