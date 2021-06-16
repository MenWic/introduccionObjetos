package src;
import java.util.Scanner;

public class Contador1 {
    //variables globales de clase
    private int num;


    //Constructor dafult
    public Contador1(){
        //Atributos globales de contador default
        this.num = 0;
    }
    //Constructor con parametros
    public Contador1(int num){
        this.num = num;
    }
    //Constructor copia
    public Contador1(Contador1 cont){
        this.num = cont.num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Contador1 cont1 = new Contador1();
        System.out.print("Ingrese un valor para el contador: ");
        int inicial = sc.nextInt();
        Contador1 cont2 = new Contador1(inicial);
        Contador1 cont3 = new Contador1(cont2.num);

        cont2.incremento();
        System.out.println("El contador incremento a: " + cont2.getNum());
        cont2.decremento();
        System.out.println("El contador decremento a: " + cont2.getNum());
    }

    //Metodo get num
    public int getNum() {
        return this.num;
    }
    //Metodo establecer num
    public void setNum(int num) {
        this.num = num;
    }
    //Metodo incremento
    public void incremento(){
        num++;
    }
    //Metodo Decrementar contador
    public void decremento(){
        num--;
    }    
}
