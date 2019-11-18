
package ejercicio.pkg9.pkg5;

import java.util.Scanner;

public class SecionC {

   private int num;
   Scanner sc = new Scanner(System.in); 
   public void pedirInt(){
    System.out.println("Introduce el numero");
    num=sc.nextInt();
    }
    public void sucesionC(){
    pedirInt();
    int acuA,acuB=1,acuC=0;
    int cont;int acu1=0;
    for (cont=0;cont<num;cont++){
    acuA=acuB;
    acuB=acuC;
    acuC=acuA+acuB;
    System.out.println(acuC);
    }
    System.out.println("Fin serie c");
    }

}
