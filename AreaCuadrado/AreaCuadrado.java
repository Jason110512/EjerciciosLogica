import java.util.Scanner;
class AreaCuadrado {   
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        int a,c;
do{
    System.out.println("1:calcular el area ");
    System.out.println("0:cerrar programa");
    c=option.nextInt();
    if(c==1) {
        
    
         System.out.println("ingresa el valor del lado");

         a=option.nextInt();

         System.out.print("el resultado es: ");
         System.out.println(a*a);
           }
        }while( c>0);  
        }
}
