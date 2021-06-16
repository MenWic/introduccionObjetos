package src;
import java.util.Scanner;

public class MainFraccion {
    //int num, den;
    Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("\n*** Fraccion 1 ***\n");
        System.out.print("Ingrese el numerador: ");
        //num = sc.nextInt(); Desarrollar metodo de ingreso de num y denom de fracciones pendiente
        System.out.print("Ingrese el denominador: ");
        System.out.println("\n");
        System.out.println("\n*** Fraccion 2 ***\n");
        System.out.print("Ingrese el numerador: ");
        //num = sc.nextInt(); Desarrollar metodo de ingreso de num y denom de fracciones pendiente
        System.out.print("Ingrese el denominador: ");
        System.out.println("\n");

        //Cambiar num, den de Fraccion1 y num, den de Fraccion2
        Fraccion F1 = new Fraccion(1, 2);
        Fraccion F2 = new Fraccion(-3, 2);
        
        System.out.println("***Suma de Fracciones***");
        System.out.println(F1.sumar(F2)+"\n");   
        System.out.println("***Resta de Fracciones***");
        System.out.println(F1.restar(F2)+"\n");   
        System.out.println("***Multiplicacion de Fracciones***");
        System.out.println(F1.multiplicar(F2)+"\n");   
        System.out.println("***Division de Fracciones***");
        System.out.println(F1.dividir(F2)+"\n");   
    }
}
