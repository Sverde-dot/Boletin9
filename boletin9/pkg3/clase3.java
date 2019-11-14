package boletin9.pkg3;

import java.util.Scanner;

public class clase3 {
    private int bas;
    private int alt;
    Scanner sc=new Scanner(System.in);

    public int pedirBas(){
        System.out.println("Inserte la Base.");
        bas=sc.nextInt();
        return bas;  
}
    public int pedirAlt(){
        System.out.println("Inserte la altura.");
        bas=sc.nextInt();
        return bas;  
}
    public void calcularA(){
        do{
        System.out.println("La area es "+(bas+alt)/2);
        }while(bas>=1 && alt>=1); 
    }
}
