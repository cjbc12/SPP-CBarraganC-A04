
package spp.cbarraganc.a04;
import java.util.Scanner;
/**
 *
 * @author Carlos Javier Barragán Carrión
 * A01410357
 * IMT
 */
public class SPPCBarraganCA04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //Variables
    Scanner kb = new Scanner(System.in);
    double anTan, anSen, anCos, anRad, ángulo;
    int opEntrada;
    //Menú
        System.out.println("¡Bienvenido a la calculadora de ángulos!");
        System.out.println("1. Calcular Tangente.");
        System.out.println("2. Calcular Seno.");
        System.out.println("3. Calcular Coseno.");
        System.out.println("4. Salir.");
        opEntrada = kb.nextInt();
        
        switch(opEntrada){
            case 1:
                System.out.println("Introducir angulo deseado:");
                Scanner angle = new Scanner(System.in);
                ángulo = angle.nextDouble();
                anRad = Math.toRadians(ángulo);
                anTan = Math.tan(anRad);
                System.out.println("La tangente de " + ángulo + " es " + anTan);
                break;
                
            case 2:
                System.out.println("Introducir angulo deseado:");
                Scanner angle2 = new Scanner(System.in);
                ángulo = angle2.nextDouble();
                anRad = Math.toRadians(ángulo);
                anSen = Math.sin(anRad);
                System.out.println("El seno de " + ángulo + " es " + anSen);
                break;
                
            case 3:     
                System.out.println("Introducir angulo deseado:");
                Scanner angle3 = new Scanner(System.in);
                ángulo = angle3.nextDouble();
                anRad = Math.toRadians(ángulo);
                anCos = Math.cos(anRad);
                System.out.println("El coseno de " + ángulo + " es " + anCos);
                break;
            default:
                System.out.println("¡Hasta la vista baby!");
        }
    }
}