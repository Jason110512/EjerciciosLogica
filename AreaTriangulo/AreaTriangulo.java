import java.util.Scanner;
class AreaTriangulo{   
    public static void main (String [] args){
        Scanner option = new Scanner(System.in);
        float a,b; 
        int c;
do{
    System.out.println("1:calcular el area del triangulo");
    System.out.println("0:cerrar programa");
    c=option.nextInt();
    if (c==1) {
        
    
         System.out.println("ingresa el valor de la base");

         a=option.nextInt();
         System.out.println("ingresa el valor de la altura");

         b=option.nextInt();

         System.out.print("el resultado es: ");
         System.out.println((a*b)/2);
    }
           }while( c>0);
        }
}
