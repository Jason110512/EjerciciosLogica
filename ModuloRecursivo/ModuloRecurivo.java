import java.util.Scanner;
class Modulo {   
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        float a,b,c;
do{
        System.out.println("1: modulo");
        System.out.println("0:cerrar programa");
            c=option.nextInt();
            if (c==1) {
                
            
         System.out.println("ingresa 1 numero entero");

         a=option.nextInt();

         System.out.println("ingresa otro numero entero");

         b=option.nextInt();

         System.out.println("el resultado es: ");
         System.out.print(a%b);
            }
        }while (c>0);
    }
}