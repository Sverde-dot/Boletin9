
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
        do{
        num=pedirDatos();
        
        if(num>0){
            System.out.println("El numero es positivo");
        }
        if(num==0){
            System.out.println("El numero es cero");
        }
        if(num<0){
            System.out.println("El b¡numero es negativo");
        }
        c++;
        System.out.println(num);
        }while(c<9);
        System.out.println("ACABO");
}
}



