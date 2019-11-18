
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
        pedirBas();
    }while (bas<=0);
    do{
    pedirAlt();
    }while (alt<=0);
    System.out.println("O valor do área é: "+bas*alt);
    }
}
