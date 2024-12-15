    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caféexpressuni;

import java.util.Scanner;

public class CafeExpressUNI {
    static int clientesAtendidos = 0;
    static int CafePequeno = 0;
    static int CafeMediano = 0;
    static int CafeGrande = 0;
    static double totalCaja = 0;

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        while (true) {
            System.out.println("=== MENU DE CAFE ===");
            System.out.println("Holi, buenos dias! Que tamano de cafe desea?");
            System.out.println("1. Pequeno (Lps. 45)");
            System.out.println("2. Mediano (Lps. 56)");
            System.out.println("3. Grande  (Lps. 65)");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opcion: ");
            int opcionCafe = entrada.nextInt();

            double precioCafe = 0;
            switch (opcionCafe) {
                case 1:
                    precioCafe = 45;
                    CafePequeno++;
                    break;
                case 2:
                    precioCafe = 56;
                    CafeMediano++;
                    break;
                case 3:
                    precioCafe = 65;
                    CafeGrande++;
                    break;
                case 4:
                    PLANILLA();
                    return; 
                default:
                    System.out.println("Opcion no valida. Intente de nuevo.");
                    continue;
            }

            entrada.nextLine();
            

            System.out.println("Desea agregar algun extra? (S/N)");
            String respuesta = entrada.nextLine().toLowerCase();
            
           

            int precioAgregado = 0;
            if (respuesta.equals("s")) {
                System.out.println("=== MENU DE AGREGADOS ===");
                System.out.println("1. Leche   (+Lps. 5)");
                System.out.println("2. Cremora (+Lps. 8)");
                System.out.println("3. Sencillo(+Lps. 0)");
                System.out.print("Seleccione una opcion: ");
                int opcionAgregar = entrada.nextInt();

                switch (opcionAgregar) {
                    case 1:
                        precioAgregado = 5;
                        break;
                    case 2:
                        precioAgregado = 8;
                        break;
                    case 3:
                        precioAgregado = 0;
                        break;
                    default:
                        System.out.println("Opcion no valida.");
                }
            }
          
            
            System.out.print("Ingrese su edad: ");
            int edad = entrada.nextInt();

            double totalCompra = precioCafe + precioAgregado;
            if (edad > 18) {
                totalCompra *= 0.50;
            }

            System.out.println("Su total a pagar es de:" + totalCompra);
            System.out.println("\n");

            clientesAtendidos++;
            totalCaja += totalCompra;
        }
    }

    public static void PLANILLA() {
        System.out.println("\n=== DATOS ===");
        System.out.println("Clientes atendidos: " + clientesAtendidos);
        System.out.println("**Cafes vendidos**");
        System.out.println("  Pequenos: " + CafePequeno);
        System.out.println("  Medianos: " + CafeMediano);
        System.out.println("  Grandes: " + CafeGrande);
        System.out.println("Total en caja: "+ totalCaja);
        System.out.println("Gracias por visitar nuestro cafe... vuelva pronto!");
    }
}