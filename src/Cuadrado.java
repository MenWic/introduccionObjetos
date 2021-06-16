package src;
import java.util.Scanner;

public class Cuadrado{
	
	private double lado;
	private double area;
	private double perimetro;

	public static void main(String[] args) {

		Scanner scanner=new Scanner(System.in);
		double lado;

		System.out.print("Ingrese un lado del cuadrado: ");
		lado=scanner.nextInt();
		Cuadrado cuad=new Cuadrado(lado);
		cuad.perimetro();
		cuad.area();
		cuad.mostrarDatos();
	}

	public Cuadrado(double lado){
		this.lado=lado;
	}

	public double getLado(){
		return lado;
	}
	public void setLado(double lado){
		this.lado=lado;
	}

	public double area(){
		area=lado*2;
		return area;
	}
	public double perimetro(){
		perimetro=4*lado;
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
		System.out.println("El area es: "+getArea()+" u²");
		System.out.println("El perimetro es: "+getPerimetro()+" u");
	}
}