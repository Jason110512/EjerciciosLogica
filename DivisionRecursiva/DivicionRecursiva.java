import java.util.Scanner;
class DivicionRecursiva {   
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        double a,b;
        int  c;
do{
    System.out.println("1:hacer divicion");
    System.out.println("0:cerrar programa");
    c=option.nextInt();
    if (c==1) {
        
    
         System.out.println("ingresa 1 numero entero");

         a=option.nextInt();

         System.out.println("ingresa otro numero entero");

         b=option.nextInt();

         System.out.print("el resultado es: ");
         System.out.println(a/b);
}
           }while( c>0);
        }
}