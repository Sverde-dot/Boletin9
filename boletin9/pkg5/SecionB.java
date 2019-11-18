import java.util.Scanner;


public class SecionB {
   private int num;
   Scanner sc = new Scanner(System.in); 
   public void pedirInt(){
    System.out.println("Introduce el numero");
    num=sc.nextInt();
    }
    public void sucesionB(){
        int cont;
        int acul=0;

    for (cont=0;cont<num;cont++){
        if(acul>0)
        acul=(acul+1)*(-1);
        else{
        acul=(acul-1)*(-1);}    
        System.out.println(acul);
        System.out.println("Fin serie b");
    }
}
}