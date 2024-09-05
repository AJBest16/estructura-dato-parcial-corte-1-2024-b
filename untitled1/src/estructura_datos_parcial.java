import java.util.Scanner;

public class estructura_datos_parcial {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            try {
                ////////////////////////// Leer datos///////////////////////////
                System.out.print("Ingrese su nombre: ");
                String nCliente = scanner.nextLine();

                System.out.print("Ingrese nombre del producto: ");
                String nProducto = scanner.nextLine();

                System.out.print("Ingrese el valor unitario del producto: ");
                double valorU = scanner.nextDouble();

                System.out.print("Ingrese la cantidad de unidades: ");
                int cantidad = scanner.nextInt();

                // Validar los datos
                if (valorU <= 0 || cantidad < 0) {
                    System.out.println("Error en la entrada de datos");
                    return;
                }

                ////////////operaciones//////////////////
                double valorB = valorU * cantidad;
                double porcentajeDescuento = 0;
                if (cantidad >= 20) {
                    porcentajeDescuento = 0.07; // 7%
                } else if (cantidad >= 10) {
                    porcentajeDescuento = 0.05; // 5%
                }
                double valorDescuento = valorB * porcentajeDescuento;
                double valorNeto = valorB - valorDescuento;

                ///////////////// resultados/////////////////
                System.out.printf("Nombre del Cliente: %s%n", nCliente);
                System.out.printf("Nombre del Producto: %s%n", nProducto);
                System.out.printf("Valor Unitario: %.2f%n", valorU);
                System.out.printf("Cantidad: %d%n", cantidad);
                System.out.printf("Valor Bruto: %.2f%n", valorB);
                System.out.printf("Valor Descuento: %.2f%n", valorDescuento);
                System.out.printf("Valor Neto: %.2f%n", valorNeto);

            } catch (Exception e) {
            } finally {

            }
        }
    }