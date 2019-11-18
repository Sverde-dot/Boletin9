
package boletin9.pkg1;

import java.util.Scanner;


public class clase1 {
    private int num;
    private int con = 0;
    private int c=0;
    Scanner sc=new Scanner(System.in);
    
    public int pedirDatos(){
        System.out.println("Inserte un valor numérico entero.");
        num=sc.nextInt();
        return num;
    }
    public void verDatos(){
        int contCeros=0,contPos=0,contNeg=0;
        do{
        num=pedirDatos();
        
        if(num>0){
            System.out.println("El numero es positivo");
            contPos++;
        }
        if(num==0){
            System.out.println("El numero es cero");
            contCeros++;
        }
        if(num<0){
            System.out.println("El b¡numero es negativo");
            contNeg++;
        }
        c++;
        System.out.println(num);
        }while(c<10);
        System.out.println("ACABO");
        System.out.println("Numero de ceros: "+contCeros
                        +"\nNumeros positivos: "+contPos
                        +"\nNumeros negativos: "+contNeg);
}
}



