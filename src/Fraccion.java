package src;
import java.util.Scanner;

public class Fraccion {
    //Variables globales de clase
    int numerador, denominador;
    Scanner sc = new Scanner(System.in);

    public Fraccion (int num, int den){
        /*
        //Variables locales del objeto 
        System.out.print("Ingrese el numerador: ");
        numerador=sc.nextInt();
        */
        numerador=num;
        /*
        System.out.print("Ingrese el denominador: ");
        denominador=sc.nextInt();
        */
        denominador=den;
    }
    
    public int getNumerador(){
        return numerador;
    }
    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }
    public int getDenominador(){
        return denominador;
    }
    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    //Metodo de Suma
    public Fraccion sumar(Fraccion f1){
        try{
        Fraccion aux = new Fraccion(numerador*f1.denominador+denominador*f1.numerador, denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public Fraccion restar(Fraccion f1){
        try{
        Fraccion aux = new Fraccion(numerador*f1.denominador-(denominador*f1.numerador), denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }
    }
    
    public Fraccion multiplicar(Fraccion f1){
        try{
        Fraccion aux = new Fraccion(numerador*f1.numerador, denominador*f1.denominador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }        
    }
    
    public Fraccion dividir(Fraccion f1){
        try{
        Fraccion aux = new Fraccion(numerador*f1.denominador, denominador*f1.numerador);
        aux.simplificar();
        return aux;
        }catch(Exception ex){
            System.out.println(ex);
            return null;
        }          
    }
    
    public int mcd(){
        int num=numerador, den=denominador;
        
        if(num==0){
            return 1;
        }
        else{    
            if(num<0){
                num = num * -1; //-2 2
            }
            if(den<0){
                den = den * -1; //-2 2
            }
            if(den>num){
                int aux = num;
                num=den;
                den=aux;
            }
            
            int mcd=1;
                                     /* 4/8  8/4  */
            while(den!=0){    
                mcd=den;   //4 
                den = num % den; // 
                num = mcd;  // 4
            }
            return mcd;
        }
    }
    
    public void simplificar(){
        int mcd = mcd();
        numerador = numerador / mcd;
        denominador = denominador / mcd;     

        //-1/-2  1/2
        if(numerador<0 && denominador<0){
            numerador=numerador*-1;         
            denominador=denominador*-1;            
        }
        else if (numerador>=0 && denominador<0){
            //1/-2  -1/2
            numerador=numerador*-1;         
            denominador=denominador*-1;              
        }
    }
    
    @Override
    public String toString(){
        
        if(denominador!=0){    
                simplificar();
                if(denominador!=1){        
                    return numerador+"/"+denominador;
                }
                else{
                    return numerador+"";
                }
        }
        else{    
            return "El denominador debe ser distinto de 0";
        }
    }
}
