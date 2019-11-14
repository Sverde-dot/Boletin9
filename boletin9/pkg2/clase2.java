package boletin9.pkg2;

import java.util.Scanner;


public class clase2 {
    private int num1;
    private int num2;

    Scanner sc=new Scanner(System.in);
    
    public void verDatos(){
        System.out.println("Inserte el primer valor numérico entero.");
         num1=sc.nextInt();
        System.out.println("Inserte el segundo valor numérico entero.");
         num2=sc.nextInt();
        while((num1<90&&num1>10)&&(num2<90&&num2>10)){
            System.out.println("El valor es incorecto");    
         System.out.println("Vuelve a insertar el primer valor");
         num1=sc.nextInt();
         System.out.println("Vuelve a insertar el segundo valor");
         num2=sc.nextInt();
        
        }
         System.out.println("El producto sera "+(num1%num2));
    }
    
}

