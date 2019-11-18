
package ejercicio.pkg9.pkg5;
import java.util.Scanner;


public class SecionA {
   private int num;
   Scanner sc = new Scanner(System.in); 
   public void pedirInt(){
    System.out.println("Introduce el numero");
    num=sc.nextInt();
    }
    public void sucesionA(){
    pedirInt();
    int cont;int acu1=0;
    for(cont=0;cont<num;cont++){
    acu1=acu1+2;
    System.out.println(acu1);
    }
    System.out.println("Fin de la cita a");
    }
}
