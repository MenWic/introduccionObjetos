package src;
import java.util.Scanner;

public class Libro {
    private String nombre;
	private String autor;
	private int prestados;
	private int ejemplares;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String nombre;
       	String autor;
        int ejemplares;

        System.out.println("***Gestor de Libro***");
		Libro libro1 = new Libro("Pinocho","Carlo Collodi", 1, 0);
		
		Libro libro2=new Libro();
		System.out.print("Introduce titulo: ");
        nombre = sc.nextLine();
        System.out.print("Introduce autor: ");
        autor = sc.nextLine();
        System.out.print("Numero de ejemplares: ");
        ejemplares = sc.nextInt();
        libro2.setNombre(nombre);
        libro2.setAutor(autor);
        libro2.setEjemplares(ejemplares);
		
       	if (libro1.prestamo()) {
      		System.out.println("Se ha prestado el libro " + libro1.getNombre());
       	} else {
       		System.out.println("No quedan ejemplares del libro " + libro1.getNombre() + " para prestar");         
       	}
	
       	if (libro1.devolucion()) {
       		System.out.println("Se ha devuelto el libro " + libro1.getNombre());
       	} else {
      		System.out.println("No hay ejemplares del libro " + libro1.getNombre() + " prestados");
       	}
	}

	public Libro(){
	}

	public Libro(String titulo, String autor, int ejemplares, int prestados){
		this.nombre = titulo;
        this.autor = autor;
        this.ejemplares = ejemplares;
        this.prestados = prestados;
	}

	public String getNombre() {
        return nombre;
   	}
    public String getAutor() {
        	return autor;
    }
    public int getPrestados() {
        return prestados;
    }
    public int getEjemplares(){
    	return ejemplares;
    }
    public void setPrestados(int prestados) {
    	this.prestados = prestados;
    }
    public void setNombre(String nombre){
    	this.nombre=nombre;
    }
    public void setAutor(String autor) {
    	this.autor = autor;
    }
    public void setEjemplares(int ejemplares){
    	this.ejemplares=ejemplares;
    }

    public boolean prestamo() {
    	boolean prestado = true;
    	if (prestados < ejemplares) {
            prestados++;
	    }
        else {
	        prestado = false;
        }
    	return prestado;
    	}

	public boolean devolucion() {
	    boolean devuelto = true;
	    if (prestados == 0) {
	        devuelto = false;
        } else {
            prestados--;
        }
        return devuelto;
	}
	
	public void mostrarDatos(){
		System.out.println("Libro:");
        System.out.println("Titulo: " + getNombre());
       	System.out.println("Autor: " + getAutor());
       	System.out.println("Ejemplares: " + getEjemplares());
       	System.out.println("Prestados: " + getPrestados());	
	}
}
