import java.util.Scanner;
class AreaCuadrado {   
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        int c;
        double z=3.1416,a;
do{
    System.out.println("1:calcular el area ");
    System.out.println("0:cerrar programa");
    c=option.nextInt();
         System.out.println("ingresa el valor del radio");
         a=option.nextInt();

         System.out.print("el resultado es: ");
         System.out.println((a*a)*z
         );
           }while( c>0);
        }
}



