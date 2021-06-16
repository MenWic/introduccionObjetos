package src;

import java.util.Scanner;
import java.lang.Math;

public class Circulo {
    double r;
    private double area;
	private double perimetro;
    

    public Circulo(double r){
        this.r = r;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r;

        System.out.print("Ingrese el radio del circulo: ");
		r=sc.nextDouble();
        Circulo circ = new Circulo(r);

        circ.calcularArea();
        circ.calcularPerimetro();
        circ.mostrarDatos();
    }

    public double getR() {
        return r;
    }
    public void setR(double r) {
        this.r = r;
    }

    public double calcularArea(){
		area = (Math.PI) * r * r;
		return area;
	}
	public double calcularPerimetro(){
		perimetro= 2 * (Math.PI) * r;
		return perimetro;
    }
    
    public double getArea() {
        return area;
    }
    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    public void mostrarDatos(){
		System.out.println("El Area es: "+getArea()+" u²");
		System.out.println("El Perimetro es: "+getPerimetro()+" u");	
	}
}
