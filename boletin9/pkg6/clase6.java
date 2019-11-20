
package boletin9.pkg6;
import java.util.Scanner;
public class clase6 {
 private int num;
 private int cont=0;
 private int Trab1=0;
 private float Trab2=0;
Scanner sc = new Scanner(System.in);

public void pedirInt(){
System.out.println("Introduce o soldo do empleado");
num=sc.nextInt();
}
public void calcular(){

do{ 
pedirInt();
if(num>=1000 && num<=1750)
Trab1++;    
else if (num<1000 && num>0)
Trab2++;
if (num!=0)
cont++;
}while(num!=0);
if (cont!=0){
System.out.println("Los empleados con un sueldo entre 1000 y 1750 y : "+Trab1
+"\nLa porcentaje de empleados con sueldo inferior a 1000es: "+(Trab2/cont)*100);
}
System.out.println("Fin de la cita");
}        
        
}
