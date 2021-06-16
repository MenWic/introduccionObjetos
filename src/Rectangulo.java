package src;
import java.util.Scanner;

public class Rectangulo{

	private double a;
	private double h;
	private double area;
	private double perimetro;

    public Rectangulo(double a, double h){
		this.a=a;
		this.h=h;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double a;
		double h;

		System.out.print("Ingrese la altura del Rectangulo: ");
		h=sc.nextInt();
		System.out.print("Ingrese el ancho del Rectangulo: ");
		a=sc.nextInt();
		Rectangulo rect = new Rectangulo(a,h);
		if (a!=h) {
			rect.calcularArea();
			rect.calcularPerimetro();
			rect.mostrarDatos();	
		} else {
			System.out.println("****** Error, Altura y ancho no pueden ser iguales *****");
		}
	}

	public double getAncho(){
		return a;
	}
	public void setAncho(double a){
		this.a=a;
	}
	public double getAlto(){
		return h;
	}
	public void setAlto(double h){
		this.h=h;
	}

	public double calcularArea(){
		area=a*h;
		return area;
	}
	public double calcularPerimetro(){
		perimetro=2*h+2*a;
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
