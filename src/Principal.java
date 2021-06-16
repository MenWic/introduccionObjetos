package src;
import org.w3c.dom.css.Rect;

import src.Contador1;
import src.Cuadrado;
import src.Circulo;
import src.Rectangulo;
import src.Libro;
import src.Fraccion;

public class Principal {
    public static void main(String[] args){
        Principal principal = new Principal();
        }

        // Llamadas a todos los objetos de los ejercicio 1 al 7
        public Principal(){

        Contador1 cont1 = new Contador1(1); //primera variable
        Contador1 cont2 = cont1; //segunda variable apunta al mismo objeto

        Cuadrado cuad1 = new Cuadrado(3); //primera variable
        Cuadrado cuad2 = cuad1; //segunda variable apunta al mismo objeto
        
        Circulo circ1 = new Circulo(5);
        Circulo circ2 = circ1;

        Rectangulo rect1 = new Rectangulo(7, 14);
        Rectangulo rect2 = rect1;

        Libro lib1 = new Libro("Matilda","Roal Dahl", 9, 0);
        Libro lib2 = lib1;

        Fraccion F1 = new Fraccion(11, 22);
        Fraccion frac1 = F1;
        Fraccion F2 = new Fraccion(13, 26);
        Fraccion frac2 = F2;

        System.out.println("***CONTADOR***");
        System.out.println("El contador inicial es: "+cont1.getNum());
        cont2.setNum(2); //con la segunda variable modificamos los datos
        System.out.println("El contador establecido es: "+cont1.getNum()); //con la primera variable imprimimos los datos
        cont2.incremento();
        System.out.println("El contador incremento a: " + cont1.getNum());
        cont2.decremento();
        System.out.println("El contador decremento a: " + cont1.getNum()+"\n");


        System.out.println("***CUADRADO***");
        System.out.println("El lado inicial es: "+cuad1.getLado());
        cuad2.setLado(4); //con la segunda variable modificamos los datos
        System.out.println("El lado establecido es: "+cuad1.getLado());
        //con la primera variable imprimimos los datos
        cuad1.area();
        System.out.println("Area del cuadrado:"+cuad1.getArea());
        cuad1.perimetro();
        System.out.println("Perimetro del cuadrado:"+cuad1.getPerimetro()+"\n");
        //Demostramos que las dos variables apuntan al mismo objeto


        System.out.println("***CIRCULO***");
        System.out.println("El radio inicial es: "+circ1.getR());
        circ2.setR(6);
        System.out.println("El lado establecido es: "+circ1.getR());
        circ1.calcularArea();
        System.out.println("Area del cirulo:"+circ1.getArea());
        circ1.calcularPerimetro();
        System.out.println("Area del circulo:"+circ1.getPerimetro()+"\n");


        System.out.println("***RECTANGULO***");
        System.out.println("El ancho inicial es: "+rect1.getAncho());
        rect2.setAncho(8);
        System.out.println("La altura inicial es: "+rect1.getAlto());
        rect2.setAlto(16);
        System.out.println("El ancho establecido es: "+rect1.getAncho());
        System.out.println("La altura establecida es: "+rect1.getAlto());
        rect1.calcularArea();
        System.out.println("Area del Rectangulo: "+rect1.getArea());
        rect1.calcularPerimetro();
        System.out.println("Area del Rectangulo: "+rect1.getPerimetro()+"\n");


        System.out.println("***LIBRO***");
        System.out.println("El nombre inicial es: "+lib1.getNombre());
        System.out.println("El autor inicial es: "+lib1.getAutor());
        System.out.println("Cantidad de ejemplares inicial: "+lib1.getEjemplares());
        System.out.println("Cantidad de prestamos inicial: "+lib1.getPrestados());
        lib1.prestamo();
        System.out.println("\nLibro prestado exitosamente\n");
        lib2.mostrarDatos();
        lib2.setNombre("Pinocho");
        lib2.setAutor("Carlo Collodi");
        lib2.setEjemplares(10);
        lib2.setPrestados(4);
        System.out.println("\nEl nombre establecido es: "+lib1.getNombre());
        System.out.println("El autor establecido es: "+lib1.getAutor());
        System.out.println("Cantidad de ejemplares estbalecida: "+lib1.getEjemplares());
        System.out.println("Cantidad de prestamos establecida: "+lib1.getPrestados());
        lib2.mostrarDatos();
        lib1.devolucion();
        System.out.println("Libro devuelto exitosamente"+"\n");
        lib2.mostrarDatos();


        System.out.println("\n***OPERACIONES FRACCIONARIAS***");
        System.out.println("--- Fraccion 1 ---");
        System.out.println("El numerador inicial es: "+F1.getNumerador());
        System.out.println("El denominador inicial es: "+F1.getDenominador());
        System.out.println("--- Fraccion 2 ---");
        System.out.println("El numerador inicial es: "+F2.getNumerador());
        System.out.println("El denominador inicial es: "+F2.getDenominador()+"\n");
        System.out.println("* Suma de Fracciones *");
        System.out.println(F1.sumar(F2)+"\n");   
        System.out.println("***Resta de Fracciones***");
        System.out.println(F1.restar(F2)+"\n");   
        System.out.println("***Multiplicacion de Fracciones***");
        System.out.println(F1.multiplicar(F2)+"\n");   
        System.out.println("***Division de Fracciones***");
        System.out.println(F1.dividir(F2)+"\n"); 
        frac1.setNumerador(12);
        frac1.setDenominador(16);
        frac2.setNumerador(14);
        frac2.setDenominador(18);
        System.out.println("--- Fraccion 1 ---");
        System.out.println("El numerador establecido es: "+F1.getNumerador());
        System.out.println("El denominador establecido es: "+F1.getDenominador());
        System.out.println("--- Fraccion 2 ---");
        System.out.println("El numerador establecido es: "+F2.getNumerador());
        System.out.println("El denominador establecido es: "+F2.getDenominador()+"\n");
        System.out.println("* Suma de Fracciones *");
        System.out.println(F1.sumar(F2)+"\n");   
        System.out.println("***Resta de Fracciones***");
        System.out.println(F1.restar(F2)+"\n");   
        System.out.println("***Multiplicacion de Fracciones***");
        System.out.println(F1.multiplicar(F2)+"\n");   
        System.out.println("***Division de Fracciones***");
        System.out.println(F1.dividir(F2)+"\n"); 
    }
}
