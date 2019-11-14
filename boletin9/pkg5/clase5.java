
package boletin9.pkg5;

import java.util.Scanner;

public class clase5 {
    private int num;
    private int con=0;
    private int c;
    Scanner sc=new Scanner(System.in);
    
    public int pedirDato(){
        System.out.println("Inserte un valor numérico entero.");
        con=sc.nextInt();
        return con;
}
    public void verDatos(){
        for(con=0;con==10;con++){
        System.out.println("La suma es "+con);
        con=con+c;
        c++;
    }
        System.out.println("Acabo");
    }
}
